package apstraktneKlase;

public class GlavniProgram {
	/*Napisati i glavni program koji kreira niz parcela koje mogu da budu 
	ili sume ili njive i ispisuje njihov prinos u toku 3 godine. */

	public static void main(String[] args) {
		
		Suma s1=new Suma(100, 15, 150, 30);
		Suma s2=new Suma(50, 8, 80, 20);
		Njiva n1=new Njiva(200, 2);
		Njiva n2=new Njiva(400, 3);
		
		Parcela ParcelaNiz[] = {s1, s2, n1, n2 };
		
		for (int i=0; i<ParcelaNiz.length; i++) {
			System.out.println(ParcelaNiz[i]);
		}
	}
}
