package mx.iteso;

class WhatsDisenoSoftware {
    public static void main( String[] args ){
        GrupoDisenoSoftware whatsappGroup = new GrupoDisenoSoftware();

        UserObserver ianDiazMeda        = new UserObserver("Ian Diaz Meda");
        UserObserver isaacCabrera       = new UserObserver("Isaac Cabrera C.");
        UserObserver manuelValderrama   = new UserObserver("Manuel Valderrama");
        UserObserver rodrigoVillalobos  = new UserObserver("Rodrigo Villalobos");

        whatsappGroup.registerObserver(ianDiazMeda);
        whatsappGroup.registerObserver(isaacCabrera);
        whatsappGroup.registerObserver(manuelValderrama);
        

        whatsappGroup.sendMessage("Hola, hay tarea?");
        whatsappGroup.sendMessage("Si, la tarea es...");
        whatsappGroup.removeObserver(manuelValderrama);
        whatsappGroup.sendMessage("Hacer el observer pattern.");
        whatsappGroup.sendMessage("Ok.");
        whatsappGroup.registerObserver(rodrigoVillalobos);

        ianDiazMeda.readMessagesAndClear();
        isaacCabrera.readMessagesAndClear();
        manuelValderrama.readMessagesAndClear();
        rodrigoVillalobos.readMessagesAndClear();
    }
}