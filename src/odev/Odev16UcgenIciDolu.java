package odev;

public class Odev16UcgenIciDolu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Çalışma soru 2

		//int kenar = 6;
		int yukseklik = 5;
//		for (int i = 0; i < yukseklik; i++) {
//			for (int j = 0; j < yukseklik-i; j++) {
//				System.out.print("*");				
//				
//			}
//			System.out.println();
//		}
		for (int i = 1; i <= yukseklik; i++) {
			for (int j = 1; j <= yukseklik - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * yukseklik - 1; j++) {
				if (j == 1 || j == 2 * i - 1 || i == yukseklik) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
		
		
	}

}
