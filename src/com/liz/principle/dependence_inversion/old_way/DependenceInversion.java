package com.liz.principle.dependence_inversion.old_way;

public class DependenceInversion {
    public static void main(String[] args) {
        Person person=new Person();
        person.receive(new Email());
    }
}
