package domaci1;

import java.util.Scanner;

public class Zadatak_2a_13082019 {

	public static void main(String[] args) {
		/*a)Napisati program koji ce sabrati brojeve od 1 do 5. Program treba da ispise zbir.
		System.out.println("Unesi n: ");
				int n=sc.nextInt();
				*/

		Scanner sc=new Scanner(System.in);
		
		
		int sum=0, a=5, c;
		while (a!=0) {
			c=a--;
			sum=sum+c;

	}
		System.out.println("Zbir brojeva od 1 do 5 je:"+sum);
	}
		
}
