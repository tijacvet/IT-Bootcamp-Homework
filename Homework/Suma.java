package apstraktneKlase;
/*Suma je parcela koja ima zadate povrsinu koju zauzimaju stabla, 
prinos po zrelom stablu i period sazrevanja od zasada do sece 
izrazen u celom broju godina. Oznaka vrste je S. 
Prinos se ostvaruje formulom 
povrsina_parcele/povrsina_stabla*prinos_stabla*(godine/sazrevanje)
Tekstualni oblik je *Parcela:(povrsStabla,prinosSt,Period).
*Ovo se ostvaruje pozivom super.toString();*/

public class Suma extends Parcela {
	public int periodSazrevanja;
	public double povrsStabla, prinosSt; 

	public Suma(double povrsina, int periodSazrevanja, double povrsStabla, double prinosSt) {
		super(povrsina);
		this.periodSazrevanja=periodSazrevanja;
		this.povrsStabla=povrsStabla;
		this.prinosSt=prinosSt;
		this.vrsta='S';
	}

	public int getPeriodSazrevanja() {
		return periodSazrevanja;
	} 
	@Override
	public double getPrinos(int godine) {
			return (povrsina/povrsStabla*prinosSt*(godine/periodSazrevanja));
		}

	public String toString() {
		StringBuilder sb=new StringBuilder (); 
		sb.append(super.toString()+": ("+this.povrsina+", "+this.prinosSt+", "+this.periodSazrevanja+")");
		return sb.toString() ;
	}
}
