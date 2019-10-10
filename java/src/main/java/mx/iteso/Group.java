package mx.iteso;

import java.util.ArrayList;

public class Group implements Subject {
    private ArrayList<Observer> observers;
    private  String message;
    public String groupName = "";

    public Group(String groupName) {
        observers = new ArrayList<Observer>();
        this.groupName = groupName;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observers.indexOf(observer));
    }

    public void notifyObservers() {
        for (Object observer1 : observers) {
            Observer observer = (Observer) observer1;
            observer.receiveMessage(this.message);
        }
    }
    public void broadcastMessage(String msg) {
        this.message = msg;
        notifyObservers();
    }
}