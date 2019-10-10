package mx.iteso;

public class GrupoDisenoSoftware implements Subject {
    private final ArrayList observers;
    ArrayList<String> messages;
    String message;


    public GrupoDisenoSoftware(){
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
            Observer observer = (Observer) observer1;
            observer.messageUpdate(this.message);
        }
    }



    public void setMessage( String message){
        this.message = message;
        notifyObservers();
    }

