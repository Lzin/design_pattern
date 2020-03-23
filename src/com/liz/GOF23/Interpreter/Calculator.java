package com.liz.GOF23.Interpreter;

import com.liz.GOF23.Interpreter.symbol.SubExpression;
import com.liz.GOF23.Interpreter.symbol.AddExpression;
import com.liz.GOF23.Interpreter.var.VarExpression;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
    // 定义表达式
    private Expression expression;

    // 构造函数传参，并解析
    //运算表达式相当于以操作符为根的中序遍历树，操作数和操作符不停进行弹栈入栈
    public Calculator(String expStr) {// expStr = a+b
        // 安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        //表达式拆分成为字符数组
        char[] charArray = expStr.toCharArray();//[a,+,b]

        Expression left = null;
        Expression right = null;
        for (int i = 0; i < charArray.length; i++) {
            /**
             * 检测到了符号位 则符号为基准进行弹栈入栈
             * //将所有的数据符号进行分类
             * */
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();//a
                    right = new VarExpression(String.valueOf(charArray[++i]));//b
                    stack.push(new AddExpression(left, right));//a+b
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    //将字母转化为字符串 构建为VarExpression，并压入栈中
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        //扫描完毕之后 生成结果表达式
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        //最后将表达式a+b 和 var{a=10,b=20} 绑定
        //然后传递给expression中的interpreter进行解释执行
        return this.expression.interpreter(var);
    }
}
