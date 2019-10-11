import RodrigoVillalobos;
import GrupoDisenoSoftware;


public class LaQuintaEstacionGroup{
    public static void main( String[] args ){
        GrupoDisenoSoftware laQuintaGroup;
        laQuintaGroup = new GrupoDisenoSoftware();

        RodrigoVillalobos joseTorrentera = new RodrigoVillalobos();
        laQuintaGroup.registerObserver(joseTorrentera);
        RodrigoVillalobos alejandroRios = new RodrigoVillalobos();
        laQuintaGroup.registerObserver(alejandroRios);
        RodrigoVillalobos gustavoRueda = new RodrigoVillalobos();
        laQuintaGroup.registerObserver(gustavoRueda);
        RodrigoVillalobos juanTec = new RodrigoVillalobos();
        laQuintaGroup.registerObserver(juanTec);
        RodrigoVillalobos alfredoRodriguez = new RodrigoVillalobos();
        laQuintaGroup.registerObserver(alfredoRodriguez);

        

        laQuintaGroup.sendMessage("Todos tienen 10 ... de 100 jajajajaj");
        joseTorrentera.readMessagesAndKeep();
    }
}