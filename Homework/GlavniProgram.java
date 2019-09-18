package univerzitet;

public class GlavniProgram {

	public static void main(String[] args) {
		
		Profesor pr=new Profesor("Pera", "Peric", 1970 , "dr");
		Profesor pr1=new Profesor ("Zika", "Zikic", 1980, "mr");
		System.out.println(Profesor.id);               //dodatno vezbanje
		Profesor pr2=new Profesor("Persa", "Peric", 1940 , "doc");
		
		Student s1=new Student("Dusa","Dusic",1999, 111,3, 9.00 );
		Student s2=new Student("Dusan","Dusicic",2000, 112,2, 8.00 );
		//pr.ispisi();         //test
		//c1.ispisi();
		pr.setPredmeti("psihologija");
		pr.setPredmeti("filozofija");
		pr1.setPredmeti("srpska knjizevnost");
		pr1.setPredmeti("istorija jezika");
		pr2.setPredmeti("francuski");
		pr2.setPredmeti("latinskiski");

		System.out.println(s2);
		System.out.println(s1);
		System.out.println(pr.id);  //dodatno vezbanje
		System.out.println(pr);
		System.out.println(pr2);
		System.out.println(pr1);
	}

}
