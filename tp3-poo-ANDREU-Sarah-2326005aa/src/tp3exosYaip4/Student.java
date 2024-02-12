package tp3exosYaip4;

public class Student extends Person{

	public static String program;
	public static int year;
	public static double fee;
	
	public static String getProgram() {
		return program;
	}
	public static void setProgram(String program) {
		Student.program = program;
	}
	public static int getYear() {
		return year;
	}
	public static void setYear(int year) {
		Student.year = year;
	}
	public static double getFee() {
		return fee;
	}
	public static void setFee(double fee) {
		Student.fee = fee;
	}
	
	public Student(String name, String adress, String program, int year, double fee) {
		super(name, adress);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		return "Student [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
