package domaci1;

import java.util.Scanner;

public class Zadatak_2c_13082019 {

	public static void main(String[] args) {
		// c) Napisati program koji ce sabrati sve brojeve od k do n (k i n uneti preko konzole). Program treba da ispise zbir.

		Scanner sc=new Scanner(System.in);

		System.out.println("Uneti broj k: ");
		int k=sc.nextInt();
		System.out.println("Uneti broj n: ");
		int n=sc.nextInt();
		
		int sum=0, c=0;
		
		if (k>n) {
		while (c<k) {
			n=c++;
			sum=sum+c;
		}
		System.out.println("Zbir brojeva od n do k je: "+sum);
		}
		else {
			while (n>k) { 
				k=++c;         
				sum=sum+c;
			}
			System.out.println("Zbir brojeva od k do n je: "+sum);
			}
		}
	}
