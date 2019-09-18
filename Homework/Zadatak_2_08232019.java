package domaci_week5;

import java.util.Scanner;

public class Zadatak_2_08232019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava tri cela broja i metodu koja ispisuje
		// brojeve od prvog do drugog (ukljucujuci i njih) koji su deljivi trecim
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite 3 cela broja: ");
		int novniz[] = new int[3];
		ucitavanjeNiza(novniz);
	}

	public static void ucitavanjeNiza(int[] novniz) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < novniz.length; i++) {
			novniz[i] = sc.nextInt();
		}
		System.out.println("Trecim brojem su deljivi sledeci brojevi: ");
		for (; novniz[0] < novniz[1]; novniz[0]++) {
			if ((novniz[0]) % (novniz[2]) == 0)
				System.out.print(novniz[0] + " ");
		}
	}
}
