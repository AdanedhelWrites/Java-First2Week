package algoritmalar.veritipleri;

public class Soru22StringTest {

	public static void main(String[] args) {
		String value = "Hello World";
		String value2 = "Adanedhel";
				
		System.out.println(value.charAt(2));//kacıncı index oldugunu gösterir
		System.out.println(value.charAt(value.length()-1));// son harfi aldırır
		System.out.println(value.length());//uzunluktur
		System.out.println(value.indexOf('W')); // kaçıncı indexse görürse bu karakteri o indexi gösterir
		System.out.println(value2.trim());//bas ve sondaki bosluklari siler 
		System.out.println(value2.replace('a', 'e'));
		System.out.println(value2.contains("hel"));
		System.out.println(value2.toUpperCase());
		System.out.println(value2.toLowerCase());
		System.out.println(value2.equals("adanedhel"));
		System.out.println(value2.equalsIgnoreCase("ADANEDHEL"));
	}

}
