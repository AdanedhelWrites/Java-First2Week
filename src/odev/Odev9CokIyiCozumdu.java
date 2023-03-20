package odev;

import java.util.Scanner;

public class Odev9CokIyiCozumdu {
	/*
	 * Kullanıcıdan e-mail, password, repassword bilgilerini isteyiniz. e-mail'i
	 * kontrol ediniz. --> @hotmail.com, @outlook.com password ve repassword' ü
	 * kontrol ediniz. Aynı değilse hata dönmelidir. Password min 8 karakter
	 * olabilir.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean check = true;
		boolean check2 = true;
		while (check) {
			System.out.println("Mail giriniz: ");
			String mail = input.nextLine();
			
			if (!(mail.contains("@hotmail.com") || mail.contains("outlook.com") || mail.contains("gmail.com"))) {
				System.out.println("Email formatina uygun degildir");				
			}else {
				while(check2) {
					System.out.println("Sifrenizi Giriniz: ");
					String password = input.nextLine();
					
					System.out.println("Sifrenizi tekrar Giriniz: ");
					String repassword = input.nextLine();
					
					if (password.equals(repassword) && password.length() >= 8) {
						System.out.println("Giris Yaptiniz: " + mail);
						check=false;
						check2=false;
						
					}else {
						System.out.println("Sifre min 8 karakter olmali ve Sifreler ayni olmalidir..");
					}
				}
			}
		}
		input.close();

	}

}
