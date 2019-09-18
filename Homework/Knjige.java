package domaci_week_6;

public class Knjige {
	// Napisati klasu Knjige koja ima sledeca polja: 
	//naziv knjige, autora, broj strana, godinu izdanja. 
	//Sva polja mogu da se dohvate, a godina izdanja moze i da se postavi.
	//Napisati glavni program koji kreira tri knjige i ispisuje sve njihove podatke.
			private String nazivKnj, autor; //get
			private int brStr;
			private String godIzd;   //get & set
			
			public Knjige(String nazivKnj,String autor, int brStr) {
				this.nazivKnj=nazivKnj;
				this.autor=autor;
				this.brStr=brStr;
				String godIzd="";
			}
			public String getNazivKnj() {
				return nazivKnj;
			}
			public String getAutor() {
				return autor;
			}
			public int getBrStr() {
				return brStr;
			}
			public String getGodIzd() {
				return godIzd;
			}
			public void setGodIzd(String godIzd) {
				this.godIzd=godIzd;
			}
}
