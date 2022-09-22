package ikinciHafta.methods2;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugun hava çok güzel.";
        String yeniMesaj = sehir();
        System.out.println(yeniMesaj);

        int sayi = topla(23,82);
        System.out.println("toplam: "+sayi);
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

    public static String sehir(){
        return "Ankara";
    }
}
