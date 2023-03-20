package odev;

public class Odev15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dizi = {-1,3,-4,5,-4,-5,-2,4,5,7,-8,-9,10,3,4,-11};
		int[] negatifSayiDizisi = {};
		
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] < 0) {
				negatifSayiDizisi = dizi;
				System.out.println(negatifSayiDizisi[i]);
				
			}
			
		}
	}

}
