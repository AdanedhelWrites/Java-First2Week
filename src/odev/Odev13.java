package odev;

public class Odev13 {
//Bir dizideki sayıların çift mi tek mi olduğunu bulan ve
	//tüm sayıların toplamını yazdıran	uygulamayı yazınız.
	public static void main(String[] args) {
		int[] dizi = {10,13,15,17,16,18,20,22,21,25};
		
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] % 2 == 0) {
				System.out.println("Eleman cifttir: " + dizi[i]);
				
			}else {
				System.out.println("Eleman tektir: " + dizi[i]);
			}
			
		}

	}

}
