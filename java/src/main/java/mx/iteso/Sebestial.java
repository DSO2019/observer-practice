package mx.iteso;

import java.util.ArrayList;

public class Sebestial implements Usuario {
    ArrayList<String> messages = new ArrayList<String>();

    public void getMessage(String message){
        messages.add(message);
    }

    public boolean readMessagesAndClear(){
        if(messages.isEmpty())
            return false;
        else{
            int temp = 0;
            while( temp < messages.size()){
                System.out.println(messages.get(temp));
                temp++;
            }
            messages.removeAll(messages);
            return true;
        }
    }
    public boolean readMessagesAndKeep(){
        if(messages.isEmpty())
            return false;
        else{
            int temp = 0;
            while( temp < messages.size()){
                System.out.println(messages.get(temp));
                temp++;
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
