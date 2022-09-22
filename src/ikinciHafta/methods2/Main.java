package ikinciHafta.methods2;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugun hava çok güzel.";
        String yeniMesaj = sehir();
        System.out.println(yeniMesaj);

        int sayi = topla(23,82);
        System.out.println(sayi);

        int toplam = topla2(23,82,25,34,27,38);
        System.out.println("toplam: "+toplam);
    }

    public static void ekle(){
        System.out.println("eklendi");
    }

    public static void guncelle(){
        System.out.println("güncellendi");
    }

    public static void sil(){
        System.out.println("silindi");
    }

    public static int topla(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar){
        int toplam = 0;

        for(int sayi:sayilar){
            toplam += sayi;
        }

        return toplam;
    }

    public static String sehir(){
        return "Ankara";
    }
}
