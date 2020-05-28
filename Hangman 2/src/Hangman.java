import java.util.Random;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		Random random = new Random();
		String[] guesses = {"lila", "rosa" , "blå", "grön", "orange", "röd", "svart", "vit", "gul", "grå", "brun",};
		
		
		boolean spelarvi= true;
		while(spelarvi) {
			System.out.println("Välkommen");
			char[] randomwordtoguess = guesses[random.nextInt(guesses.length)].toCharArray(); // För att få ett slumpat ord
			int amountofguesses = randomwordtoguess.length; // Hur långa gissningar man får 
			char[] playerguess = new char[amountofguesses]; 
			
			for (int i = 0; i < playerguess.length; i++) {   // Gör så att det förekommer en _ för varje bokstav som ska stå
				playerguess[i] = '_'; 
			}
			
			boolean OrdetÄrKorrekt = false;
			int tries = 0;
			
			while (!OrdetÄrKorrekt && tries != amountofguesses) {  // Här så kollar man att hur många gissningar man har kvar och så att man slår in en bokstav
				System.out.print("Gissningar kvar:");
				printArray(playerguess);
				System.out.printf("Du har %d kvar.\n", amountofguesses - tries);
				System.out.println("Slå in en bokstav");
				char input = scanner.nextLine().charAt(0);  // Den gör så att spelet bara registrerar en bokstav och det är den första  
				tries++; 
				
				if (input =='-') {  	// Om man trycker på miuns så avslutas spelet 
					spelarvi = false;
					OrdetÄrKorrekt = true;
				}
				
				else {
					for(int i = 0 ; i < randomwordtoguess.length; i++) {		// Kollar om bokstaven är korrekt 
						if(randomwordtoguess[i] == input) {
							playerguess[i] = input;
						}
					}
					
					if(isthewordguessed(playerguess)) {			// Kollar om ordet är korrekt
						OrdetÄrKorrekt = true;
						System.out.println("Grattis du har vunnit!!!");
					}
					
					
					
				}
			
				
			
			}
			
			if(!OrdetÄrKorrekt) System.out.println("Du har inga gissningar kvar ");  // Om man förlorar så kan man spela igen om man vill
			System.out.println("Vill du spela igen? (Ja/Nej) ");
			String anothergame = scanner.nextLine();
			if(anothergame.equals("Nej")) spelarvi=false;
		}

		
		System.out.println("Du har förlorat");
		
	}

	public static void printArray(char[] array) {  // För att skriva ut listan med ord

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