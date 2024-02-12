package tp3exosYaip4;

public class Person {
	public static String name;
	public static String adress;
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Person.name = name;
	}
	public static String getAdress() {
		return adress;
	}
	public static void setAdress(String adress) {
		Person.adress = adress;
	}
	
	public Person (String name, String adress) {
		this.name = name;
		this.adress = adress;	
	}
	
	@Override
	public String toString() {
		return "Person [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
