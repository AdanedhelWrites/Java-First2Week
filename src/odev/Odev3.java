package odev;

import java.util.Scanner;

public class Odev3 {
	// GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARI YAZIN
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Rakamlarini alacaginiz sayiyi giriniz: ");
		int a = input.nextInt();

		while (a > 0) {
			System.out.println(a % 10);

			a /= 10;

		}
		input.close();
		// TODO Auto-generated method stub

	}

}
