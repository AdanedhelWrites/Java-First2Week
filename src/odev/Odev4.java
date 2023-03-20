package odev;

import java.util.Scanner;

public class Odev4 {
	// GİRİLEN SAYI MÜKEMMEL SAYI MI?

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Sayi giriniz: ");
		int a = input.nextInt();
		int top = 0;
		for (int i = 1; i < a; i++) {
			if(a % i == 0) {
				top += i;
			}
			
		}if (a == top) {
			System.out.println("Bu sayi mukemmel bir sayidir\t" + a);
			
		}else {
			System.out.println("Bu sayi mukemmel bir sayi degildir\t" + a);
			
		}
		input.close();
		
		// TODO Auto-generated method stub

	}

}
