package algoritmalar.veritipleri;

import java.util.Scanner;

public class soru9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Vize notunu giriniz: ");
		int vize = input.nextInt();
		System.out.println("Final notunu giriniz: ");
		int Final = input.nextInt();
		float vizeNotu = vize * 0.40f;
		float finalNotu = Final * 0.60f;

		float gecmeNotu = vizeNotu + finalNotu;
		if (vize < 0 || vize > 100 || Final <0 || Final > 100) {
			System.out.println("Vize ve final notlari 0 ile 100 arasinda olmalidir... "+" Girilen vize: "+ vize + " Girilen Final: " + Final);
			
		}
		else {
			
			if (gecmeNotu >= 90) {
				System.out.println("Gecme Notunuz: " + gecmeNotu + "\tAA");
				
			} else if (gecmeNotu >= 80) {
				System.out.println("Gecme Notunuz: " + gecmeNotu + "\tBB");
				
			} else if (gecmeNotu >= 70) {
				System.out.println("Gecme Notunuz: " + gecmeNotu + "\tCC");
				
			} else if (gecmeNotu >= 60) {
				System.out.println("Gecme Notunuz: " + gecmeNotu + "\tDD");
			}
			else {
				System.out.println("Kaldiniz " + gecmeNotu + "\tFF");
				
			}
			input.close();

		}
		

	}
}
