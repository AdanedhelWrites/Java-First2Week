package algoritmalar.veritipleri;
import java.util.Scanner;
public class soru10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Telefonunuzdaki kodu giriniz: ");
		int telKod = input.nextInt();
		System.out.println("E-mailinizdeki kodu giriniz: ");
		int mailKod = input.nextInt();
		
		if (telKod == mailKod) {
			System.out.println("Tebrikler Basariyla Kayit Oldunuz..");
			
		}
		else {
			System.out.println("Kodlariniz birbiriyle uyusmuyor..\n"+ "Girdigin Mail kodun: " +mailKod + "\nGirdigin Tel Kodun: " + telKod);
		}
		input.close();

		
	}

}
