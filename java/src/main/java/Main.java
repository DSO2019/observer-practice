import mx.iteso.*;

public class Main
{
    public static void main(String[] args)
    {
        GrupoDisenoSoftware quintaStation = new GrupoDisenoSoftware();
        RodrigoVillalobos JoseLuis = new RodrigoVillalobos();
        RodrigoVillalobos GustavoRueda = new RodrigoVillalobos();
        RodrigoVillalobos AlfredoRod = new RodrigoVillalobos();
        RodrigoVillalobos AlejandroRios = new RodrigoVillalobos();
        RodrigoVillalobos JuanTec = new RodrigoVillalobos();
        

        quintaStation.registerObserver(JoseLuis);
        quintaStation.registerObserver(JuanTec);
        quintaStation.registerObserver(GustavoRueda);
        quintaStation.registerObserver(AlfredoRod);
        quintaStation.registerObserver(AlejandroRios);

        quintaStation.message = "Hi...!!";

        quintaStation.notifyObservers();

        JoseLuis.readMessagesAndKeep();
        JuanTec.readMessagesAndKeep();
        AlfredoRod.readMessagesAndKeep();
        AlejandroRios.readMessagesAndKeep();
        GustavoRueda.readMessagesAndKeep();
    }
}