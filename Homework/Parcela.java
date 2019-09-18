package apstraktneKlase;
/*Parcela ima jedinstven automatski generisan celobrojan identifikator i 
 * zadatu povrsinu(u kvadratnim metrima) prilikom kreiranja. 
 * Mogu da joj se dohvate sadrzani podaci, kao i jednoslovna vrsta(char). 
 * Moze da joj se odredi prinos u periodu zadatom brojem godina.
 * Moze da se sastavi tekstualni opis u obliku VRSTA-ID[POVRSINA].*/
public abstract class Parcela {
	public static int uid=0;
	private int id;
	protected char vrsta;
	public double povrsina;
	
	public Parcela(double povrsina) {
		this.povrsina=povrsina;
		this.id=uid++;
	}

	public static int getId() {
		return uid;
	}
	public double getVrsta() {
		return vrsta;
	}
	public double getPovrsina() {
		return povrsina;
	}

	public abstract double getPrinos(int godine);
	
	public String toString() {
		StringBuilder sb=new StringBuilder (); 
		sb.append(this.vrsta+"-"+id+"["+this.povrsina+"]");
		return sb.toString();
	}
}
