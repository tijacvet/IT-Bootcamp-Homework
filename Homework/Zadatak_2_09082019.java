package domaci1;

import java.util.Scanner;

public class Zadatak_2_09082019 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		    System.out.print("Racunamo li povrsinu za kvadrat, pravougaonik ili krug?");
		    String a;
		    a = sc.nextLine();
		    switch (a) {
		    case "Kvadrat":
				System.out.println("Unesite duzinu stranice!");
				double c, P;
				c = sc.nextDouble();
				P= c*c;
				if (c>0) {
					System.out.println("Povrsina kvadrata je: "+P);
				}
				else{
					System.out.println("Proverite da li ste uneli tacne vrednosti.");
				} break;
		        case "Pravougaonik":
		        	double d, e, p;
		        	System.out.println("Unesite duzinu prve stranice!");
					d = sc.nextDouble();
					System.out.println("Unesite duzinu druge stranice!");
					e = sc.nextDouble();
					p= d*e;
					if (e>0 && d>0) {
						System.out.println("Povrsina kvadrata je: "+p);
					}
					else{
						System.out.println("Proverite da li ste uneli tacne vrednosti.");
					}
		            break; 
		        case "Krug":
		        	System.out.println("Unesite duzinu precnika!");
					double r, j;
					r = sc.nextDouble();
					j= 2*r * 3.14;
					if (r>0) {
						System.out.println("Povrsina kruga je: "+j);
					}
					else{
						System.out.println("Proverite da li ste uneli tacne vrednosti.");
					} break;
	}
		}
	}