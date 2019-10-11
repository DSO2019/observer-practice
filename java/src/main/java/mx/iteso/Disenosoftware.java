package mx.iteso;

import java.util.ArrayList;

public class Disenosoftware implements Subject{
    
    private final ArrayList observers;
    String mensaje;
    
    public Disenosoftware(){
        observers = new ArrayList();
    }


    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observers.indexOf(observer));
    }


    public void notifyObservers() {
        for (Object observer1 : observers) {
            Observer observer = (Observer)observer1;
            observer.getMessage(this.mensaje);
        }
    }

    public void sendMessage(String message){
        this.mensaje = message;
        notifyObservers();
    }
}
