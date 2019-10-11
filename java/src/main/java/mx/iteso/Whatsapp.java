package mx.iteso;

public class Whatsapp {
    public static void main(String[] args) {
        GrupoDisenoSoftware grupoDisenoSoftware = new GrupoDisenoSoftware();
        RodrigoVillalobosObserver YoMero = new RodrigoVillalobosObserver("YoMero");
        RodrigoVillalobosObserver Carso = new RodrigoVillalobosObserver("Carso");
        RodrigoVillalobosObserver Maggie = new RodrigoVillalobosObserver("Maggie");
        RodrigoVillalobosObserver Pablo = new RodrigoVillalobosObserver("Pablo");
        grupoDisenoSoftware.registerObserver(Pablo);
        grupoDisenoSoftware.registerObserver(YoMero);
        grupoDisenoSoftware.registerObserver(Carso);
        grupoDisenoSoftware.registerObserver(Maggie);
        grupoDisenoSoftware.addMessage("Que onda amiguitos");
        grupoDisenoSoftware.addMessage("Agregar a Maggie");
        grupoDisenoSoftware.registerObserver(Maggie);
        grupoDisenoSoftware.addMessage("Agregar a pablo");
        grupoDisenoSoftware.registerObserver(Pablo);
        grupoDisenoSoftware.addMessage("Agregar a carso");
        grupoDisenoSoftware.removeObserver(Pablo);
        grupoDisenoSoftware.addMessage("Ya se agregaron a todos los participantes del equipo");

        System.out.println("YoMero");
        YoMero.readMessagesAndClear();
        System.out.println("Carso");
        Carso.readMessagesAndKeep();
        System.out.println("Maggie");
        Maggie.readMessagesAndClear();
        System.out.println("Pablo");
        Pablo.readMessagesAndKeep();
    }
}
