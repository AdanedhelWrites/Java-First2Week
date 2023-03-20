package odev;

import java.util.Scanner;

public class Odev5 {
	// KULLANICI 0 GİRENE KADAR OLAN SAYILARIN ÇARPIMINI AL
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sayi giriniz:EGER 0 GIRERSEN PROGRAM SONLANIR");
		int carpim = 1;
		int sayi, sayi1;

		if ((sayi1 = input.nextInt()) == 0) {
			carpim = 0;
			System.out.println("0 dan farkli sayi giriniz");

		} else {
			carpim = sayi1;
			while ((sayi = input.nextInt()) != 0) {

				carpim *= sayi;
				

			}
			System.out.println("Girilen sayilarin carpimi = " + carpim);
		}
		input.close();

	}

	// TODO Auto-generated method stub

}
