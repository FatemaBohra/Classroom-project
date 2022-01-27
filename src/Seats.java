/**
 * Represents a seat in a classroom.
 * Each seat has a row and column associated with it.
 * It also MIGHT  have a students assigned to it.
 * @author fatemabohra
 *
 */
public class Seats {
	
	//instance var
	
	/**
	 * Seat rows
	 */
	int rows;
	
	/**
	 * Seat columns
	 */
	int columns;
	
	/**
	 * Students assigned to this seat, otherwise null.
	 */
	Student studentInSeat;
	
	//constructor
	
	/**
	 * Creates a seat for a class at the given row and column
	 * @param rows for seats
	 * @param columns for seats
	 */
	public Seats(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
	}
	
	/**
	 * Assigned the given student in this seat
	 * @param student to assigned
	 */
	public void putStudentsInSeat(Student student) {
		this.studentInSeat = student;
	}
	
	/**
	 * Returns the rows, columns and student for this seat.
	 */
	public String toString() {
		return this.rows + ", " + this.columns + ": " + this.studentInSeat;//this will also call the toString method in the student class
	}

}
