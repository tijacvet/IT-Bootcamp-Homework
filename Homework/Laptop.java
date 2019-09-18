package ucionica;

public class Laptop {
	/*Laptop poseduje polaznika i marku koji se zadaju prilikom kreiranja. 
	 * Marka moze samo da se dohvati. 
	 * Laptop takdje moze da menja polaznika ili da ostane bez polaznika. 
	 * 
	 * Moze da se ispise u obliku: MARKA{POLAZNIK}*/
	
	private String marka; //get
	private Polaznik pol; //get, set, reset
	
	public Laptop(String marka, Polaznik p) {
		this.marka=marka;
		this.pol=p;
	}

	public String getMarka() {
		return marka;
	}
	
	public Polaznik setPolaznik() {   //da li je ovo dobro setovano, zato sto nema void
		return pol;
	}

	public Polaznik getPolaznik() {
		return pol;
	}
	
	public String ispisati() {
		String s;
		if (pol==null) {
			s="Nema polaznika";
		}else {
			s=pol.ispisati();
		}
		return marka +"{"+s+"}";
	}
}
