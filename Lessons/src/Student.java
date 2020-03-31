
public class Student {
	
	private String firstName;
	private String lastName;
	private int level;
	private double gpa;
	private int id;
	public static int count;
	
	public Student() {
		this("None", "None", 0, 0.0);
	}
	
	public Student(String name, String last, int levelt, double gpas) {
		
		id = count + 1;
		count++;
		firstName = name;
		lastName = last;
		if(levelt >= 0 && levelt <= 12)
		    level = levelt;
		else
			level = 0;
		
		if(gpas >= 0 && gpas <= 4.5)
		    gpa = gpas;
		else
			gpa = 0;
		
	}
	
	public String toString() {
		
		return lastName + ", " + firstName + "." + '\n' + "GPA: " + gpa + '\n' + "Grade Level: " + level + " id # " + id;
		
	}

}
