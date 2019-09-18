package domaci1;

import java.util.Scanner;

public class Zadatak_2b_13082019 {

	public static void main(String[] args) {
// b) Napisati program koji ce sabrati sve brojeve od 1 do n (n uneti preko konzole).  Program treba da ispise zbir.

		Scanner sc=new Scanner(System.in);
		System.out.println("Uneti broj n: ");
		int n=sc.nextInt();
		int sum=0, c=0;
		while (n>=1) {
			c=n--;
			sum=sum+c;
		}
		System.out.println("Zbir brojeva od 1 do n je: "+sum);

	}

}
