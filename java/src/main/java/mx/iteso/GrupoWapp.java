package mx.iteso;


public class GrupoWapp {
    public static void main (String[] args){
        GrupoDisenoSoftware grupo;
        grupo = new GrupoDisenoSoftware();

        //Creación de usuarios
        RodrigoVillalobos Felipe = new RodrigoVillalobos();
        RodrigoVillalobos Luis = new RodrigoVillalobos();
        RodrigoVillalobos Bernardo = new RodrigoVillalobos();

        //Se añaden los usuarios del grupo
        grupo.registerObserver(Felipe);
        grupo.registerObserver(Luis);
        grupo.registerObserver(Bernardo);

        //envío de mensajes
        grupo.sendMensaje("Que onda");
        grupo.sendMensaje("Como están?");

        //lectura de Mensajes
        Bernardo.readMessagesAndKeep();
        Luis.readMessagesAndKeep();
        Felipe.readMessagesAndClear();

        //Eliminación de mensajes que siguen en buzón
        Bernardo.clearMessages();
        Luis.clearMessages();

        //eliminación de usuarios
        grupo.removeObserver(Felipe);

    }
}
