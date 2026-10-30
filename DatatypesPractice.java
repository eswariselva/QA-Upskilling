package Coding;

public class DatatypesPractice {
	
	/* This program is to demonstrate use of Primitive Datatypes
	 * This program is to calucate BMI Calculator
	 * BMI-BodyMassIndex here we need 3 input data:Body Weight,Height,Age
	 */

	public static void main(String[] args) {
         
		/* This is the syntax for variable declaration.Variable is a name of memory location
		 * SYNTAX:Datatype variablename = data;
		 */
		String name="Rahul";
		int age=36;
		float weight=63.54f;//weight is in kg
		double height=160.34;//height is in centimeters
		double BMI;
		
		BMI=weight/Math.pow(height/100, 2);
		
		System.out.println("******************************");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.printf("The BMI calucaltor for %s is :%f\n",name,BMI);//Formatted ouput using printf statement
		System.out.println("\n******************************");
		
	}

}
