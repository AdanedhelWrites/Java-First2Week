package algoritmalar.veritipleri;
import java.util.Scanner;
public class soru2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float dolar=18.98f;
		float euro=20.18f;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Kac TL'niz var: ");
		float tl = input.nextFloat();
					
		System.out.println("Dolar'a cevireceksiniz 1, Euroya Cevirecekseniz 0 yaziniz.");
		int a = input.nextInt();
		if (a == 1) {
			float toplam =(tl / dolar);
			System.out.println("Paranizin dolar karsiligi = " + toplam);
			
		}
		else if (a == 0){
			float toplam = tl / euro;
			System.out.println("Paranizin euro karsiligi = "+ toplam);
		}
		else {
			System.out.println("Lutfen Euro ya da Dolar karsiligini dogru giriniz..");
		}
		input.close();


	}

}
