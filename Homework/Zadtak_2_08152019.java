package domaci_week_3_4;

import java.util.Scanner;

public class Zadtak_2_08152019 {

	public static void main(String[] args) {
		// Napisati program koji ce ispisati n brojeva Fibonacijevog niza.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj cifara iz Fibonacijevog niza koje zelite da dobijete.");
		int n = sc.nextInt();

		if (n == 1) {
			System.out.println("0");
		} else if (n == 2) {
			System.out.println("01");
		} else if (n == 2) {
			System.out.println("011");
		} else if (n <= 0) {
			System.out.println("Pogresan unos.");
		}

		else {
			int sum, br;
			System.out.print("011");
			int a = 1, b = 1;
			for (br = 0; br <(n-3); br++) {
				sum = a + b;
				System.out.print(sum);
				b=a;
				a = sum;
			}
		}
	}
}