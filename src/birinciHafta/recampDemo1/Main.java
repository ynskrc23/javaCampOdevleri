package birinciHafta.recampDemo1;

public class Main {

	public static void main(String[] args) {
		
		int sayi1 = 255;
        int sayi2 = 25;
        int sayi3 = 82;
        int enBuyuk = sayi1;

        if(enBuyuk<sayi2){
            enBuyuk = sayi2;
        }

        if(enBuyuk<sayi3){
            enBuyuk = sayi3;
        }
        System.out.println("En büyük sayı: "+enBuyuk);

	}

}
