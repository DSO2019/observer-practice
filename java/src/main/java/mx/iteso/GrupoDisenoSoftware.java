package mx.iteso;

import java.util.ArrayList;

public class GrupoDisenoSoftware implements Subject
{
    private ArrayList<Observer> observers;
    public String message;

    public GrupoDisenoSoftware()
    {
        observers = new ArrayList<Observer>();
    }

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
        observers.remove(observer);
	}

	public void notifyObservers() {
        for(Observer observer : observers)
        {
            observer.getMessage(message);
        }
	}
}