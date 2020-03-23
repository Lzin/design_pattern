package com.liz.principle.open_close_inversion;


// OCP 对扩展开放（提供方），对修改关闭（使用方），即当我们给类增加新的方法时，尽量不修改代码，或者尽可能少修改代码。做到新增代码

public class Text {
    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Rectangle());
        editor.drawShape(new Circle());
        editor.drawShape(new Triangle());
    }
}
