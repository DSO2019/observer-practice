package mx.iteso;

import java.util.Observer;

public class Grupazo {
	
	public static void main(String[] args) {
		
	
	GrupoDisenoSoftware grupazo;
    grupazo = new GrupoDisenoSoftware();

    RodrigoVillalobos profe = new RodrigoVillalobos();
    RodrigoVillalobos profe2 = new RodrigoVillalobos();
    RodrigoVillalobos profe3 = new RodrigoVillalobos();
    RodrigoVillalobos profe4 = new RodrigoVillalobos();
    RodrigoVillalobos profe5 = new RodrigoVillalobos();

    grupazo.registerObserver((Observer) profe);
    grupazo.registerObserver((Observer)profe2);
    grupazo.registerObserver((Observer)profe3);
    grupazo.registerObserver((Observer)profe4);
    grupazo.registerObserver((Observer)profe5);

   
    grupazo.setMessage("hola mundo");
    
    profe.readMessagesAndKeep();
    profe2.readMessagesAndKeep();
    profe3.readMessagesAndKeep();
    profe4.readMessagesAndKeep();
    profe5.readMessagesAndKeep();

    profe.clearMessages();
    profe2.clearMessages();
    
    grupazo.setMessage("hola mundo 2");
   
    
    profe.readMessagesAndClear();
    profe2.readMessagesAndClear();
    profe3.readMessagesAndClear();
    grupazo.removeObserver((Observer) profe);
    grupazo.setMessage("No se salgan");

    profe.readMessagesAndClear();
    profe2.readMessagesAndClear();
    profe3.readMessagesAndClear();
    profe4.readMessagesAndClear();
    profe5.readMessagesAndClear();
}
}
