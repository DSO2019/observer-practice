//package mx.iteso;
import java.util.ArrayList;


public class GrupoDisenoSoftware implements Subject {
    private final ArrayList observers;
    private String message;

    public GrupoDisenoSoftware(){
        observers = new ArrayList();
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observers.indexOf(observer));
    }

    public void notifyObservers(){
        for (Object observer1 : observers) {
            Observer observer = (Observer) observer1;
            observer.getMessage(this.message);
        }
    }

    public void sendMessage(String msg){
        this.message = msg;
        notifyObservers();
    }
}
