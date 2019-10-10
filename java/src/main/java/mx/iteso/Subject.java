package mx.iteso;

public interface GrupoDisenoSoftware {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

