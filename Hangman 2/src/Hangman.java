import java.util.Random;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		Random random = new Random();
		String[] guesses = {"lila", "rosa" , "bl�", "gr�n", "orange", "r�d", "svart", "vit", "gul", "gr�", "brun",};
		
		
		boolean spelarvi= true;
		while(spelarvi) {
			System.out.println("V�lkommen");
			char[] randomwordtoguess = guesses[random.nextInt(guesses.length)].toCharArray();
			int amountofguesses = randomwordtoguess.length;
			char[] playerguess = new char[amountofguesses];
			
			for (int i = 0; i < playerguess.length; i++) {
				playerguess[i] = '_'; 
			}
			
			boolean Ordet�rKorrekt = false;
			int tries = 0;
			
			while (!Ordet�rKorrekt && tries != amountofguesses) {
				System.out.print("Gissningar kvar:");
				printArray(playerguess);
				System.out.printf("Du har %d kvar.\n", amountofguesses - tries);
				System.out.println("Sl� in en bokstav");
				char input = scanner.nextLine().charAt(0); 
				tries++; 
				
				if (input =='-') {
					spelarvi = false;
					Ordet�rKorrekt = true;
				}
				
				else {
					for(int i = 0 ; i < randomwordtoguess.length; i++) {
						if(randomwordtoguess[i] == input) {
							playerguess[i] = input;
						}
					}
					
					if(isthewordguessed(playerguess)) {
						Ordet�rKorrekt = true;
						System.out.println("Grattis du har vunnit!!!");
					}
					
					
					
				}
			
				
			
			}
			
			if(!Ordet�rKorrekt) System.out.println("Du har inga gissningar kvar ");
			System.out.println("Vill du spela igen? (Ja/Nej) ");
			String anothergame = scanner.nextLine();
			if(anothergame.equals("Nej")) spelarvi=false;
		}

		
		System.out.println("Du har f�rlorat");
		
	}

	public static void printArray(char[] array) {

		for(int i = 0 ; i < array.length; i++) {
			System.out.print(array[i]+" ");
		
	}
	System.out.println();
}
	
	public static boolean isthewordguessed(char[] array) {
		for(int i = 0 ; i < array.length; i++) {
			if (array[i] == '_') return false;
	}
	return true;
	
}
}