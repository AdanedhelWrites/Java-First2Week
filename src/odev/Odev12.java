package odev;

public class Odev12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayilar= {5,10,15,20,-1,5,-9,7,-90};
		
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] < 0) {
				sayilar[i] = 100;
			}
			
			System.out.println(sayilar[i]);
		}
	}

}
