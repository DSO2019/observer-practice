package mx.iteso;

import java.util.ArrayList;

public class GrupoDisenoSoftware {
    public final ArrayList<Observer> observerArray;
    public String mensaje;

    public GrupoDisenoSoftware(){
        this.observerArray = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observerArray.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerArray.remove(observer);
    }

    public void notifyObservers() {
        for(Object observerTemp : observerArray)
        {
            Observer observer = (Observer) observerTemp;
            observer.getMessage(this.mensaje);
        }
    }

    public void addMessage(String msn){
        this.mensaje = msn;
        notifyObservers();
    }
}
