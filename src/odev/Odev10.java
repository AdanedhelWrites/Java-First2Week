package odev;


import java.util.Scanner;

public class Odev10 {
	/*
	 * Kullanıcının isteğine göre seçebildiği bir menü oluşturunuz. 1-Harf Saydırma
	 * 2-Harf Değiştirme 3-Polindrom Kontrolu(kendisi ile tersten yazılışı
	 * birbiriyle aynı olan kelimeler) 0-çıkış -->Kullanıcıdan bir harf ve bir
	 * kelime alınız. Kelimenin içinde ilgili harften kaç tane olduğunu saydırınız
	 * -->Kulanıcıdan bir kelime, kelimenin içerisinden bir harf ve bu harfin
	 * değiştirilmesi istenilen harf'i isteyiniz. Gerekli işlemleri yaparak
	 * kelimenin harfini değiştiriniz. --> Kullanıcının girdiği bir kelimeyi ters
	 * çevirip yazdırınız. Polindrom olup olmadığını kontrol ediniz. (kek, iki,
	 * kabak, kayak vb.)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Harf Saydirmak icin 1'i, Harf degistirmek icin 2'yi, Polindrom Kontrolu icin 3'u, Programi kapat icin 0'i tuslayiniz");
		int a = input.nextInt();
		
		switch (a) {
		case 0: {

			System.out.println("Program sonlandirilmistir..!");
			break;

		}
		case 1: {
			System.out.println("Bir kelime giriniz:");
			String kelime = input.next();
			System.out.println("Girdiginiz kelime : " + kelime.length() + "sayi uzunlugundandir");
			break;

		}
		case 2:{
			System.out.println("Bir kelime giriniz");
			String kelime = input.next();
			System.out.println("Degismesini istediginiz harf'i giriniz:");
			char harf = input.next().charAt(0);
			System.out.println("Gireceginiz harfle bir önceki harf yer değişecektir");
			char harf1 = input.next().charAt(0);
			System.out.println(kelime.replace(harf, harf1));
			break;
			
		}
		case 3:{
			
			System.out.println("Kelime giriniz: ");
			String kelime = input.next();
			String polindrom = "";
			for (int i = (kelime.length()-1); i >=0; i--) {
				polindrom += kelime.charAt(i);						
			}
			if (polindrom.equals(kelime)) {
				System.out.println("Girilen kelime polindromdur..");				
			}
			else{
				System.out.println("Girdiginiz kelime polindrom degildir..");				
			}
			break;
		}
		default:
			System.out.println("Belirlenen aralikta bir sayi giriniz..");
			break;

		}
		input.close();
		
	}

}
