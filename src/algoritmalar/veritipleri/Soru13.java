package algoritmalar.veritipleri;
import java.util.Scanner;
public class Soru13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Tam sayi giriniz: ");
		int sayi1 = input.nextInt();
		int sayi2= input.nextInt();
		double toplam = sayi1 + sayi2;
		if ((sayi1 + sayi2) % 2 == 0) {
			System.out.println("Toplam " + toplam + " cifttir..");
			
		}else {
			System.out.println("Toplam "+ toplam + " tektir..");
		}
		System.out.println("Toplamlarin yarisi = "+ toplam/2);
		input.close();


	}

}
