package odev;
import java.util.Scanner;
public class Odev7 {
	//GİRİLEN KELİMENİN HARFLERİNİ YAZDIRMA
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kelime giriniz: ");
		String a = input.next();
		for (int i = 0; i < a.length(); i++) {
			System.out.println("Kelimeler: " + a.charAt(i)+ "");
			
			
		}
		input.close();
		
		

	}

}
