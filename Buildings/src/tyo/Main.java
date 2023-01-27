package tyo;
import java.util.Scanner;
public class Main {
	private static Scanner scanner = new Scanner (System.in);
	
	public static void main(String[] args) {
		String nimi,sijainti,name,sAika;
		double pintaala,pintaalaR,huoneMaara;
		
		System.out.println("Anna tontin nimi >");
		nimi = scanner.nextLine();
		
		System.out.println("Anna sijainti tyylissa -Leveys- -Pituus-");
		sijainti = scanner.nextLine();
		
		System.out.println("Anna tontin pinta-ala");
		pintaala= scanner.nextDouble();
		while (pintaala<1) {
			System.out.println("pinta-alan tulee olla suurempi kuin yksi");
			System.out.println("Anna tontin pinta-ala");
			pintaala= scanner.nextDouble();
		}
		
		System.out.println("Anna talon pinta-ala");
		pintaalaR= scanner.nextDouble();
		while (pintaalaR<1) {
			System.out.println("pinta-alan tulee olla suurempi kuin yksi");
			System.out.println("Anna talon pinta-ala");
			pintaalaR= scanner.nextDouble();
		}
		
		System.out.println("Anna huoneiden lukumaara");
		huoneMaara= scanner.nextDouble();
		while (huoneMaara<1) {
			System.out.println("Kaikissa taloissa on vahintaan yksi huone");
			System.out.println("Anna huoneiden lukumaara");
			huoneMaara= scanner.nextDouble();
		}
		
		System.out.println("Anna asukkaan nimi");
		name= scanner.nextLine();
		name= scanner.nextLine();
			
		System.out.println("Anna asukkaan syntyma aika");
		sAika = scanner.nextLine();
		
		scanner.close();
		
	    Tontti uusi = new Tontti(nimi,sijainti,pintaala,pintaalaR,huoneMaara,name,sAika);
	    System.out.println(uusi);
	}
}
