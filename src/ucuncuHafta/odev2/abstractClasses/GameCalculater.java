package ucuncuHafta.odev2.abstractClasses;

public abstract class GameCalculater {
    public abstract void hesapla();

    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
