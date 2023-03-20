package algoritmalar.veritipleri;

import java.util.Scanner;

public class Soru18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sayi giriniz: ");
		int a = input.nextInt();
		int toplam = 0;
		while (0 <= a) {
			if (a % 2 == 1) {

				toplam += a;
				a -= 2;
			} else {
				a--;
			}

		}
		System.out.println("Tek sayilarin toplami:" + toplam); // benim çözüm buraya kadar

		int i = 1;
		while (i <= a) {
			toplam += i;
			i += 2;

		}
		System.out.println("Tek sayilarin toplami:" + toplam);

		input.close();
	}

}
