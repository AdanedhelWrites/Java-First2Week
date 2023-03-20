package algoritmalar.veritipleri;

import java.util.Scanner;
import java.lang.Math;

public class Soru4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Dairenin Yaricapini Giriniz: ");
		float a = input.nextFloat();
		double pi = Math.PI;
		double cevre,alan;
		
		
		if (a <= 0) {
			System.out.println("Yaricapi 0'dan kucuk daire olusamaz..");
			
		}
		else {
			cevre = 2*pi*a;
			alan = pi*(a*a);
			System.out.println("Dairenin cevresi: "+ cevre + "\nDairenin alani: "+ alan);
			
		}
		input.close();

		
		
		
		// TODO Auto-generated method stub

	}

}
