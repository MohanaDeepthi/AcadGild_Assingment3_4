package assignment3_4;//package name
import java.util.Scanner;

public class StudentResultProcesing extends Student {
		
	public  static void main(String args[]){//main method
		
		Scanner inputScanner = new Scanner(System.in);//Instantiating Scanner object
		Student stuVar=new Student();//Instantiating Student object
		int sub1Marks,sub2Marks,sub3Marks;//Declare 3 subject marks variables
		//Take input from user
		System.out.println("Enter student Name:");
		stuVar.setName(inputScanner.nextLine());
		System.out.println("Enter Class Name:");
		stuVar.setClassName(inputScanner.nextLine());
		System.out.println("Enter roll no :");
		stuVar.setRollNo(inputScanner.nextInt());
		System.out.println("Enter Phone No:");
		stuVar.setPhNo(inputScanner.nextLong());
		
		System.out.println("Enter 3 subject marks :");
		sub1Marks=inputScanner.nextInt();
		sub2Marks=inputScanner.nextInt();
		sub3Marks=inputScanner.nextInt();
		//Logic to find the average of the marks and find the result
		int addresult=(sub1Marks+sub2Marks+sub3Marks)/3;
		if(addresult>35)
			stuVar.result="Pass";
		else
			stuVar.result="Fail";
		System.out.println(stuVar);
		
		//close scanner
		inputScanner.close();
			
	}

}
