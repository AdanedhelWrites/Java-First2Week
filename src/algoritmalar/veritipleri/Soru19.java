package algoritmalar.veritipleri;

import java.util.Scanner;

public class Soru19 {

	public static void main(String[] args) {
		// Dikdörtgen yazdırın * ile
		// contains methodunu araştır
//		Scanner input = new Scanner(System.in);
//		int genislik = input.nextInt();
//		int yukseklik = input.nextInt();

//		for (int i = 0; i < yukseklik; i++) {
//
//			for (int j = 0; j < genislik; j++) {
//				if (i == 0 || i == yukseklik - 1) {
//					System.out.print("*");
//
//				} else {
//					if (j == 0 || j == genislik - 1) {
//						System.out.print("*");
//
//					} else {
//						System.out.print(" ");
//					}
//
//				}
//
//			}
//			System.out.println();

		Scanner input = new Scanner(System.in);
		int genislik = input.nextInt();
		int yukseklik = input.nextInt();
		
		for(int i = 0;i<genislik;i++)
		
			{
				System.out.print("*");
			}
			System.out.println();
			for (int i = 0; i < yukseklik - 2; i++) {
				System.out.print("*");
				for (int j = 0; j < genislik - 2; j++) {
					System.out.print(" ");
					
				}
				System.out.println("*");
				
			}
			for (int i = 0; i < genislik; i++) {
				System.out.print("*");
				
			}
			input.close();
	}
	
	


	
}


