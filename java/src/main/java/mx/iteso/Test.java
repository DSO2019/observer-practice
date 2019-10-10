package mx.iteso;

public class Test {
    public static void main(String[] args) {
        Group sfwDesignGroup = new Group("Diseño de Software");
        User rodrigoVillalobos = new User("Rodrigo Villalobos");
        User isaac = new User("Isaac");
        User ian = new User("Ian");
        User manuel = new User("Manuel");
        sfwDesignGroup.registerObserver(rodrigoVillalobos);
        sfwDesignGroup.registerObserver(isaac);
        sfwDesignGroup.registerObserver(ian);
        sfwDesignGroup.registerObserver(manuel);
        System.out.println(sfwDesignGroup.groupName);

        sfwDesignGroup.broadcastMessage("hola grupo");
        sfwDesignGroup.broadcastMessage("Revisen los checkpoints");

        isaac.readMessagesAndKeep();

    }
}