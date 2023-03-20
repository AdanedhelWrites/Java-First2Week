package algoritmalar.veritipleri;
import java.util.Scanner;
public class soru5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Isminizi Giriniz: ");
		String x = input.next();
		System.out.println("Soyisminizi Giriniz: ");
		String y = input.next();
		
		System.out.println("Hosgeldin\n" + x +" "+ y);
		
		System.out.println("Bir harf giriniz");
		char c = input.next().charAt(0);
		char h = input.next().charAt(0);
		char a = input.next().charAt(0);
		char r = input.next().charAt(0);
		System.out.println("Girilen harf: " + c + h + a + r);
		
		input.close();


	}

}
