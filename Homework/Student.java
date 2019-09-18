package univerzitet;
/*Student je covek koji se kreira sa brojem indeksa i ima  trenutnu godinu studija i trenutni prosek.
 Sva polja mogu samo da se dohvate. 
Studenta ispisati u formatu: 
Ime_Prezime[godina rodjenja] je student ___ (god studija) godine studija sa prosekom____ (trenutni prosek).

Profesor je covek koji ima titulu i listu predmeta na kojima drzi nastavu. 
Predmeti mogu da se dodaju i oduzimaju iz liste.
Profesora ispisati u formatu: 
Ime_Prezime[godina rodjenja] je ___(titula)  koji drzi nastavu na: <lista predmeta>.

Napisati glavni program koji ce imati bar tri studenta i dva profesora.*/

public class Student extends Covek {
	private int brIndexa; 
	private int godStudija; 
	private double prosek; 
	
	public Student (String ime, String prezime, int godRodj, int brIndexa, int godStudija, double prosek) {
		super(ime, prezime,godRodj);
		this.brIndexa=brIndexa;
		this.godStudija=godStudija;
		this.prosek=prosek;
	}

	public int getBrIndexa() {
		return brIndexa;
	}

	public int getGodStudija() {
		return godStudija;
	}

	public double getProsek() {
		return prosek;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder ();
		sb.append (this.ime+"_"+this.prezime+"["+this.getGodRodj()+"]"+" je student "+this.godStudija+ 
				" godine studija sa prosekom "+this.prosek);
		return sb.toString();
		//Ime_Prezime[godina rodjenja] je student ___ (god studija) godine studija sa prosekom____ (trenutni prosek).
	}
}
