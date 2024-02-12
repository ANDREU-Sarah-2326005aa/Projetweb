package tp3exosYaip4;

public class Staff extends Person{

	public static String school;
	public static double pay;

	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		Staff.school = school;
	}
	public static double getPay() {
		return pay;
	}
	public static void setPay(double pay) {
		Staff.pay = pay;
	}
	@Override
	public String toString() {
		return "Staff [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	public Staff (String name, String adress, String school, double pay) {
		super(name, adress);
		this.pay = pay;
		this.school = school;
	}
}
	
