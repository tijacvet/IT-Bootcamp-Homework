package domaci_week5;

import java.util.Scanner;

public class Zadatak_1_08212019 {

	public static void main(String[] args) {
		// Korisnik ucitava niz od n elemenata niza, kao i neko broj br.
		// Program ispisuje elemente niza deljive brojem br.
		Scanner jedan = new Scanner(System.in);
		System.out.println("Koliko elemenata niza zelite? Napisite broj.");
		int n = jedan.nextInt();
		int[] niz = new int[n];
		System.out.println("Unesite broj kojim zelite da odredjeni elementi niza budu deljivi.");
		int br = jedan.nextInt();

		System.out.print("Unesite elemente niza.");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = jedan.nextInt();
		}
		System.out.print("Elementi niza deljivi brojem " +br+ " su: ");
		for (int j = 0; j < niz.length; j++) {
			if (niz[j] % br == 0) {
				System.out.print(niz[j]+" ");
			}
		}
	}
}
