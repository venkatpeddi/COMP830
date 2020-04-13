import java.util.ArrayList;

abstract class SpaceShip {
	int tonnage;
	String name;
	public int getTonnage() 
	{
		return tonnage; 
	}
	
	public String getName() 
	{
		return name;
	}
	public abstract String getFranchise();
}



class StarWarsShips extends SpaceShip{

	int tonnage;
	String name;
	String franchise;
	
	public StarWarsShips(int tonnage, String name,String franchise) {
		this.tonnage = tonnage;
		this.name = name;
		this.franchise = franchise;
	}
	
	public int getTonnage() {
		return tonnage;
	}
	public String getName() {
		return name;
	}
	public String getFranchise() {

		return franchise;
	}

}

class StarTrekShips extends SpaceShip{

	int tonnage;
	String name;
	String franchise;
	
	public StarTrekShips(int tonnage, String name,String franchise) {
		this.tonnage = tonnage;
		this.name = name;
		this.franchise = franchise;
	}
	
	public int getTonnage() {
		return tonnage;
	}
	public String getName() {
		return name;
	}
	public String getFranchise() {

		return franchise;
	}

}



class OtherSciFiSpaceShips extends SpaceShip{

	int tonnage;
	String name;
	String franchise;
	
	public OtherSciFiSpaceShips(int tonnage, String name,String franchise) {
		this.tonnage = tonnage;
		this.name = name;
		this.franchise = franchise;
	}
	
	public int getTonnage() {
		return tonnage;
	}
	public String getName() {
		return name;
	}
	public String getFranchise() {

		return franchise;
	}

}

public class ExamQ3Abstract {
	public static void main(String[] args) {
		ArrayList<SpaceShip> spaceships= new ArrayList<SpaceShip>();
		StarWarsShips warship1 = new StarWarsShips(1,"ship1","frachise1");
		spaceships.add(warship1);
		StarWarsShips warship2 = new StarWarsShips(2,"ship2","frachise2");
		spaceships.add(warship2);
		StarWarsShips warship3 = new StarWarsShips(3,"ship3","frachise3");
		spaceships.add(warship3);
		StarTrekShips trekship1 = new StarTrekShips(1,"trek1","franchise1");
		spaceships.add(trekship1);
		StarTrekShips trekship2 = new StarTrekShips(2,"trek2","franchise2");
		spaceships.add(trekship2);
		StarTrekShips trekship3 = new StarTrekShips(3,"trek3"," franchise3");
		spaceships.add(trekship3);
		OtherSciFiSpaceShips scifiship1 = new OtherSciFiSpaceShips(1,"sciFi1","franchise1");		
		spaceships.add(scifiship1);
		OtherSciFiSpaceShips scifiship2 = new OtherSciFiSpaceShips(2,"sciFi2","franchise2");
		spaceships.add(scifiship2);
		OtherSciFiSpaceShips scifiship3 = new OtherSciFiSpaceShips(3,"sciFi3","franchise3");
		spaceships.add(scifiship3);
		for(SpaceShip ship:spaceships) 
		{
			System.out.println("tonnage: " + ship.getTonnage());
			System.out.println("name:  " + ship.getName());
			System.out.println("franchise:  " + ship.getFranchise());	
		}
	}
}
