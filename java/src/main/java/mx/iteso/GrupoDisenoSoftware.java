package mx.iteso;

import mx.iteso.Subject;
import mx.iteso.Observer;

import java.util.ArrayList;

public class GrupoDisenoSoftware implements Subject {

    private final ArrayList<Observer> observers;
    private String user;
    private String message;

    public GrupoDisenoSoftware(){
        observers = new ArrayList<Observer>();
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
            observer.getMessage(this.user,this.message);
        }
    }

    public void setMessage(String message){
        this.message = message;
        notifyObservers();
    }

}
