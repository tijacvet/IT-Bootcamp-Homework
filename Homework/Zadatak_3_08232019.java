package domaci_week5;

import java.util.Scanner;

public class Zadatak_3_08232019 {

	public static void main(String[] args) {
			/* Napisati program koji ucitava niz od n celih brojeva i dve metode.
			 Prva metoda vraca proizvod elemenata na neparnim pozicijama, a druga
			 vraca zbir parnih elemenata niza.*/

			Scanner sc = new Scanner(System.in);
			System.out.print("Unesite broj elemenata niza: ");
			int n = sc.nextInt();
			int[] niz = new int[n];
			ucitavanje(niz);
			proizvodNadNeparnim(niz);
			zbirParnihPoz(niz);
		}
	public static void ucitavanje(int[] niz) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			System.out.print("Unesite element niza na poziciji " + i + ": ");
			niz[i] = sc.nextInt();
		}
	}
	public static void proizvodNadNeparnim(int[] niz) {
		int pro = 1;
		for (int i = 0; i < niz.length; i++) {
			if (i % 2 == 1) {
				pro = pro * niz[i];
			}
		}
		System.out.println("Proizvod elemenata neparnih pozicija je: " + pro);
	}
	public static void zbirParnihPoz(int[] niz) {
		int suma = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0) {
				suma = suma + niz[i];
			}
		}
		System.out.println("Zbir elemenata neparnih pozicija je: " + suma);
	}
}