import mx.iteso.GrupoDisenoSoftware;
import mx.iteso.RodrigoVillalobos;

class Groupo {
    public static void main( String[] args ){
        GrupoDisenoSoftware softwareDesign;
        softwareDesign = new GrupoDisenoSoftware();

        RodrigoVillalobos felipe = new RodrigoVillalobos();
        RodrigoVillalobos berna = new RodrigoVillalobos();

        /**
         *Se registran
          */
        softwareDesign.registerObserver(felipe);
        softwareDesign.registerObserver(berna);

        /**
         * Enviar mensajes
         */
        softwareDesign.sendMessage("Hola");
        softwareDesign.sendMessage("Si no responen los vamos a sacar");
        softwareDesign.sendMessage("Eres el elegido Felipe");
        /**
         * Leer mensajes y limpiarlos
         */
        felipe.readMessagesAndClear();
        berna.readMessagesAndClear();

        /**
         *Quitar a usuarios
         */
        softwareDesign.removeObserver(felipe);

        /**
         *
         Enviar mensaje con un observer que fue eliminado
          */
        softwareDesign.sendMessage("Adios felipe por ogt");
        berna.readMessagesAndClear();

        /**
         *El ultimo observer no puede ver el mensaje
          */
        felipe.readMessagesAndClear();
    }
}