package mx.iteso;

import java.util.ArrayList;

public class RodrigoVillalobos implements Observer {
    ArrayList<String> messages;
    String message;

    public RodrigoVillalobos() {
        this.messages = new ArrayList<String>();
    }

    public void messageUpdate(String message){
        this.messages.add(message);
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
            int temp = messages.size();
            while( temp > 0){
                System.out.println(messages.get(temp));
                temp = temp - 1;
            }
            return true;
        }
    }

    public boolean clearMessages(){
        if(messages.isEmpty())
            return false;
        else{
            while(messages.size() > 0){
                messages.remove(messages.size());
            }
            return true;
        }
    }

}
