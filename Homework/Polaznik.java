package ucionica;

public class Polaznik {
	/*Polaznik  ima ime i prezime koje se zadaje prilikom kreiranja polaznika. 
	 * Polaznik poseduje i identifikacioni broj  koji se moze dohvatiti. 
	 * Ime i prezime polaznika se moze dohvatiti ali ne i postaviti. 
	 * 
	 * Polaznik se ispisuje u obliku: IME_PREZIME{ID}.*/
	private static int UID=0; //get
	private String ime, prezime; //get
	private int id;
	
	public Polaznik (String ime, String prezime,int UID) {
		this.ime=ime;
		this.prezime=prezime;
		id=UID++;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getId() {
		return id;
	}
	
	public static int getUID() {
		return UID;
	}
	public Polaznik resetPolaznik() {       //jel ovo dobro resetovano
		return null;
	}
	public String ispisati() {
		return ime+"_"+prezime+"{"+id+"}";
	}
}
