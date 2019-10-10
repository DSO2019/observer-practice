package mx.iteso;


public class Whats {
    public static void main( String[] args ){
        GrupoDisenoSoftware quintaEstacion;
        quintaEstacion = new GrupoDisenoSoftware();

        RodrigoVillalobos alfredoRodriguez = new RodrigoVillalobos();
        RodrigoVillalobos alejandroRios = new RodrigoVillalobos();
        RodrigoVillalobos gustavoRueda = new RodrigoVillalobos();
        RodrigoVillalobos angelTec = new RodrigoVillalobos();
        RodrigoVillalobos joseTorrentera = new RodrigoVillalobos();
        
        quintaEstacion.registerObserver(alfredoRodriguez);
        quintaEstacion.registerObserver(alejandroRios);
        quintaEstacion.registerObserver(gustavoRueda);
        quintaEstacion.registerObserver(angelTec);
        quintaEstacion.registerObserver(joseTorrentera);

        quintaEstacion.sendMessage("Hola");

        alfredoRodriguez.readMessagesAndKeep();
        alejandroRios.readMessagesAndKeep();
        gustavoRueda.readMessagesAndKeep();
        angelTec.readMessagesAndKeep();
        joseTorrentera.readMessagesAndKeep();
        
        alfredoRodriguez.clearMessages();
        alejandroRios.clearMessages();
        gustavoRueda.clearMessages();
        angelTec.clearMessages();
        joseTorrentera.clearMessages();

        quintaEstacion.sendMessage("Kill me pls");
        quintaEstacion.sendMessage("Estoy sufriendo");
        quintaEstacion.sendMessage("Adiós mundo cruel");
        
        alfredoRodriguez.readMessagesAndClear();
        alejandroRios.readMessagesAndClear();
        gustavoRueda.readMessagesAndClear();
        angelTec.readMessagesAndClear();
        joseTorrentera.readMessagesAndClear();

        quintaEstacion.removeObserver(gustavoRueda);

        quintaEstacion.sendMessage("Gus se aplicó la suicidación.");

        alfredoRodriguez.readMessagesAndClear();
        alejandroRios.readMessagesAndClear();
        gustavoRueda.readMessagesAndClear();
        angelTec.readMessagesAndClear();
        joseTorrentera.readMessagesAndClear();
    }
}