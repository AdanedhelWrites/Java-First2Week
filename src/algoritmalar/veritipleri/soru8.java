package algoritmalar.veritipleri;

import java.util.Scanner;

public class soru8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("1. kenari giriniz:");
		int a = input.nextInt();
		System.out.println("2. kenari giriniz:");
		int b = input.nextInt();
		System.out.println("3. kenari giriniz:");
		int c = input.nextInt();
		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("Kenarlari 0'dan buyuk giriniz.");
		} else {

			if (a == b && b == c) {
				System.out.println("Bu bir eskenar ucgendir. ");

			} else if (a == b || a == c || b == c) {
				System.out.println("Bu bir ikiz kenar ucgendir. ");

			} else {
				System.out.println("Bu bir cesit kenar ucgendir. ");
			}
			input.close();


		}

	}

}
