// Generated from /home/leonardo/Waifu/dungeon/src/t3/dungeon.g4 by ANTLR 4.5.3
package t3;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dungeonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, FLOAT=22, INT=23, IDENT=24, WHITE_SPACE=25, 
		STRING=26, COMMENTARY=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "Digit", "Letter", "FLOAT", "INT", 
		"IDENT", "WHITE_SPACE", "STRING", "COMMENTARY"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'name'", "':'", "'description'", "'visible'", "'empty'", "'open'", 
		"'get'", "'drop'", "'events: {'", "'}'", "'object'", "'{'", "'!'", "'north:'", 
		"'south:'", "'east:'", "'west:'", "','", "'moves: {'", "'objects: {'", 
		"'room'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "FLOAT", "INT", 
		"IDENT", "WHITE_SPACE", "STRING", "COMMENTARY"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    public static String grupo="<<552003, 551953, 573671, 489026>>";


	public dungeonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "dungeon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 26:
			WHITE_SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			COMMENTARY_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WHITE_SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void COMMENTARY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00fb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\6\31\u00be\n\31\r\31\16\31\u00bf\3\31\3\31\6\31\u00c4\n\31\r\31\16\31"+
		"\u00c5\3\32\6\32\u00c9\n\32\r\32\16\32\u00ca\3\33\6\33\u00ce\n\33\r\33"+
		"\16\33\u00cf\3\33\3\33\3\33\7\33\u00d5\n\33\f\33\16\33\u00d8\13\33\3\34"+
		"\6\34\u00db\n\34\r\34\16\34\u00dc\3\34\3\34\3\35\3\35\7\35\u00e3\n\35"+
		"\f\35\16\35\u00e6\13\35\3\35\3\35\3\35\7\35\u00eb\n\35\f\35\16\35\u00ee"+
		"\13\35\3\35\5\35\u00f1\n\35\3\36\3\36\7\36\u00f5\n\36\f\36\16\36\u00f8"+
		"\13\36\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\61\30\63"+
		"\31\65\32\67\339\34;\35\3\2\7\4\2C\\c|\5\2\13\f\16\17\"\"\5\2\f\f\17\17"+
		"$$\5\2\f\f\17\17))\4\2\f\f\17\17\u0104\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5B\3\2\2\2\7D\3\2\2\2\tP\3\2\2\2\13"+
		"X\3\2\2\2\r^\3\2\2\2\17c\3\2\2\2\21g\3\2\2\2\23l\3\2\2\2\25v\3\2\2\2\27"+
		"x\3\2\2\2\31\177\3\2\2\2\33\u0081\3\2\2\2\35\u0083\3\2\2\2\37\u008a\3"+
		"\2\2\2!\u0091\3\2\2\2#\u0097\3\2\2\2%\u009d\3\2\2\2\'\u009f\3\2\2\2)\u00a8"+
		"\3\2\2\2+\u00b3\3\2\2\2-\u00b8\3\2\2\2/\u00ba\3\2\2\2\61\u00bd\3\2\2\2"+
		"\63\u00c8\3\2\2\2\65\u00cd\3\2\2\2\67\u00da\3\2\2\29\u00f0\3\2\2\2;\u00f2"+
		"\3\2\2\2=>\7p\2\2>?\7c\2\2?@\7o\2\2@A\7g\2\2A\4\3\2\2\2BC\7<\2\2C\6\3"+
		"\2\2\2DE\7f\2\2EF\7g\2\2FG\7u\2\2GH\7e\2\2HI\7t\2\2IJ\7k\2\2JK\7r\2\2"+
		"KL\7v\2\2LM\7k\2\2MN\7q\2\2NO\7p\2\2O\b\3\2\2\2PQ\7x\2\2QR\7k\2\2RS\7"+
		"u\2\2ST\7k\2\2TU\7d\2\2UV\7n\2\2VW\7g\2\2W\n\3\2\2\2XY\7g\2\2YZ\7o\2\2"+
		"Z[\7r\2\2[\\\7v\2\2\\]\7{\2\2]\f\3\2\2\2^_\7q\2\2_`\7r\2\2`a\7g\2\2ab"+
		"\7p\2\2b\16\3\2\2\2cd\7i\2\2de\7g\2\2ef\7v\2\2f\20\3\2\2\2gh\7f\2\2hi"+
		"\7t\2\2ij\7q\2\2jk\7r\2\2k\22\3\2\2\2lm\7g\2\2mn\7x\2\2no\7g\2\2op\7p"+
		"\2\2pq\7v\2\2qr\7u\2\2rs\7<\2\2st\7\"\2\2tu\7}\2\2u\24\3\2\2\2vw\7\177"+
		"\2\2w\26\3\2\2\2xy\7q\2\2yz\7d\2\2z{\7l\2\2{|\7g\2\2|}\7e\2\2}~\7v\2\2"+
		"~\30\3\2\2\2\177\u0080\7}\2\2\u0080\32\3\2\2\2\u0081\u0082\7#\2\2\u0082"+
		"\34\3\2\2\2\u0083\u0084\7p\2\2\u0084\u0085\7q\2\2\u0085\u0086\7t\2\2\u0086"+
		"\u0087\7v\2\2\u0087\u0088\7j\2\2\u0088\u0089\7<\2\2\u0089\36\3\2\2\2\u008a"+
		"\u008b\7u\2\2\u008b\u008c\7q\2\2\u008c\u008d\7w\2\2\u008d\u008e\7v\2\2"+
		"\u008e\u008f\7j\2\2\u008f\u0090\7<\2\2\u0090 \3\2\2\2\u0091\u0092\7g\2"+
		"\2\u0092\u0093\7c\2\2\u0093\u0094\7u\2\2\u0094\u0095\7v\2\2\u0095\u0096"+
		"\7<\2\2\u0096\"\3\2\2\2\u0097\u0098\7y\2\2\u0098\u0099\7g\2\2\u0099\u009a"+
		"\7u\2\2\u009a\u009b\7v\2\2\u009b\u009c\7<\2\2\u009c$\3\2\2\2\u009d\u009e"+
		"\7.\2\2\u009e&\3\2\2\2\u009f\u00a0\7o\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2"+
		"\7x\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7<\2\2\u00a5"+
		"\u00a6\7\"\2\2\u00a6\u00a7\7}\2\2\u00a7(\3\2\2\2\u00a8\u00a9\7q\2\2\u00a9"+
		"\u00aa\7d\2\2\u00aa\u00ab\7l\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7e\2\2"+
		"\u00ad\u00ae\7v\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7<\2\2\u00b0\u00b1"+
		"\7\"\2\2\u00b1\u00b2\7}\2\2\u00b2*\3\2\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5"+
		"\7q\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7o\2\2\u00b7,\3\2\2\2\u00b8\u00b9"+
		"\4\62;\2\u00b9.\3\2\2\2\u00ba\u00bb\t\2\2\2\u00bb\60\3\2\2\2\u00bc\u00be"+
		"\5-\27\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\7\60\2\2\u00c2\u00c4\5"+
		"-\27\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\62\3\2\2\2\u00c7\u00c9\5-\27\2\u00c8\u00c7\3\2\2"+
		"\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\64"+
		"\3\2\2\2\u00cc\u00ce\5/\30\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d6\3\2\2\2\u00d1\u00d5\5/"+
		"\30\2\u00d2\u00d5\5-\27\2\u00d3\u00d5\7a\2\2\u00d4\u00d1\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\66\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db"+
		"\t\3\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\b\34\2\2\u00df8\3\2\2\2"+
		"\u00e0\u00e4\7$\2\2\u00e1\u00e3\n\4\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00f1\7$\2\2\u00e8\u00ec\7)\2\2\u00e9\u00eb\n\5\2"+
		"\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\7)\2\2\u00f0"+
		"\u00e0\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f1:\3\2\2\2\u00f2\u00f6\7%\2\2\u00f3"+
		"\u00f5\n\6\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fa\b\36\3\2\u00fa<\3\2\2\2\16\2\u00bf\u00c5\u00ca\u00cf\u00d4\u00d6"+
		"\u00dc\u00e4\u00ec\u00f0\u00f6\4\3\34\2\3\36\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}