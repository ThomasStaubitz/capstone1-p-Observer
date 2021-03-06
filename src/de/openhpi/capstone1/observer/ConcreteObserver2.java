package de.openhpi.capstone1.observer;

public class ConcreteObserver2 extends Observer {

	ConcreteSubject subject;
	
	public ConcreteObserver2(Subject subject) {
		super(subject);
		this.subject = (ConcreteSubject)subject;
	}

	@Override
	public void update() {
		System.out.println("Observer2: " + subject.getValue());
	}
}
