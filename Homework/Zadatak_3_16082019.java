package domaci_week_3_4;

import java.util.Scanner;

public class Zadatak_3_16082019 {

	public static void main(String[] args) {
// Zadatak sa FOR sa sajta znanje.org            
//Ispisati prvih a parnih prirodnih brojeva pocevsi od ucitane vrednosti k.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite pocetnu broj.");
		int a = sc.nextInt();
		System.out.println("Unesite konacni broj.");
		int z = sc.nextInt();
		int br;
		for (br = a; br <= z; br++) {
			if (br % 2 == 0) {
				System.out.print(br + " ");
			}
		}
	}
}