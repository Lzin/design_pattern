package com.liz.GOF23.Interpreter.var;

import com.liz.GOF23.Interpreter.Expression;

import java.util.HashMap;

/**
 * 变量的解析器: 获取hashmap中的值
 * */
public class VarExpression extends Expression {

	private String key; 

	public VarExpression(String key) {
		this.key = key;
	}

	//获取hashmap中的值
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}
}
