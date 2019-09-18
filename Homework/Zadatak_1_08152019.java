package domaci_week_3_4;

import java.util.Scanner;

public class Zadatak_1_08152019 {

	public static void main(String[] args) {
		// Napisati program - meni - za izracunavanje i ispis povrsina geometrijskih
		// tela
		// (kocke, kvadra, valjka, lopte).
		// Koristiti do while petlju i switch grananje. Za izlaz koristiti nulu (0).

		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Ukucajte broj geometrijskog tela za koji vam je potrebno racunanje povrsine:");
		System.out.println("Kocka - 1");
		System.out.println("Kvadar - 2");
		System.out.println("Valjak - 3");
		System.out.println("Lopta - 4");
		System.out.println("Izlaz iz racunaljke :) - 0");
		n = sc.nextInt();

		switch (n) {
		case 1:
			System.out.println("Unesite duzinu stranice kocke.");
			double a = sc.nextDouble();
			double p = sc.nextDouble();
			p = 6 * a * a;
			System.out.println("Povrsina kocke je: " + p);
			if (a <= 0) {
				System.out.println("Los unos!");
			}
			break;
		case 2:
			System.out.println("Unesite duzinu stranice a kvadra.");
			double aa = sc.nextDouble();
			System.out.println("Unesite duzinu stranice b kvadra.");
			double bb = sc.nextDouble();
			System.out.println("Unesite duzinu stranice c kvadra.");
			double cc = sc.nextDouble();
			double pp = 2 * (aa * bb + bb * cc + cc * aa);
			System.out.println("Povrsina kvadra je: " + pp);
			if (aa <= 0 && bb <= 0 && cc <= 0) {
				System.out.println("Los unos!");
			}
			break;
		case 3:
			System.out.println("Unesite duzinu poluprecnika valjka.");
			double r = sc.nextDouble();
			System.out.println("Unesite unesite visinu valjka.");
			double h = sc.nextDouble();
			double ppp = 2 * r * 3.14 * (r + h);
			System.out.println("Povrsina valjka je: " + ppp);
			if (r <= 0 && h <= 0) {
				System.out.println("Los unos!");
			}
			break;
		case 4:
			System.out.println("Unesite duzinu poluprecnika lopte.");
			double rr = sc.nextDouble();
			double pppp = 4 * 3.14 * rr * rr;
			System.out.println("Povrsina lopte je: " + pppp);
			if (rr <= 0) {
				System.out.println("Los unos!");
			}
			break;
		case 0:
			System.out.println("Izasli ste iz kalkulatora.");
			break;
		default:
			System.out.println("Los unos.");
			break;
		}
		while (n != 0);
	}
}
