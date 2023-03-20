package odev;

public class Odev18DiziElemanSayi {

	public static void main(String[] args) {

		int[] numArr = { 1, 2, 3, 4, 5, 5, 4, 3 };
		int toplam = 0;
		int ort = 0;
		int sayac = 0;
		for (int i = 0; i < numArr.length; i++) {
			toplam += numArr[i];
		}
		ort = toplam / numArr.length;
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] > ort) {
				sayac++;
			}

		}

		System.out.println(sayac);
	}

}
