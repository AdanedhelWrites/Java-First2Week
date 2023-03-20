package algoritmalar.veritipleri;

import java.util.Scanner;

public class soru11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Bir deger girin");
		int sayi = input.nextInt();

		switch (sayi) {
		case 1: {
			System.out.println("Pazartesi");
			break;
		}
		case 2: {
			System.out.println("Sali");
			break;
		}
		case 3: {
			System.out.println("Carsamba");
			break;
		}
		case 4: {
			System.out.println("Persembe");
			break;
		}
		case 5: {
			System.out.println("Cuma");
			break;
		}
		case 6: {
			System.out.println("Cumartesi");
			break;
		}
		case 7: {
			System.out.println("Pazar");
			break;

		}

		}
		switch (sayi) {
		case 1, 2, 3, 4, 5: {
			System.out.println("Haftaicidir..");
			break;

		}
		case 6, 7: {
			System.out.println("Haftasonudur..");
			break;
		}
		default:
			System.out.println("Hatali bir deger girdiniz. \nLutfen 1-7 arasi deger giriniz.");
			break;
		}
		input.close();

	}

}
