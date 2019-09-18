package domaci_week5;

import java.util.Scanner;

public class Zadatak_1_08232019 {

	public static void main(String[] args) {
// Napisati program koji ucitava ceo broj n.Taj broj n se prosledjuje metodi koja formira
// i vraca ceo broj koji predstavlja inverzan broj. 
//Glavni program nakon toga ispisuje taj inverzan broj

		Scanner sc = new Scanner(System.in);
		System.out.println("Upisite visecifreni broj.");
		int novi = sc.nextInt();
		System.out.println(inverzniBroj(novi));
	}
	public static int inverzniBroj(int n) {
		int x = 0;
		while (n != 0) {
			int y = n % 10;
			x *= 10;
			x += y;
			n /= 10;
		}
		return x;
	}
}
