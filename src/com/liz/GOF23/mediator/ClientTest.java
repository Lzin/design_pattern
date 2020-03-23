package com.liz.GOF23.mediator;

import com.liz.GOF23.mediator.colleague.Alarm;
import com.liz.GOF23.mediator.colleague.CoffeeMachine;
import com.liz.GOF23.mediator.colleague.Curtains;
import com.liz.GOF23.mediator.colleague.TV;
import com.liz.GOF23.mediator.mediator.ConcreteMediator;
import com.liz.GOF23.mediator.mediator.Mediator;

public class ClientTest {

	public static void main(String[] args) {
		//创建一个中介者对象
		Mediator mediator = new ConcreteMediator();

		//创建Alarm 并且加入到  ConcreteMediator 对象的HashMap
		Alarm alarm = new Alarm(mediator, "alarm");

		//创建了CoffeeMachine 对象，并  且加入到  ConcreteMediator 对象的HashMap
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,
				"coffeeMachine");

		//创建 Curtains , 并  且加入到  ConcreteMediator 对象的HashMap
		Curtains curtains = new Curtains(mediator, "curtains");
		TV tV = new TV(mediator, "TV");

		//让闹钟发出消息(最终在中介者中对消息进行处理 getMessage)
		alarm.SendAlarm(0);
		coffeeMachine.FinishCoffee();
		alarm.SendAlarm(1);
	}


}
