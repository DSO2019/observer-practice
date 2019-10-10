  
package mx.iteso;
/**
 * User: Alfredo Rodriguez
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}