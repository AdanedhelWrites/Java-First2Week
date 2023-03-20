package odev;

public class Odev14 {
//Bir dizi içerisinde en fazla tekrar eden sayıyı bulan uygulamayı yazınız.
	public static void main(String[] args) {
		int[] dizi = { 5, 5, 2, 5, 5, 7, 8, 9, 5, 4, 6, 1, 6 };

		int toplam = 0;
		int tekrar = 0;

		for (int i = 0; i < dizi.length; i++) {
			int sayac = 0;
			for (int j = 0; j < dizi.length; j++) {
				if (dizi[i] == dizi[j]) {
					sayac++;

				}

			}
			if (sayac > toplam) {
				toplam = sayac;
				tekrar = dizi[i];

			}

		}
		System.out.println(tekrar + " en cok tekrar eden elemandir");
	}
}
