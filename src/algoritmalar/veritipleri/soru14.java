package algoritmalar.veritipleri;

import java.util.Scanner;

public class soru14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Tam sayi giriniz: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if (a == b || b == c || a == c) {
			System.out.println("Tum saygiler esittir giremezsiniz");

		} else {

			if (a > b && a > c) {

				if (b > c) {
					System.out.println("a > b > c");

				} else {
					System.out.println("a > c > b");
				}
			} else if (b > a && b > c) {
				if (a > c) {
					System.out.println("b > a > c");

				} else {
					System.out.println("b > c > a");
				}

			} else if (c > a && c > b) {
				if (b > a) {
					System.out.println("c > b > a");

				} else {
					System.out.println("c > a > b");
				}

			}
			
		}
		input.close();

		// TODO Auto-generated method stub

	}

}
