package recampDemo2;

public class Main {

	public static void main(String[] args) {
		
		double[] myList = {12.25, 32.45, 3.95, 1.99, 2.96};
        double total = 0;
        double max = myList[0];

        for(double number: myList){
            if(number > max){
                max = number;
            }
            total = total+ number;
        }

        System.out.println("max sayı: "+max);
        System.out.println("sayıların toplamı:" +total);

	}

}
