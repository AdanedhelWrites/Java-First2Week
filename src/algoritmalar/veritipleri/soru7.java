package algoritmalar.veritipleri;
import java.util.Scanner;
public class soru7 {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Vize notunu giriniz: ");
		int vize = input.nextInt();
		System.out.println("Final notunu giriniz: ");
		int Final = input.nextInt();
		float vizeNotu = vize * 0.40f;
		float finalNotu = Final * 0.60f;
		
		float gecmeNotu = vizeNotu + finalNotu;
		
		if (gecmeNotu >= 60) {
			System.out.println("Basariliysa Gectiniz.." + "\nGecme Notu: "+ gecmeNotu);
			
		}
		else {
			System.out.println("Basarisiz oldunuz.." + "\nGecme Notu: "+ gecmeNotu);
		}
		// TODO Auto-generated method stub
		input.close();

	}

}
