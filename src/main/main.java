package main;
import java.io.*; 
import lexer.*;
import parser.*;

public class main {

	public static void main(String[] args) throws IOException {
		Lexer lex = new Lexer();
		// 能正常工作但是词法分析器不知道为什么不行
		Parser parse = new Parser(lex);
		parse.program();
		System.out.write('\n');
	}
}
