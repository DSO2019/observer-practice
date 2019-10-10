package mx.iteso;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Equipo3 equipo3 = new Equipo3();
        Arturo arturo = new Arturo();
        equipo3.registrarUsuario(arturo);
        Sebestial sebestial = new Sebestial();
        equipo3.registrarUsuario(sebestial);
        Capas capas = new Capas();
        equipo3.registrarUsuario(capas);
        Banano banano = new Banano();
        equipo3.registrarUsuario(banano);
        equipo3.escribirMensaje("hola");
        equipo3.escribirMensaje("hola2");
        System.out.println("Mensajes de Arturo:");
        arturo.readMessagesAndKeep();
        System.out.println("Mensajes del banano:");
        banano.readMessagesAndClear();
        System.out.println("Mensajes nuevos banano:");
        banano.readMessagesAndKeep();
        System.out.println("Mensajes de capas:");
        capas.readMessagesAndKeep();
        System.out.println("Mensajes de la bestia:");
        sebestial.readMessagesAndKeep();
        sebestial.clearMessages();
        System.out.println("Mensajes nuevos de la bestia:");
        sebestial.readMessagesAndKeep();
        System.out.println("Miembros: " + equipo3.usuarios.size());
        equipo3.removerUsuario(banano);
        System.out.println("Miembros: " + equipo3.usuarios.size());
    }
}
