package mx.iteso;

public class newsStation {
    public static void main( String[] args ){
        GrupoDisenoSoftware grupoDisenoSoftware;
        grupoDisenoSoftware = new GrupoDisenoSoftware();

        RodrigoVillalobos rodrigo = new RodrigoVillalobos();
        RodrigoVillalobos sebastian = new RodrigoVillalobos();
        RodrigoVillalobos arturo = new RodrigoVillalobos();
        RodrigoVillalobos capas = new RodrigoVillalobos();
        RodrigoVillalobos banano = new RodrigoVillalobos();


        // Registro de usuarios
        grupoDisenoSoftware.registerObserver(rodrigo);
        grupoDisenoSoftware.registerObserver(sebastian);
        grupoDisenoSoftware.registerObserver(arturo);
        grupoDisenoSoftware.registerObserver(capas);
        grupoDisenoSoftware.registerObserver(banano);


        // Mensaje inicial para todos
        grupoDisenoSoftware.sendMessage("Hi");

        // Todos leen el mensaje
        rodrigo.readMessagesAndKeep();
        sebastian.readMessagesAndKeep();
        arturo.readMessagesAndKeep();
        capas.readMessagesAndKeep();
        banano.readMessagesAndKeep();



        // Limpiar mensajes mantenidos
        rodrigo.clearMessages();
        sebastian.clearMessages();
        arturo.clearMessages();
        capas.clearMessages();
        banano.clearMessages();


        // Enviar mensajes consecutivos
        grupoDisenoSoftware.sendMessage("Saludos");
        grupoDisenoSoftware.sendMessage("xd");
        grupoDisenoSoftware.sendMessage("Adiós");

        // Leer mensajes y limpiarlos
        rodrigo.readMessagesAndClear();
        sebastian.readMessagesAndClear();
        arturo.readMessagesAndClear();
        capas.readMessagesAndClear();
        banano.readMessagesAndClear();


        // Quitar a usuario suscrito
        grupoDisenoSoftware.removeObserver(rodrigo);

        // Enviar mensaje nuevo a observers restantes
        grupoDisenoSoftware.sendMessage("Sacaremos al profe");

        // Todos leen mensaje y lo mantienen pero un usuario no lo puede leer porque no está suscrito
        rodrigo.readMessagesAndClear();
        sebastian.readMessagesAndClear();
        arturo.readMessagesAndClear();
        capas.readMessagesAndClear();
        banano.readMessagesAndClear();



    }
}
