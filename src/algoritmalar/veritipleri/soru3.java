package algoritmalar.veritipleri;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Sayi giriniz: ");
		int a = input.nextInt();
		System.out.println("Sayi giriniz: ");
		int b = input.nextInt();

		if ((a + b) % 2 == 0) {
			System.out.print(true);
			int toplamYarisi = (a + b) / 2;
			System.out.println("\nToplamlarinin yarisi = " + toplamYarisi);

		} else {
			System.out.print(false);
			double toplamYarisi = (a + b) / 2d;//Sonucun ondalıklı sayı cıkmasi için. Double oldugundan sayi sonuna d koydum. Float olsaydi sayi sonu f olucakti.
			System.out.println("\nToplamlarinin yarisi = " + toplamYarisi);
		}
		input.close();


	}

}
