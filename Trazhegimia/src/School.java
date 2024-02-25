/**
 * Create a program that keeps track of students fees
 * fees already paid
 * teachers salary
 */

import java.util.List;

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

public class School {

	private List<Studenti>  studenti;
	private List<Teacher> teacher;
	private double totalMoneyEarned;
	private double totalMoneySpend;
	
	
	public School() {
	}
	public School(List<Studenti>  studenti,List<Teacher> teacher,double totalMoneyEarned,double totalMoneySpend) {
		this.studenti=studenti;
		this.teacher=teacher;
		this.totalMoneyEarned=totalMoneyEarned;
		this.totalMoneySpend=totalMoneySpend;
	}
}
