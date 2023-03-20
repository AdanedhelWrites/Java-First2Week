package odev;
import java.util.Scanner;
public class Odev8 {
	//VERİLEN KELİMEDE KAÇ TANE 'E' OLDUGUNU BULUN
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kelime girin");
		String kelime = input.next();
		int sayac = 0;
		for (int i = 0; i < kelime.length(); i++) {
			if(kelime.charAt(i) == 'e' || kelime.charAt(i)== 'E') {
				sayac++;
				
			}
			
		}
		System.out.println("Kelimenin icinde "+ sayac + " adet e harfi vardir.");
		
		input.close();

	}

}
