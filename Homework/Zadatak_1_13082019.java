package domaci1;

public class Zadatak_1_13082019 {

	public static void main(String[] args) {
		/*
		 * Napisati 8 primera za post inkrementu (i++), pre inkrementu (++i), post
		 * dekrementu (i--) i pre dekrementu (--i) i u programu u komentarima opisati
		 * kako koji primer funkcionise. Napisati po 2 primera o svakom.
		 */
		int n = 0, i=1;

		while (n < 11) {
			System.out.println("Hello World");
			n = ++i; 
			/*ovde sam n povecala za 1 i svaki put kad se izvrsi iteracija, n se poveca za jos 1.
			 * Prvo se ispisalo Hello World to bi bi odmah znacilo da n dobija vrednost 2 
			 * (da sam stavila i++, vrednost n bi bila 1, i onda bi mi ispisalo poruku 11 puta), 
			 * posle toga ide, 3, 4, 5, 6, 7, 8, 9, 10. Rezultat je 10 stampanja/ispisivanja.
			 */
		}
	}
}
/* Uzmimo pocetnu vrednost i=10, j=5 i pogledajmo primere odvojeno, ne nadovezuju se jedan na drugi:
 * {j=++1; j=11}
 * {j=i++; postinkrement, prvo se dodaje vrednost i, ovde je i=11, ali je j=10}
 * {i=i++, ovo može da se koristi u petlji, prvo bi i=10, sledeci put bi bilo i=11...}
 * 
 * {j=--i (j=9, i=9)}
 * {j=--j (j=4, preinkrement,posle sledece iteracije j=3 itd.)}
 * {j=j-- (postinkrement,u prvoj iteraciji j=5, u drugoj j=4 itd.)}
 * {j=i-- (u prvoj iteraciji j=10, i=9, u drugoj je j= 9, i=8)}
 */ 
