package odev;

public class Odev17StringBosluk {

	public static void main(String[] args) {
		String input = "Elfler her irkin ustundedir valarlar bunu emreder. ";
		int sayac = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i)==' ') {
				sayac++;
				
			}
			
		}
		System.out.println(sayac);

	}

}
