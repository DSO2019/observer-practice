package mx.iteso;

public class GrupoWhats {

    public static void main(String[] args) {
        GrupoDisenoSoftware grupoDisenoSoftware = new GrupoDisenoSoftware();

        RodrigoVillalobos erick = new RodrigoVillalobos("Erick");
        RodrigoVillalobos manuel = new RodrigoVillalobos("Manuel");
        RodrigoVillalobos luisMiguel = new RodrigoVillalobos("LuisMiguel");
        RodrigoVillalobos alfredo = new RodrigoVillalobos("Alfredo");
        RodrigoVillalobos alex = new RodrigoVillalobos("Alex");

        grupoDisenoSoftware.registerObserver(erick);
        grupoDisenoSoftware.registerObserver(manuel);
        grupoDisenoSoftware.registerObserver(luisMiguel);


        grupoDisenoSoftware.addMessage("Hola a todos este grupo es por la clase sin alfredo / alex ");
        grupoDisenoSoftware.registerObserver(alfredo);
        grupoDisenoSoftware.addMessage("Se añadio al grupo agreguen a sus compañeros sin alex");
        grupoDisenoSoftware.registerObserver(alex);
        grupoDisenoSoftware.addMessage("Se añadio al grupo TODOS");
        grupoDisenoSoftware.removeObserver(alex);
        grupoDisenoSoftware.addMessage("Hola a todos, ya nos encontramos todos en el grupo de whats sin alex");

        //Ver mensajes
        System.out.println("Erick");
        erick.readMessagesAndKeep();
        System.out.println("Manuel");
        manuel.readMessagesAndClear();
        System.out.println("Luis Miguel");
        luisMiguel.readMessagesAndKeep();
        System.out.println("Alfredo");
        alfredo.readMessagesAndClear();
        System.out.println("Alex");
        alex.readMessagesAndKeep();
    }
}
