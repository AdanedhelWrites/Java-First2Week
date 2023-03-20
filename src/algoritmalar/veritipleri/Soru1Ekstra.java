package algoritmalar.veritipleri;

import java.util.Scanner;
public class Soru1Ekstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float kdv = 0.82f;
		float kar = 0.85f;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Fiyati Giriniz: ");
		float satisFiyati = input.nextFloat();
		
		
		
		float hamFiyat = ((satisFiyati*(kdv))*kar);
		//float hamFiyat = ((satisFiyati/1.18f)/1.15f);
		System.out.println("Urunun ham fiyati = "+ hamFiyat);
		input.close();

	}

}
