package com.liz.GOF23.Interpreter.symbol;

import com.liz.GOF23.Interpreter.Expression;

import java.util.HashMap;

/**
 * 加法解释器
 * */
public class AddExpression extends SymbolExpression {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	//处理相加的逻辑
	//var 是一个集合{a=10,b=20}
	public int interpreter(HashMap<String, Integer> var) {
		//调用的是VarExpression中的方法
		//super.left.interpreter(var) => 返回left表达式对应的值 10
		//super.right.interpreter(var) => 返回right表达式对应的值 20
		//然后进行相加
		return super.left.interpreter(var) + super.right.interpreter(var);
	}
}
