package ucuncuHafta.odev2.overriding;

public class OgrenciKrediManager extends BaseCrediManager{
    @Override
    public double hesapla(double tutar){
        return tutar * 1.10;
    }
}
