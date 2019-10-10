package mx.iteso;

/**
 * User: Alfredo Rodriguez
 */
class WhatsappGroup {
    public static void main( String[] args ){
        GrupoDisenoSoftware grupoDisenoSoftware;
        grupoDisenoSoftware = new GrupoDisenoSoftware();

        RodrigoVillalobos gus = new RodrigoVillalobos("Gustavo Rueda");
        RodrigoVillalobos tec = new RodrigoVillalobos("Juan Angel Tec");
        RodrigoVillalobos senpai = new RodrigoVillalobos("Jose Luis Torrentera");
        RodrigoVillalobos rios = new RodrigoVillalobos("Alejandro Rios");
        RodrigoVillalobos alfredo = new RodrigoVillalobos("Alfredo Rodriguez");

        grupoDisenoSoftware.registerObserver(gus);
        grupoDisenoSoftware.registerObserver(tec);
        grupoDisenoSoftware.registerObserver(senpai);
        grupoDisenoSoftware.addMessage("Se ha creado el grupo");
        grupoDisenoSoftware.addMessage("Hola");
        grupoDisenoSoftware.registerObserver(rios);
        grupoDisenoSoftware.addMessage("Se ha agregado a "+rios.getName());
        grupoDisenoSoftware.registerObserver(alfredo);
        grupoDisenoSoftware.addMessage("Se ha agregado a "+alfredo.getName());
        grupoDisenoSoftware.removeObserver(gus);
        senpai.clearMessages();
        grupoDisenoSoftware.addMessage("Se ha eliminado a "+gus.getName());

        // Imprimiendo los mensajes por observer
        System.out.println("Mensajes de Gus:");
        gus.readMessagesAndKeep();
        System.out.println();
        System.out.println("Mensajes de Juan Angel:");
        tec.readMessagesAndClear();
        System.out.println();
        System.out.println("Mensajes de Jose Luis:");
        senpai.readMessagesAndKeep();
        System.out.println();
        System.out.println("Mensajes de Rios:");
        rios.readMessagesAndClear();
        System.out.println();
        System.out.println("Mensajes de Alfredo:");
        alfredo.readMessagesAndKeep();
    }
}