package com.liz.GOF23.memento.origin;

public class Memento {
    private String state;
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
