package com.liz.GOF23.mediator.colleague;

import com.liz.GOF23.mediator.mediator.Mediator;

//抽象同事类
public abstract class Colleague {
	private Mediator mediator;
	public String name;

	public Colleague(Mediator mediator, String name) {

		this.mediator = mediator;
		this.name = name;

	}

	public Mediator GetMediator() {
		return this.mediator;
	}

	public abstract void SendMessage(int stateChange);
}
