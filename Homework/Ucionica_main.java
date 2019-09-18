package ucionica;

public class Ucionica_main {

	public static void main(String[] args) {
		Polaznik p1=new Polaznik("Tijana", "Cvetkovic", 0);
		Polaznik p2=new Polaznik("Andjela", "Cvet", 1);
		Laptop l1=new Laptop ("Lenovo", p1);
		Laptop l2=new Laptop ("Asus", p2);
	
		System.out.println(p1.ispisati());
		System.out.println(p2.ispisati());
		p2.resetPolaznik();                   //kako da resetujem polaznika
		System.out.println(l1.ispisati());
		System.out.println(l2.ispisati());
		
		
		System.out.println(p1.ispisati());
		System.out.println(p2.ispisati());
		System.out.println(l1.ispisati());
		System.out.println(l2.ispisati());
	} 
}
