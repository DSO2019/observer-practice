package mx.iteso;

import java.util.ArrayList;

public class GrupoDisenoSoftware implements Subject {
    private final ArrayList<Observer> observers;
    private String mensaje;

    public GrupoDisenoSoftware (){

        this.observers = new ArrayList<Observer>();
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
            observer.getMessage(this.mensaje);
        }
    }

    public void sendMensaje (String mensaje){
        this.mensaje = mensaje;
        notifyObservers();
    }
}
