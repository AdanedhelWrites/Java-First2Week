package odev;

import java.util.Scanner;

public class Odev1 {
	// GİRİLEN SAYININ BASAMAKLARI TOPLAMINI BULUNUZ? 123 --> 1 + 2 + 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Basamaklarinin toplanmasi istenen sayiyi giriniz: ");
		int a = input.nextInt();

		int top = 0;

		while (a > 0) {
			top += a % 10; // 123'ün 10'a bölümünden kalan 3'tür.. 12'nin 10'a bölümünden kalan 2'dir
			a /= 10;// 123'ün 10'a bölümü 12'dir.. Yukarı çıkar.. 12'nin 10a bölümü 2'dir Yukari
					// çıkar
		}
		System.out.println("Girilen sayinin basamaklari toplami: " + top);

		input.close();
	}

}
