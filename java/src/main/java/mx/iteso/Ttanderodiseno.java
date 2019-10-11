package mx.iteso;


public class Ttanderodiseno {
    public static void main( String[] args ){
        Disenosoftware equipotandero;
        equipotandero = new Disenosoftware();
        RodrigoVillalobos ian       = new RodrigoVillalobos();
        RodrigoVillalobos isaac      = new RodrigoVillalobos();
        RodrigoVillalobos manuel   = new RodrigoVillalobos();

        equipotandero.registerObserver(ian);
        equipotandero.registerObserver(isaac);
        equipotandero.registerObserver(manuel);


        equipotandero.sendMessage("Hola");


        equipotandero.sendMessage("Mañana vamos a jugar futbol para distraernos");
        equipotandero.sendMessage("Si.. ya hace falta un descanso");
        equipotandero.sendMessage("y SEGUIMOS terminando con el proyecto");
        
        ian.readMessagesAndClear();
        manuel.readMessagesAndClear();
        isaac.readMessagesAndClear();


        equipotandero.removeObserver(manuel);


        manuel.readMessagesAndClear();
        ian.readMessagesAndClear();
        isaac.readMessagesAndClear();

    }
}
