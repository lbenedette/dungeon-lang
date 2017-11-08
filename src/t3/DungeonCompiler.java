package t3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import java.util.Arrays;

public class DungeonCompiler {

    private static String RUN_FILE = "";
    private static String DIR_TESTS = "";

    public static void main(String args[]) throws IOException, RecognitionException {
        // Variável que define se o código deve ser executado como jogo
        boolean run = false;

        // Análise dos argumentos passados
        // java -jar dungeon_jar.jar -r filename.dng | -t test_directory
        if (args.length != 2) {
            System.out.println("Usage: java -jar dungeon.jar -r filename.dng | -t test_directory");
            return;

        } else if (args[0].equals("-r")) {
            RUN_FILE = args[1];
            run = true;

        } else if (args[0].equals("-t")) {
            DIR_TESTS = args[1];

        } else {
            System.out.println(args[0]+" flag inválida!");
            return;
        }

        // Executar o jogo gerado
        if (run) {
            File file = new File(RUN_FILE);

            System.out.println("Running");
            System.out.println(file.getName());
            System.out.println("\n");

            // Análise léxica/sintática
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(file));
            dungeonLexer lexer = new dungeonLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            dungeonParser parser = new dungeonParser(tokens);
            dungeonParser.ProgramContext context = parser.program();

            // Análise semântica gerando as listas de Rooms e Objects
            SemanticAnalyzer sa = new SemanticAnalyzer();
            sa.visitProgram(context);

            // Com as listas geradas é criado uma instância do jogo e iniciada
            DungeonCrawler game = new DungeonCrawler(sa.getObjects(), sa.getRooms());
            game.run();

        // Opção para análise léxica/sintática/semântica de arquivos
        } else {
            File test_directory = new File(DIR_TESTS);
            File[] tests = test_directory.listFiles();

            if(tests != null) {
                Arrays.sort(tests);

                for (File test : tests) {

                    System.out.println();
                    System.out.println(test.getName());
                    System.out.println("Análise léxica/sintática: \n");

                    ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(test));
                    dungeonLexer lexer = new dungeonLexer(input);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    dungeonParser parser = new dungeonParser(tokens);
                    dungeonParser.ProgramContext context = parser.program();

                    System.out.println("Analise Semantica: \n");

                    SemanticAnalyzer sa = new SemanticAnalyzer();
                    sa.visitProgram(context);
                }
            }
        }
    }
}
