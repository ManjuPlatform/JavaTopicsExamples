package ifConditions;


public class Ifcondition {
	public static void main(String[] args) {
		String city = "delhi";
		if (city == "noida") {
			System.out.println("city is noida");
		} else if (city == "mumbai") {
			System.out.println("mumbai");
		} else if (city == "kerala") {
			System.out.println("kerala");
		} else
			System.out.println(city);
	}

}
