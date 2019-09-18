package domaci_week_6;

public class GlavniKnjige {

	public static void main(String[] args) {
		Knjige k1=new Knjige("Bajke","Braca Grim", 150);
		Knjige k2=new Knjige("Basne","Dositej Obradovic", 100);
		Knjige k3=new Knjige("Price za laku noc","Ruske narodne price", 125);
		k1.setGodIzd("1950");
		k2.setGodIzd("1960");
		k3.setGodIzd("1970");
		System.out.println(k1.getNazivKnj()+" "+ k1.getAutor()+" "+k1.getBrStr()+" "+ k1.getGodIzd());
		System.out.println(k2.getNazivKnj()+" "+ k2.getAutor()+" "+k2.getBrStr()+" "+ k2.getGodIzd());
		System.out.println(k3.getNazivKnj()+" "+ k3.getAutor()+" "+k3.getBrStr()+" "+ k3.getGodIzd());
	}
}
