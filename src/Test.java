
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville v1 = new Ville("Toulouse","France",5000000);
		Ville v2 = new Ville("chicago","Usa",1300000);
		Ville v3 = new Ville("conakry","Guinée",20000000);
		//System.out.println("v1:" + v1.getNom() + " " + v1.getPays() +" "+v1.getNbHabitnts());
		v1.display();
		v1.setPays("USA");
		v1.setNbHabitants(413000);
		v1.setNom("Toulouse");
		v1.display();
		
		v2.display();
		v3.display();

	}

}
