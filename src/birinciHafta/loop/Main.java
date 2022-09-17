package birinciHafta.loop;

public class Main {

	public static void main(String[] args) {
		for(int i=1; i<=23; i++){
            System.out.println("sayi:"+i);
        }
        System.out.println("for döngüsü bitti");

        for(int m=1; m<=10; m+=2){
            System.out.println("tek sayılar:"+m);
        }

        //while döngüsü
        int s = 2;
        while(s<7){
            System.out.println(s);
            s++;
        }
        System.out.println("while döngüsü bitti");

        //do-while döngüsü
        int j = 20;
        do {
            System.out.println("log çalıştı");
            System.out.println("bir defa kesin çalışır");
        }while(j==5);
        System.out.println("do-while döngüsü bitti");
	}

}
