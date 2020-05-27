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
			char[] randomwordtoguess = guesses[random.nextInt(guesses.length)].toCharArray();
			int amountofguesses = randomwordtoguess.length;
			char[] playerguess = new char[amountofguesses];
			
			for (int i = 0; i < playerguess.length; i++) {
				playerguess[i] = '_'; 
			}
			
			boolean OrdetÄrKorrekt = false;
			int tries = 0;
			
			while (!OrdetÄrKorrekt && tries != amountofguesses) {
				System.out.print("Gissningar kvar:");
				printArray(playerguess);
				System.out.printf("Du har %d kvar.\n", amountofguesses - tries);
				System.out.println("Slå in en bokstav");
				char input = scanner.nextLine().charAt(0); 
				tries++; 
				
				if (input =='-') {
					spelarvi = false;
					OrdetÄrKorrekt = true;
				}
				
				else {
					for(int i = 0 ; i < randomwordtoguess.length; i++) {
						if(randomwordtoguess[i] == input) {
							playerguess[i] = input;
						}
					}
					
					if(isthewordguessed(playerguess)) {
						OrdetÄrKorrekt = true;
						System.out.println("Grattis du har vunnit!!!");
					}
					
					
					
				}
			
				
			
			}
			
			if(!OrdetÄrKorrekt) System.out.println("Du har inga gissningar kvar ");
			System.out.println("Vill du spela igen? (Ja/Nej) ");
			String anothergame = scanner.nextLine();
			if(anothergame.equals("Nej")) spelarvi=false;
		}

		
		System.out.println("Du har förlorat");
		
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