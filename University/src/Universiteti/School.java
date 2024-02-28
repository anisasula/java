/**
* Create a class School that should include the following information as instance
variables:
* students – type List<Student>
* teachers – type List<Teacher>
* total money earned – type double
* total money spent – type double
* create a method addTeacher that adds a Teacher in the list
* create a method addStudent that adds a Student in the list
*/
package Universiteti;

import java.util.ArrayList;
import java.util.List;

public class School {
	private List< Student> student;
	private List<Teacher> teacher;
	private static double totalMoneyEarned;
	private static double totalMoneySpent;
	static final List<Integer> STUDENTIDLIST = new ArrayList<>();
	static final List<Integer> TEACHERIDLIST = new ArrayList<>();
	
	public School ( List< Student> student,List<Teacher> teacher,double totalMoneyEarned,double totalMoneySpent) {
		student = new ArrayList<>();
        teacher = new ArrayList<>();
        totalMoneyEarned = 0.0;
        totalMoneySpent = 0.0;
	}
	/**
	 * @return the student
	 */
	public List<Student> getStudent() {return student;}
	/**
	 * @param student the student to set
	 */
	public void setStudent(List<Student> student) {this.student = student;}
	/**
	 * @return the teacher
	 */
	public List<Teacher> getTeacher() {return teacher;}
	/**
	 * @param teacher the teacher to set
	 */
	public void setTeacher(List<Teacher> teacher) {this.teacher = teacher;}
	/**
	 * @return the totalMoneyEarned
	 */
	public double getTotalMoneyEarned() {return totalMoneyEarned;}
	/**
	 * @param totalMoneyEarned the totalMoneyEarned to set
	 */
	public void setTotalMoneyEarned(double totalMoneyEarned) {this.totalMoneyEarned = totalMoneyEarned;}
	/**
	 * @return the totalMoneySpent
	 */
	public double getTotalMoneySpent() {return totalMoneySpent;}
	/**
	 * @param totalMoneySpent the totalMoneySpent to set
	 */
	public void setTotalMoneySpent(double totalMoneySpent) {this.totalMoneySpent = totalMoneySpent;}
	
	// Define the method to add a Teacher
    public void addTeacher(Teacher teacher) {
    	  ((List<Teacher>) teacher).add(teacher);
    }
    
    // Define the method to add a Student
	public void addStudent(Student student) {
        ((List<Student>) student).add(student);
    }
	 // Method to update the total money earned and spent
    public static void updateMoney(double earned, double spent) {
        totalMoneyEarned += earned;
        totalMoneySpent += spent;
    }
    @Override
    public String toString() {
    	return String.format("Student: %d\n  Teacher: %s\n  Total Money Earned  %.2f euro\n"
    			+ " Total Money Spent: %.2f euro\n",student,teacher,totalMoneyEarned,totalMoneySpent);
    }
}
