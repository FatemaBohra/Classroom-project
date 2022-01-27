import java.util.ArrayList;

/**
 * Represents a classroom with students.
 * Each classroom has a list of students and an array that represents the seats in the classroom.
 * @author fatemabohra
 *
 */
public class Classroom {
	
	//instance var
	/**
	 * name of the building.
	 */
	String BuildingName;
	
	/**
	 * name of classroom.
	 */
	String roomName;
	
	/**
	 * Lists of students in a classroom
	 */
	ArrayList<Student> student;
	
	/**
	 * sets in the classroom.
	 */
	Seats[][] seats;//Seats are represented by two dimensional array
	
	//constructor
	
	/**
	 * creates a classroom with given building name, room name, number of rows of seats, number of columns of seats.
	 * @param BuildingName of building
	 * @param roomName of room
	 * @param rows for seats
	 * @param columns for seats
	 */
	public Classroom(String BuildingName, String roomName, int rows, int columns) {
		
		//set building name
		this.BuildingName = BuildingName;
		
		//set room name
		this.roomName = roomName;
		
		//initialize seats array
		this.seats = new Seats[rows][columns];
		
		//populate seats array with instances of seat class
		//iterate over rows
		for (int i = 0; i < rows; i++) {
			
			//iterate over columns
			for (int j = 0; j < columns; j++) {
				
				//give each location its own new instance of seat class
				// given i(rows) and j(columns) location in the array.
				seats[i][j] = new Seats(i, j);
			}
		}	
		
		//initialize list of students
		this.student = new ArrayList<Student>();
			
		}
	
	/**
	 * Adds the given student to list of student 
	 * @param studento add
	 */
	public void addAStudent(Student student) {
		this.student.add(student);
	}
	
	/**
	 * Finds an available seat and assigns to the given student.
	 * @param student to assign
	 */
	public void assignStudentToSeat(Student student) {
		
		int rows = this.seats.length;//gets the number of rows of seats
		int columns = this.seats[0].length;//gets number of columns of seats
		
		//iterate over rows and columns
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				//get seat in location and see if it's available by checking if there is a student in the seat
				if (this.seats[i][j].studentInSeat == null) { //if null, no student has been assigned to it
					
					//assigned given student
					this.seats[i][j].putStudentsInSeat(student);
					
					//exist the loop and method all at once
					return;
				}
			}
		}
	}
	
	/**
	 * Prints all the student in the classroom.
	 */
	public void printAllStudents() {
		System.out.println("Students in the class : ");
		
		for (Student student : this.student) {
			System.out.println(student); // this will call the toString method in the student class
		}
	}
	
	/**
	 * Returns layout of classroom, with seats and students info.
	 */
	public String toString() {
		String s = "\n";
		
		int rows = this.seats.length;//gets the number of rows of seats
		int columns = this.seats[0].length;//gets number of columns of seats
		
		//iterate over rows and columns
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				s += this.seats[i][j] + "\t"; //calls the toString method in the seat class
			}
			s += "\n"; //adds the newline t the end of each row
		}
		return s;
	
	}
	
	public static void main(String[] args) {
		
		//create classroom
		Classroom hunstman = new Classroom("HH", "105", 10, 5);
		
		//create student
		Student Finegan = new Student("Finegan", "FinW");
		Student Bob = new Student("Bob", "BB");
		
		//add students to classroom
		hunstman.addAStudent(Finegan);
		hunstman.addAStudent(Bob);
		
		//assign students to seat
		hunstman.assignStudentToSeat(Finegan);
		hunstman.assignStudentToSeat(Bob);
		
		//print list of all students in the classroom
		hunstman.printAllStudents();
		
		//print classroom itself
		System.out.println(hunstman);//this will also call the toString method in the classroom class
		
	}

}
