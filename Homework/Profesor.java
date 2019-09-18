package univerzitet;

import java.util.ArrayList; //ok
import java.util.List;   //ok

/*Profesor je covek koji ima titulu i listu predmeta na kojima drzi nastavu. 
Predmeti mogu da se dodaju i oduzimaju iz liste.
Profesora ispisati u formatu: 
Ime_Prezime[godina rodjenja] je ___(titula)  koji drzi nastavu na: <lista predmeta>.

Napisati glavni program koji ce imati bar tri studenta i dva profesora.*/

public class Profesor extends Covek{
	
	static int id=0;	
	
	public String titula;
	//public String[] listaPred;
	public ArrayList<String>predmeti;
	
	int n;
	private Covek covek; //?

	public Profesor (String ime, String prezime, int godRodj, String titula) {
		super(ime, prezime, godRodj);
		this.titula=titula;
		this.predmeti=new ArrayList<String>();  //ok
		this.id=++id;
	}

	public String getTitula() {
		return titula;
	}

	public void setTitula(String titula) {
		this.titula = titula;
	}

	public ArrayList<String> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(String predmet) {
		this.predmeti.add(predmet);               //ok
	}
	public String toString() {
		StringBuilder sb=new StringBuilder ();
		sb.append(this.ime+"_"+this.prezime+"["+this.getGodRodj()+"]"+this.titula+" koji drzi ");
		for (String p:predmeti) {
			sb.append(p+" ");
		}
		return sb.toString();
	}
}
