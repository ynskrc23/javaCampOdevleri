package ucuncuHafta.odev2.overriding;

public class Main {
    public static void main(String[] args) {
        BaseCrediManager[] crediMananager = new BaseCrediManager[]{new OgretmenKrediManager(),new BaseCrediManager(),new OgrenciKrediManager()};

        for (BaseCrediManager kredi:crediMananager) {
            System.out.println(kredi.hesapla(150));
        }
    }
}
