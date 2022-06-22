package com.gl.driver;
import com.gl.content.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Objects for target classes are created
		AdminDepartment adObject = new AdminDepartment();
		HRDepartment hrdObject = new HRDepartment();
		TechDepartment tdObject = new TechDepartment();
		
		// Admin Department's answers
		String adMethodOne = adObject.departmentName();
		System.out.println("Welcome to "+adMethodOne);
		String adMethodTwo = adObject.getTodaysWork();
		System.out.println(adMethodTwo);
		String adMethodThree = adObject.getWorkDeadline();
		System.out.println(adMethodThree);
		String inheritanceStorage1 = adObject.isTodayAHoliday(); //Inheritance Call
		System.out.println(inheritanceStorage1); //Inheritance Call
		
		// Introducing line break to enhance readibility
		System.out.println("  ");
		
		// HR Department's answers
		String hrMethodOne = hrdObject.departmentName();
		System.out.println("Welcome to "+hrMethodOne);
		String hrMethodTwo = hrdObject.getTodaysWork();
		System.out.println(hrMethodTwo);
		String hrMethodThree = hrdObject.getWorkDeadline();
		System.out.println(hrMethodThree);
		String hrMethodFour = hrdObject.doActivity();
		System.out.println(hrMethodFour);
		String inheritanceStorage2 = hrdObject.isTodayAHoliday(); //Inheritance Call
		System.out.println(inheritanceStorage2); //Inheritance Call
		
		// Introducing line break to enhance readibility
		System.out.println("  ");
		
		// Tech Department's answers
		String tdMethodOne = tdObject.departmentName();
		System.out.println("Welcome to "+tdMethodOne);
		String tdMethodTwo = tdObject.getTodaysWork();
		System.out.println(tdMethodTwo);
		String tdMethodThree = tdObject.getWorkDeadline();
		System.out.println(tdMethodThree);
		String tdMethodFour = tdObject.getTechStackInformation();
		System.out.println(tdMethodFour);
		String inheritanceStorage3 = tdObject.isTodayAHoliday(); //Inheritance Call
		System.out.println(inheritanceStorage3); //Inheritance Call
		
		
	}

}
