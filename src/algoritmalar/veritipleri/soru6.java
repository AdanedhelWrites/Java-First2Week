package algoritmalar.veritipleri;

import java.util.Scanner;

public class soru6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Sayi Giriniz: ");
		int a = input.nextInt();
		System.out.println("Sayi Giriniz: ");
		int b = input.nextInt();

		if (a > b) {
			System.out.println("1. sayi 2. sayidan buyuktur." + "\n" + a + " > " + b);

		} else if (a < b) {
			System.out.println("2. sayi 1. sayidan buyuktur" + "\n" + b + " > " + a);
		} else {
			System.out.println("1. sayi ile 2. sayi birbirine esittir \n" + a + " = " + a);
		}
		input.close();

	}

}
