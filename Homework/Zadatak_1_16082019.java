package domaci_week_3_4;

import java.util.Scanner;

public class Zadatak_1_16082019 {

	public static void main(String[] args) {
// Zadatak sa IF sa sajta znanje.org 
//Ucitati poluprecnik kruga. Ako je veci od 5 izracunati obim kruga, inace izracunati povrsinu kruga.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite poluprecnik kruga.");
		double r = sc.nextDouble();
		if (r > 5) {
			double o = 2 * r * 3.14;
			System.out.println("Obim kruga je: " + o);
		} else if (r <= 5 && r > 0) {
			double p = r * r * 3.14;
			System.out.println("Povrsina kruga je: " + p);
		} else {
			System.out.println("Pogresan unos.");
		}
	}
}