package mx.iteso;

public class ObserverTest {

	public static void main(String[] args) {
		//Subject
		WhatsappDSO group = new WhatsappDSO();
		
		//Observers
		Subscriber bernardo = new Subscriber("Bernardo");
		Subscriber luis = new Subscriber("Luis");
		Subscriber felipe = new Subscriber("Felipe");
		
		//Registering observers to subject
		group.registerObserver(bernardo);
		group.registerObserver(luis);
		group.registerObserver(felipe);
		
		//Attaching observer to subject
		bernardo.setSubject(group);
		luis.setSubject(group);
		felipe.setSubject(group);
				
		//Messages
		group.postMessage("Como");
		group.postMessage("dicen");
		group.postMessage("en");
		group.postMessage("las");
		group.postMessage("pi�atas:");
		group.postMessage("�Ya le diste tres!");
		group.postMessage("�Y tu tiempo se acab�!");
		
		
		//Methods of subscriber
		bernardo.readMessagesAndKeep();
		bernardo.clearMessages();
		bernardo.readMessagesAndKeep();
	}

}