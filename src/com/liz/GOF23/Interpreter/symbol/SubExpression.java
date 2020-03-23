package com.liz.GOF23.Interpreter.symbol;

import com.liz.GOF23.Interpreter.Expression;
import com.liz.GOF23.Interpreter.symbol.SymbolExpression;

import java.util.HashMap;

public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}
	/**
	 * 处理减法的逻辑
	 * 取出left和right的值 然后进行相减
	 * */
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) - super.right.interpreter(var);
	}
}
