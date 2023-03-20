/**
 * 
 */
package algoritmalar.flowgorithm;

import java.util.Scanner;

/**
 * @author Adanedhel
 *
 */
public class soru3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, kare;
		Scanner input = new Scanner(System.in);
		System.out.println("Karenin bir kenarini giriniz: ");
		a = input.nextInt();

		kare = a * a;
		System.out.println("Karenin alani = " + kare);
		input.close();

	}

}
