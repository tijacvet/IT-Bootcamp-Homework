package domaci1;

import java.util.Scanner;

public class Zadatak_1_09082019 {

	
		public static void main(String[] args) {
			System.out.println("Proverite da li je broj paran ili neparan.");
			Scanner sc = new Scanner(System.in);
			double a; 
			System.out.println("Unesite zeljeni broj!");
			a = sc.nextDouble();
			if (a % 2 != 0) {
				System.out.println("Vas broj je neparan.");
			}
			else if (a % 2 == 0) {
				System.out.println("Vas broj je paran.");
			} 
		}
	}
