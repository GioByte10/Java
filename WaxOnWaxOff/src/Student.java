
class Student {
	
	private String firstName;
	private String lastName;
	private int grade;
	private String email;
	private boolean enrolled;
	
	public Student (String firstName, String lastName, int grade, String email, boolean enrolled) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.email = email;
		this.enrolled = enrolled;
	
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEnrolled() {
		return enrolled;
	}

	public void setEnrolled(boolean enrolled) {
		this.enrolled = enrolled;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
