package domaci_week_3_4;

import java.util.Scanner;

public class Zadatak_2_16082019 {

	public static void main(String[] args) {
// Zadatak sa WHILE sa sajta znanje.org
//Aritmeticka sredina neparnih prirodnih brojeva od 1 do n.

		Scanner sc = new Scanner(System.in);
		System.out.println("Iznalazenje aritmeticke sredine neparnih brojeva od 1 do broja po vasem izboru.");
		System.out.println("Unesite zeljeni broj.");
		double n = sc.nextDouble();
		double sum = 0, a = 1, br = 0;
		while (a<=n) {
			br++;
			sum+=a;
			a=a+2;
		}
		System.out.println("Aritmetcka sredina svih neparnih brojeva od 1 do n je: " + sum / br);
	}
}