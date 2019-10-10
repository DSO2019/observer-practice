package mx.iteso;

import java.util.ArrayList;

public class Subscriber implements Observer {
    String name;
    Subject group;
    ArrayList<String> messages;

    public Subscriber(String name){
        this.name = name;
        messages = new ArrayList<String>();
    }

    public void getMessage(String message){
        messages.add(message);
    }

    public boolean readMessagesAndClear(){
        if(messages.isEmpty())
            return false;
        else{
            while(messages.size() > 0){
                System.out.println(messages.get(messages.size()));
                messages.remove(messages.size());
            }
            return true;
        }
    }
    public boolean readMessagesAndKeep(){
        if(messages.isEmpty())
            return false;
        else{
            int temp = messages.size() - 1;
            while( temp >= 0){
                System.out.println(messages.get(temp));
                temp -= 1;
            }
            return true;
        }
    }
    public boolean clearMessages(){
        if(messages.isEmpty())
            return false;
        else{
            while(messages.size() > 0){
                messages.remove(messages.size() - 1);
            }
            return true;
        }
    }

	@Override
	public void update() {
		String msg = (String) group.getUpdate(this);
		if(msg == null){
			System.out.println(name + ":: No new message");
		}else
		messages.add(msg);
		System.out.println(name+":: Consuming message::"+msg);
	}
	
	@Override
	public void setSubject(Subject sub) {
		this.group = sub;
	}

}
