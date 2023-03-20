package algoritmalar.veritipleri;

import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Urunun satis fiyatini giriniz: ");
		float satisFiyati = input.nextInt();

		float kdv = (satisFiyati - satisFiyati * 0.18f);
		
		
		float hamFiyat = (kdv - kdv * 0.15f);

		System.out.println("Ham Fiyati: " + hamFiyat);
		input.close();


	}

}
