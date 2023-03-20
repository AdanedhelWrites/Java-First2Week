package algoritmalar.veritipleri;

import java.util.Scanner;

public class Soru2Ekstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double turkLirasi,dolar,euro;
		Scanner input = new Scanner(System.in);
		System.out.println("Kur hesaplama: ");
		turkLirasi = input.nextDouble();
		dolar = turkLirasi/18.5;
		euro = turkLirasi/20;
		
		System.out.println("Turk Lirasi "+ turkLirasi);
		System.out.println("Dolar " + dolar);
		System.out.println("Euro "+ euro);
		input.close();

		
		

	}

}
