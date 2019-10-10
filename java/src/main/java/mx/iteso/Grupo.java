package mx.iteso;

public interface Grupo {
    void registrarUsuario(Usuario usuario);
    void removerUsuario(Usuario usuario);
    void notificarUsuarios();
    void escribirMensaje(String message);
}
