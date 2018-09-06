package de.openhpi.capstone1.observer;

public abstract class Observer {
	public Observer(Subject subject) {
		subject.attach(this);
	}
	
	public abstract void update();
}
