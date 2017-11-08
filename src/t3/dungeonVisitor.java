// Generated from /home/leonardo/Waifu/dungeon/src/t3/dungeon.g4 by ANTLR 4.5.3
package t3;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dungeonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dungeonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link dungeonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(dungeonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(dungeonParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(dungeonParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(dungeonParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#visible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisible(dungeonParser.VisibleContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(dungeonParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#vars_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars_object(dungeonParser.Vars_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#vars_room}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars_room(dungeonParser.Vars_roomContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#open}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen(dungeonParser.OpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#get}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet(dungeonParser.GetContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop(dungeonParser.DropContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#events}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvents(dungeonParser.EventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#object_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_body(dungeonParser.Object_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(dungeonParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#moves}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoves(dungeonParser.MovesContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#locked}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocked(dungeonParser.LockedContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#north}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNorth(dungeonParser.NorthContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#south}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSouth(dungeonParser.SouthContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#east}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEast(dungeonParser.EastContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#west}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWest(dungeonParser.WestContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#objects}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjects(dungeonParser.ObjectsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#room_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoom_body(dungeonParser.Room_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dungeonParser#room}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoom(dungeonParser.RoomContext ctx);
}