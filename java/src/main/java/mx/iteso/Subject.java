package mx.iteso;

import mx.iteso.Observer;

/**
 * Interfaz para mandar mensajes.
 *
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
