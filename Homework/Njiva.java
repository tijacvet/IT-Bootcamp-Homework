package apstraktneKlase;
/*Njiva je parcela koja ima zadat godisnji prinos po kvadratnom metru. 
Prinos po kvadratnom metru moze da se promeni. Oznaka vrste je N. 
Tekstualni oblik je Parcela:PrinosPoKvM.*/

public class Njiva extends Parcela {
	public double prinosPoKvM;

	public Njiva(double povrsina, double prinosPoKvM) {
		super(povrsina);
		this.vrsta='N';
		this.prinosPoKvM=prinosPoKvM;
		
	}
	@Override
	public double getPrinos(int godine) {
		return povrsina*prinosPoKvM;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder (); 
		sb.append(super.toString()+": "+this.prinosPoKvM);
		return sb.toString() ;
	}
}
