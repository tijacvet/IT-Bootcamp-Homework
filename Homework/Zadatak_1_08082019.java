package domaci1;

import java.util.Scanner;

public class Zadatak_1_08082019 {

	public static void main(String[] args) {
			System.out.println("Izdracunavanje obima i povrsine pravouganika za glupane :)");
			Scanner sc = new Scanner(System.in);
			double a, b, O, P; 
			System.out.println("Unesite duzinu prve stranice!");
			a = sc.nextDouble();
			System.out.println("Unesite duzinu druge stranice!");
			b = sc.nextDouble();
			O = 2*(a+b);
			P= a*b;
			if (a>0 && b>0) {
				System.out.println("Obim pravougaonnika je: "+O);
				System.out.println("Povrsina pravugaonika je: "+P);
			}
			else{
				System.out.println("Proverite da li ste uneli tacne vrednosti.");
			}
		}
	}
