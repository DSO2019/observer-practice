package mx.iteso;

import java.util.ArrayList;
import java.util.Observer;

public class GrupoDisenoSoftware implements Subject {
	private final ArrayList observers;
	private String messages;
	
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
	            observer.getMessage(this.messages);
	        }
		
	}

	 public void setMessage( String messages){
	       this.messages= messages;
	       notifyObservers();
	    }


}
