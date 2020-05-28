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
			char[] randomwordtoguess = guesses[random.nextInt(guesses.length)].toCharArray(); // F�r att f� ett slumpat ord
			int amountofguesses = randomwordtoguess.length; // Hur l�nga gissningar man f�r 
			char[] playerguess = new char[amountofguesses]; 
			
			for (int i = 0; i < playerguess.length; i++) {   // G�r s� att det f�rekommer en _ f�r varje bokstav som ska st�
				playerguess[i] = '_'; 
			}
			
			boolean Ordet�rKorrekt = false;
			int tries = 0;
			
			while (!Ordet�rKorrekt && tries != amountofguesses) {  // H�r s� kollar man att hur m�nga gissningar man har kvar och s� att man sl�r in en bokstav
				System.out.print("Gissningar kvar:");
				printArray(playerguess);
				System.out.printf("Du har %d kvar.\n", amountofguesses - tries);
				System.out.println("Sl� in en bokstav");
				char input = scanner.nextLine().charAt(0);  // Den g�r s� att spelet bara registrerar en bokstav och det �r den f�rsta  
				tries++; 
				
				if (input =='-') {  	// Om man trycker p� miuns s� avslutas spelet 
					spelarvi = false;
					Ordet�rKorrekt = true;
				}
				
				else {
					for(int i = 0 ; i < randomwordtoguess.length; i++) {		// Kollar om bokstaven �r korrekt 
						if(randomwordtoguess[i] == input) {
							playerguess[i] = input;
						}
					}
					
					if(isthewordguessed(playerguess)) {			// Kollar om ordet �r korrekt
						Ordet�rKorrekt = true;
						System.out.println("Grattis du har vunnit!!!");
					}
					
					
					
				}
			
				
			
			}
			
			if(!Ordet�rKorrekt) System.out.println("Du har inga gissningar kvar ");  // Om man f�rlorar s� kan man spela igen om man vill
			System.out.println("Vill du spela igen? (Ja/Nej) ");
			String anothergame = scanner.nextLine();
			if(anothergame.equals("Nej")) spelarvi=false;
		}

		
		System.out.println("Du har f�rlorat");
		
	}

	public static void printArray(char[] array) {  // F�r att skriva ut listan med ord

		for(int i = 0 ; i < array.length; i++) {
			System.out.print(array[i]+" ");
		
	}
	System.out.println();
}
	
	public static boolean isthewordguessed(char[] array) {  // Kollar om man hittar en _ 
		for(int i = 0 ; i < array.length; i++) {
			if (array[i] == '_') return false;
	}
	return true;
	
}
}