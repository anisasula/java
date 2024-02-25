/**
 * Create a program that keeps track of students fees
 * fees already paid
 * teachers salary
 */
/**
 * Create a class called Teacher that represents a teacher of school.
 * A Teacher should have the following information as instance variables:
 * id – unique – type integer
 * name – type String
 * salary – type double
 */
public class Teacher {	
private int id;
private String name;
private double salary;

public Teacher () {
}
public Teacher(int id, String name, double salary) {
	//if(Teacher.containsKey(id)) {
		//throw new IllegalArgumentException("ID " + id + " already exists.");
	//}
	
	this.id=id;
	this.name=name;
	this.salary=salary;
}
	
//private static boolean containsKey(int id) {
	//return false;
//}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the salary
 */
public double getSalary() {
	return salary;
}
/**
 * @param salary the salary to set
 */
public void setSalary(double salary) {
	this.salary = salary;
}
public double calculateMonthlySalary() {
    return salary/12;
}
public static Teacher getTeacherById(int id) {
	return Teacher.getTeacherById(id);
}
@Override
public String toString() {
	return  String.format("Id: %s\nName : %s\nSalary :%s\n",id,name,salary);
}
}
