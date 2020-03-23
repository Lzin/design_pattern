package com.liz.GOF23.Interpreter;

import java.util.HashMap;

/**
 * 抽象类的表达式，通过HashMap的键值对，可以获取到各个变量的值
 * */
public abstract class Expression {

	//解释公式和数值，key就是公式（表达式）参数[a,b,c],val就是具体的值
	//HashMap  {a = 10 , b = 20}
	public abstract int interpreter(HashMap<String, Integer> var);
}
