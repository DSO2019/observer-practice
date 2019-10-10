import mx.iteso.GrupoDisenoSoftware;
import mx.iteso.RodrigoVillalobos;

class WhatsAppGroup {
    public static void main( String[] args ){
        GrupoDisenoSoftware quintaEstacion;
        quintaEstacion = new GrupoDisenoSoftware();

        RodrigoVillalobos gustavoRueda = new RodrigoVillalobos();
        RodrigoVillalobos angelTec = new RodrigoVillalobos();
        RodrigoVillalobos joseTorrentera = new RodrigoVillalobos();
        RodrigoVillalobos alfredoRodriguez = new RodrigoVillalobos();
        RodrigoVillalobos alejandroRios = new RodrigoVillalobos();

        // Registro de usuarios
        quintaEstacion.registerObserver(alejandroRios);
        quintaEstacion.registerObserver(gustavoRueda);
        quintaEstacion.registerObserver(angelTec);
        quintaEstacion.registerObserver(joseTorrentera);
        quintaEstacion.registerObserver(alfredoRodriguez);

        // Mensaje inicial para todos
        quintaEstacion.sendMessage("Hola a todos!");
        
        // Todos leen el mensaje
        alejandroRios.readMessagesAndKeep();
        gustavoRueda.readMessagesAndKeep();
        angelTec.readMessagesAndKeep();
        joseTorrentera.readMessagesAndKeep();
        alfredoRodriguez.readMessagesAndKeep();

        // Limpiar mensajes mantenidos
        alejandroRios.clearMessages();
        gustavoRueda.clearMessages();
        angelTec.clearMessages();
        joseTorrentera.clearMessages();
        alfredoRodriguez.clearMessages();

        // Enviar mensajes consecutivos
        quintaEstacion.sendMessage("¿Cómo están?");
        quintaEstacion.sendMessage("Espero que bien...");
        quintaEstacion.sendMessage("Adiós");
        
        // Leer mensajes y limpiarlos
        alejandroRios.readMessagesAndClear();
        gustavoRueda.readMessagesAndClear();
        angelTec.readMessagesAndClear();
        joseTorrentera.readMessagesAndClear();
        alfredoRodriguez.readMessagesAndClear();

        // Quitar a usuario suscrito
        quintaEstacion.removeObserver(gustavoRueda);

        // Enviar mensaje nuevo a observers restantes
        quintaEstacion.sendMessage("Sacaremos a Gus");

        // Todos leen mensaje y lo mantienen pero un usuario no lo puede leer porque no está suscrito
        alejandroRios.readMessagesAndClear();
        gustavoRueda.readMessagesAndClear();
        angelTec.readMessagesAndClear();
        joseTorrentera.readMessagesAndClear();
        alfredoRodriguez.readMessagesAndClear();
    }
}