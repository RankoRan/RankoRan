import java.util.Scanner;

public class v37{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Vad heter du?");
		String name = scan.next();
		
		System.out.println("Hur gammal �r du?");
		String age = scan.next();
		
		System.out.println("Vad �r din adress");
		String adress = scan.next();
		
		System.out.println("Vad �r ditt postnummer?");
		String postnummer = scan.next();
		
		System.out.println("Vilken stad bor du i?");
		String stad = scan.next();
		
		System.out.println("Vad �r ditt telefonnummer?");
		String telefon = scan.next();
	}
}