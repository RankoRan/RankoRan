import java.util.Scanner;

public class v37{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Vad heter du?");
		String namn = scan.next();
		namn += scan.nextLine();
		
		System.out.println("Hur gammal �r du?");
		String �lder = scan.next();
		�lder += scan.nextLine();
		
		System.out.println("Vad �r din adress");
		String adress = scan.next();
		adress += scan.nextLine();
		
		System.out.println("Vad �r ditt postnummer?");
		String postnummer = scan.next();
		postnummer += scan.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		String stad = scan.next();
		
		System.out.println("Vad �r ditt telefonnummer?");
		String telefon = scan.next();
		
		System.out.println("           ");
		System.out.println("Informaton:");
		System.out.println("Namn:    " + namn + "");
		System.out.println("�lder:   " + �lder + "");
		System.out.println("Adress:  " + adress + "");
		System.out.println("         "+ postnummer + " " + stad + "");
		System.out.println("Telefon: " + telefon + "");
	}
}