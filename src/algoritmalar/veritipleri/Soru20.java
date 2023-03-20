package algoritmalar.veritipleri;
import java.util.Scanner;
public class Soru20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sehir giriniz");
		String a = input.next();
		String upperSehir = a.substring(0,1).toUpperCase() + a.substring(1, a.length());
		switch (upperSehir) {
			
		case  "Eskişehir", "Konya", "Ankara", "Çankırı", "Aksaray", "Kırıkkale", "Kırşehir","Yozgat","Niğde","Nevşehir","Kayseri","Sivas":
			
			System.out.println("Ic Anadolu Bolgesindedir.");
			
			break;
		case  "Sakarya", "Kocaeli","Bursa","Kırklareli","Edirne","Çanakkale","Balıkesir","Tekirdağ", "İstanbul","Yalova","Bilecik":
			System.out.println("Marmara Bolgesindedir");

		default:
			System.out.println("Gecerli Sehir Giriniz");
			break;
		}
		input.close();

	}

}
