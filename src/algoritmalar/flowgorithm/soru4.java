package algoritmalar.flowgorithm;

import java.util.Scanner;

public class soru4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir deger giriniz: ");
		int a = sc.nextInt();
		
		if(a!=0) {
			System.out.println("Isik Acik.");
		}
		else {
			System.out.println("Isik Kapali.");
		}
		sc.close();
		
		

	}

}
