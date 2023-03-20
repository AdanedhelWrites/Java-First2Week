package algoritmalar.veritipleri;

import java.util.Scanner;

public class Soru12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Hangi ay dogdunuz");
		int ay = input.nextInt();
		System.out.println("Hangi gun dogdunuz");
		int gun = input.nextInt();

		switch (ay) {
		case 1: {
			if (gun <= 21 && gun > 0) {
				System.out.println("Oglak");

			} 
			else if (gun >=21 && gun<=31) {
				System.out.println("Kova");
			}
			else {
				System.out.println("1 ile 31 arasi deger giriniz.");
			}
			break;

		}
		case 2: {
			if (gun <= 19 && gun > 0) {
				System.out.println("Kova");

			} else if (gun > 19 && gun <= 29) {
				System.out.println("Balik");
			}
			else {
				System.out.println("1 ile 29 arasi deger giriniz..");
			}
			break;
		}
		default:
			System.out.println("Ayi 1 ile 12 arasi giriniz");
			break;

		}
		input.close();


	}

}
