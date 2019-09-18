package domaci1;

import java.util.Scanner;

public class Zadatak_2_12082019 {

	public static void main(String[] args) {
		/*Napisati program koji racuna sumu parnih brojeva i 
		 * proizvod neparnih brojeva od 0 do n. Koristiti jednu petlju.
		 */
		Scanner sc=new Scanner(System.in);
		int x=0, sum=0, y=1;
		System.out.println("Unesi n: ");
		int n=sc.nextInt();
		
		while (x<=n) {
			if (x%2==0) {
				sum=sum+x;
				x=x+1;
			} 
			else {
				y=y*x;
				x=x+1;
			}
		}	   
		System.out.println("Rezultat sumiranih parnih brojeva je: "+sum);
		System.out.println("Proizvod svih neparnih brojeva je: "+y);
	}
}
