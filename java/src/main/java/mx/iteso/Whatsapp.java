package mx.iteso;

import mx.iteso.RodrigoVillalobos;
import mx.iteso.GrupoDisenoSoftware;;

/**
    Main class
 */
class Whatsapp {
    public static void main( String[] args ){
        GrupoDisenoSoftware grupoDisenoSoftware;
        grupoDisenoSoftware = new GrupoDisenoSoftware();

        RodrigoVillalobos rodrigoVillalobos = new RodrigoVillalobos("rodrigoVillalobos",grupoDisenoSoftware);
        RodrigoVillalobos alvaroCabrales = new RodrigoVillalobos("alvaroCabrales",grupoDisenoSoftware);
        RodrigoVillalobos arturoGarcia = new RodrigoVillalobos("arturoGarcia",grupoDisenoSoftware);
        RodrigoVillalobos luisHernandez = new RodrigoVillalobos("luisHernandez",grupoDisenoSoftware);
        RodrigoVillalobos sebastianAceves = new RodrigoVillalobos("sebastianAceves",grupoDisenoSoftware);

        grupoDisenoSoftware.setMessage("Hola mundo");
        grupoDisenoSoftware.setMessage( "1111111111111");
        grupoDisenoSoftware.removeObserver(rodrigoVillalobos);
        grupoDisenoSoftware.setMessage( "2222222222222");
        grupoDisenoSoftware.registerObserver(rodrigoVillalobos);
        grupoDisenoSoftware.setMessage("333333333333");

        rodrigoVillalobos.readMessagesAndKeep();
        alvaroCabrales.readMessagesAndKeep();
        arturoGarcia.readMessagesAndKeep();
        luisHernandez.readMessagesAndKeep();
        sebastianAceves.readMessagesAndKeep();

        rodrigoVillalobos.clearMessages();
        alvaroCabrales.clearMessages();
        arturoGarcia.clearMessages();
        luisHernandez.clearMessages();
        sebastianAceves.clearMessages();

        grupoDisenoSoftware.setMessage("1");
        grupoDisenoSoftware.setMessage("2");
        grupoDisenoSoftware.setMessage("3");
    }
}
