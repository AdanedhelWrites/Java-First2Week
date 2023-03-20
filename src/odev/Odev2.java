package odev;

import java.util.Scanner;

public class Odev2 {
	// GİRİLEN SAYININ 5'İN KUVVETİ OLUP OLMADIĞINI BUL
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		int sayi = input.nextInt();
		if (sayi % 5 == 0) {
			while (sayi % 5 == 0) {
				sayi /= 5;

			}
			if (sayi == 1) {
				System.out.println("Sayi 5'in kuvvetidir.");

			} else {
				System.out.println("Sayi 5'in kuvveti degildir.");
			}

		} else {
			System.out.println("Sayi 5'in kuvveti degildir.");
		}
		input.close();
		// TODO Auto-generated method stub

	}

}
