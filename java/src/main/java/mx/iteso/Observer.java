package mx.iteso;

public interface Observer {
    void getMessage(String message);
    boolean readMessagesAndClear();
    boolean readMessagesAndKeep();
    boolean clearMessages();
}
