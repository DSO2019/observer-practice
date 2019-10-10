package mx.iteso;
import java.util.Observer;

public interface Subject {
	    void registerObserver(Observer observer);
	    void removeObserver(Observer observer);
	    void notifyObservers();

}
