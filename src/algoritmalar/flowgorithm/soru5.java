package algoritmalar.flowgorithm;

import java.util.Scanner;

public class soru5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		int a = input.nextInt();
		
		System.out.println("Bir sayi giriniz: ");
		int b = input.nextInt();
		int toplam;
		if (a > 50 && b > 50) {
			toplam = a + b;
			System.out.println("A ile B'nin toplami = " + toplam);

		} else {
			System.out.println("A yada B 50'den buyuk degildir..");
		}
		input.close();


	}

}
