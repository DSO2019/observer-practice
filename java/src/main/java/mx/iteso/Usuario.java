package mx.iteso;

public interface Usuario {
    public void getMessage(String message);

    public boolean readMessagesAndClear();

    public boolean readMessagesAndKeep();

    public boolean clearMessages();
}
