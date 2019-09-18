package domaci_week5;

import java.util.Scanner;

public class Zadatak_2_08212019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava duzinu niza, ucitava niz i ispisuje njegove
		// elemente inverznim redosledom.
		// Primer niza: 3 54 123 18 i Ispis: 18 123 54 32
		Scanner sc = new Scanner(System.in);
		System.out.println("Napisite broj elemenata niza.");
		int n = sc.nextInt();
		int[] niz = new int[n];
		System.out.print("Unesite elemente niza.");

		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		} 
		for (int start = 0, kraj=niz.length-1; start <= kraj; start++, kraj--) {
			int temp = niz[start];
			niz[start] = niz[kraj];
			niz[kraj] = temp;
		}
		System.out.println(niz[n]);
	}
}