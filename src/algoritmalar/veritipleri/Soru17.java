package algoritmalar.veritipleri;

import java.util.Scanner;

public class Soru17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Karakter giriniz: ");
		char ch = input.next().charAt(0);
		
		switch (ch) {
		case 65, 69, 73, 79, 85, 97, 101, 105, 111, 117: {
			System.out.println("Sesli harf");
			break;

		}
		default:
			System.out.println("Sessiz harf");
			break;
		}
		input.close();

	}

}
