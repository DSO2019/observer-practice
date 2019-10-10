package mx.iteso;

import java.util.ArrayList;

public class Equipo3 implements Grupo {
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    String mensaje;

    public void registrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        this.usuarios.remove(usuario);
    }

    public void notificarUsuarios() {
        for (Usuario usuario : usuarios) {
            usuario.getMessage(this.mensaje);
        }
    }

    public void escribirMensaje(String mensaje) {
        this.mensaje = mensaje;
        this.notificarUsuarios();
    }

}
