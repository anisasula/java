/**
 * Create a program that keeps track of students fees
 * fees already paid
 * teachers salary
 */

import java.util.List;

/**
* Create a class called Subject to represent a student of school.
* A Student should have the following information as instance variables:
* id – unique – type integer
* name – type String
* teacher – type Teacher
* student list - List<Student>
*/
public class Subject {
	
	private int id;
	private String name;
	private Teacher teacher;
	private  List<Student>  studentList; 
	
	
	public Subject() {
	}
	public Subject(int id,String name,Teacher teacher,List<Student>  studentList) {
		this.id=id;
		this.name=name;
		this.teacher=teacher;
		this.studentList=studentList;
		
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the teacher
	 */
	public Teacher getTeacher() {
		return teacher;
	}
	/**
	 * @return the studentList
	 */
	public List getStudentList() {
		return studentList;
	}
	
}
