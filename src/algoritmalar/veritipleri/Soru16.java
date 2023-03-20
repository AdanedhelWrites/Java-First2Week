package algoritmalar.veritipleri;
import java.util.Scanner;
public class Soru16 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Bir karakter giriniz: ");
		char ch = input.next().charAt(0);
		//System.out.println(a);
		int ascii = ch;
		if (ascii >= 65 && ascii <= 90) {
			System.out.println("Bu karakter alfabe de vardir. " + ascii);
			
		}
		else if (ascii >= 97 && ascii <=122) {
			System.out.println("Bu karakter alfabe de vardir. " + ascii);
			
		}else {
			System.out.println();
		}
		
		input.close();
	}

}
