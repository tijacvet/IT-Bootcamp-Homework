package domaci_week5;

import java.util.Scanner;

public class Zadatak_2_08222019 {

	public static void main(String[] args) {
		// Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve
		// metode(u mainu).
		// Prva metoda vraca proizvod unetih brojeva.
		// Druga metoda ispisuje najmanji od unesenih brojeva.
		Scanner skener = new Scanner(System.in);
		System.out.println("Unesite 3 realna broja: ");
		double a = skener.nextDouble();
		double b = skener.nextDouble();
		double c = skener.nextDouble();
		System.out.print("Proizvod elemenata niza je: " + pro(a, b, c));
		System.out.println();
		System.out.print("Najmanji element niza je: " + min(a, b, c));
	}

	public static double pro(double a1, double b1, double c1) {
		double pro;
		pro = a1 * b1 * c1;
		return pro;
	}

	public static double min(double aa, double bb, double cc) {
		if (aa < bb && aa < cc) {
			return aa;
		} else if (bb < aa && bb < cc) {
			return bb;
		} else {
			return cc;
		}
	}
}
