package com.liz.GOF23.Interpreter.symbol;

import com.liz.GOF23.Interpreter.Expression;

import java.util.HashMap;

/**
 * 抽象运算符号解析器 这里，每个运算符号都只和自己左右两个数字有关系，
 * 但左右两个数字有可能也是一个解析的结果，无论何种类型，都是Expression类的实现类
 *
 *
 */
public class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	//SymbolExpression自己不实现 让其子类实现
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return 0;
	}
}
