grammar dungeon;

@members {
    public static String grupo="<<552003, 551953, 573671, 489026>>";
}

/* */

fragment
Digit : '0'..'9';

fragment
Letter : 'a'..'z'|'A'..'Z';

FLOAT : (Digit)+ '.' (Digit)+;
INT : (Digit)+;

IDENT : (Letter)+ (Letter|Digit|'_')*;

WHITE_SPACE : (' '|'\t'|'\r'|'\n'|'\f')+ {skip();};

STRING : '"' ~('\r'|'\n'|'"')*  '"' | '\'' ~('\r'|'\n'|'\'')*  '\'';

COMMENTARY : '#' ~('\r'|'\n')* {skip();} ;

// Gramática

program: object* room*;

value: STRING | INT | FLOAT;

name: 'name' ':' value;

description: 'description' ':' value;

visible: 'visible' ':' value ;

empty: 'empty' ':' value;

vars_object: name? description? visible? empty?;

vars_room: name? description?;

open: 'open' ':' IDENT;

get: 'get';

drop: 'drop';

events: open? get? drop?;

object_body: vars_object 'events: {' events '}';

object: 'object' IDENT '{' object_body '}';

moves: north? south? east? west?;

locked: '!';

north: 'north:' locked? IDENT;

south: 'south:' locked? IDENT;

east: 'east:' locked? IDENT;

west: 'west:' locked? IDENT;

objects: id1=IDENT (',' id2=IDENT)*;

room_body: vars_room 'moves: {' moves '}' 'objects: {' objects? '}';

room: 'room' IDENT '{' room_body '}';