package mx.iteso;

import java.util.ArrayList;
import java.util.List;

public class WhatsappDSO implements Subject{
    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX= new Object();

    public WhatsappDSO(){
        observers = new ArrayList<Observer>();
    }

    @Override
	public void registerObserver(Observer obj) {
		if(obj == null) throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
		    if(!observers.contains(obj)){
                observers.add(obj);
            } 
		}
	}

	@Override
	public void unregisterObserver(Observer obj) {
		synchronized (MUTEX) {
		    observers.remove(obj);
		}
    }
    
    @Override
	public void notifyObservers() {
		List<Observer> observersLocal = null;
		//synchronization is used to make sure any observer registered after message is received is not notified
		synchronized (MUTEX) {
			if (!changed){
				return;
            }
			observersLocal = new ArrayList<>(this.observers);
			this.changed=false;
		}
		for (Observer obj : observersLocal) {
			obj.update();
		}

	}
    
    @Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}
    
	public void postMessage(String msg){
		System.out.println("Message Posted to Topic:"+msg);
		this.message=msg;
		this.changed=true;
		notifyObservers();
	}
}
