/**
 * Represents a student in the class.
 * Each student has a name and ID.
 * @author fatemabohra
 *
 */
public class Student {
	
	/**
	 * Name of the student
	 */
	String name;
	
	/**
	 * ID of student.
	 */
	String ID;
	
	//constructor
	
	/**
	 * Creates a student with given name and ID.
	 * @param name of student 
	 * @param ID for student
	 */
	public Student(String name, String ID) {
		this.name = name;
		this.ID = ID;
	}
	
	/**
	 * Returns name of student.
	 */
	public String toString() {
		return this.name;
	}

}
