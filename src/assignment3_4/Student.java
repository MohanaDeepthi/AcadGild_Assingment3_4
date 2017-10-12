package assignment3_4;//package name

public class Student {//student class
	//Student class attributes
	private String name;//Student name
	private long phNo;//Student phone Number
	private int rollNo;//Student rollNumber
	private String className; //Student Class Name
	public String result;
	//Getter and Setter methods of class attributes
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	//override the toString method to print student details and result
	public String toString(){
		return "Name:"+this.getName()+"\tPhoneNo:"+this.getPhNo()+"\tRollNo:"+this.getRollNo()+"\tClass:"+this.getClassName()+"\tResult:"+result;
	}


}
