// Generated from /home/leonardo/Waifu/dungeon/src/t3/dungeon.g4 by ANTLR 4.5.3
package t3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dungeonParser}.
 */
public interface dungeonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dungeonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(dungeonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(dungeonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(dungeonParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(dungeonParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(dungeonParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(dungeonParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(dungeonParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(dungeonParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#visible}.
	 * @param ctx the parse tree
	 */
	void enterVisible(dungeonParser.VisibleContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#visible}.
	 * @param ctx the parse tree
	 */
	void exitVisible(dungeonParser.VisibleContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(dungeonParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(dungeonParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#vars_object}.
	 * @param ctx the parse tree
	 */
	void enterVars_object(dungeonParser.Vars_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#vars_object}.
	 * @param ctx the parse tree
	 */
	void exitVars_object(dungeonParser.Vars_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#vars_room}.
	 * @param ctx the parse tree
	 */
	void enterVars_room(dungeonParser.Vars_roomContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#vars_room}.
	 * @param ctx the parse tree
	 */
	void exitVars_room(dungeonParser.Vars_roomContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#open}.
	 * @param ctx the parse tree
	 */
	void enterOpen(dungeonParser.OpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#open}.
	 * @param ctx the parse tree
	 */
	void exitOpen(dungeonParser.OpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#get}.
	 * @param ctx the parse tree
	 */
	void enterGet(dungeonParser.GetContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#get}.
	 * @param ctx the parse tree
	 */
	void exitGet(dungeonParser.GetContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#drop}.
	 * @param ctx the parse tree
	 */
	void enterDrop(dungeonParser.DropContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#drop}.
	 * @param ctx the parse tree
	 */
	void exitDrop(dungeonParser.DropContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#events}.
	 * @param ctx the parse tree
	 */
	void enterEvents(dungeonParser.EventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#events}.
	 * @param ctx the parse tree
	 */
	void exitEvents(dungeonParser.EventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#object_body}.
	 * @param ctx the parse tree
	 */
	void enterObject_body(dungeonParser.Object_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#object_body}.
	 * @param ctx the parse tree
	 */
	void exitObject_body(dungeonParser.Object_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(dungeonParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(dungeonParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#moves}.
	 * @param ctx the parse tree
	 */
	void enterMoves(dungeonParser.MovesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#moves}.
	 * @param ctx the parse tree
	 */
	void exitMoves(dungeonParser.MovesContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#locked}.
	 * @param ctx the parse tree
	 */
	void enterLocked(dungeonParser.LockedContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#locked}.
	 * @param ctx the parse tree
	 */
	void exitLocked(dungeonParser.LockedContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#north}.
	 * @param ctx the parse tree
	 */
	void enterNorth(dungeonParser.NorthContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#north}.
	 * @param ctx the parse tree
	 */
	void exitNorth(dungeonParser.NorthContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#south}.
	 * @param ctx the parse tree
	 */
	void enterSouth(dungeonParser.SouthContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#south}.
	 * @param ctx the parse tree
	 */
	void exitSouth(dungeonParser.SouthContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#east}.
	 * @param ctx the parse tree
	 */
	void enterEast(dungeonParser.EastContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#east}.
	 * @param ctx the parse tree
	 */
	void exitEast(dungeonParser.EastContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#west}.
	 * @param ctx the parse tree
	 */
	void enterWest(dungeonParser.WestContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#west}.
	 * @param ctx the parse tree
	 */
	void exitWest(dungeonParser.WestContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#objects}.
	 * @param ctx the parse tree
	 */
	void enterObjects(dungeonParser.ObjectsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#objects}.
	 * @param ctx the parse tree
	 */
	void exitObjects(dungeonParser.ObjectsContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#room_body}.
	 * @param ctx the parse tree
	 */
	void enterRoom_body(dungeonParser.Room_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#room_body}.
	 * @param ctx the parse tree
	 */
	void exitRoom_body(dungeonParser.Room_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dungeonParser#room}.
	 * @param ctx the parse tree
	 */
	void enterRoom(dungeonParser.RoomContext ctx);
	/**
	 * Exit a parse tree produced by {@link dungeonParser#room}.
	 * @param ctx the parse tree
	 */
	void exitRoom(dungeonParser.RoomContext ctx);
}