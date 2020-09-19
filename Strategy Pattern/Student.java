
public class Student {
	private String studentClass;
	private String studentTransport;
	Transport tr = new Transport(""); 
	GrowUPBehavior growUP;
	private int studentSports;

	public Student(String name, int sport) {
		setStudentClass(name);
		studentSports = sport;
	}

	public String getStudentTransport() {
		return tr.getName();
	}

	public int getStudentSports() {
		return studentSports;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public void setGrowUpBehaviour(GrowUPBehavior growUP) {
		this.growUP = growUP;
	}

	public void setStudentTransport(String studentTransport) {
		this.studentTransport = studentTransport;
	}

}
