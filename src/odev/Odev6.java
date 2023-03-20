package odev;

import java.util.Scanner;

public class Odev6 {
	// KLAVYEDEN GİRİLEN 0 İLE 25 ARASINDAKİ 5 SAYIDAN EN BÜYÜK VE EN KÜÇÜĞÜNÜ BULUN
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int max = 0;
		int min = 25;
		for (int i = 1; i <= 5; i++) {
			System.out.println("0 ile 25 arasinda sayi giriniz: ");
			int sayi = input.nextInt();
			if (sayi > 25 || sayi < 0) {
				System.out.println("0 ile 25 arasinda sayi girmediniz..");
				break;
			} else {

				if (sayi >= max) {
					max = sayi;
				}
				if (sayi <= min) {
					min = sayi;

				}

			}

		}
		System.out.println("En buyuk sayi = " + max);
		System.out.println("En kucuk sayi = " + min);
		input.close();

	}

}
