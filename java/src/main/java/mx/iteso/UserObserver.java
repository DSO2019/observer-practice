package mx.iteso;

import java.util.ArrayList;
import mx.iteso.Observer;

public class UserObserver implements Observer{
    ArrayList<String> messages;
    String name;
    public void getMessage(String message){
        messages.add(message);
    }

    public UserObserver(String name){
        this.name = name;
        this.messages = new ArrayList<>();
    }

    public boolean readMessagesAndClear(){
        System.out.println("User " + this.name.toUpperCase() + " reading: ");
        if(messages.isEmpty())
            return false;
        else{
            while(messages.size() > 0){
                System.out.println(messages.get(messages.size() - 1));
                messages.remove(messages.size() - 1);
            }
            return true;
        }
    }
    public boolean readMessagesAndKeep(){
        System.out.println("User" + this.name.toUpperCase() + "reading: ");
        if(messages.isEmpty())
            return false;
        else{
            int temp = messages.size() - 1;
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
                messages.remove(messages.size() - 1);
            }
            return true;
        }
    }

}
