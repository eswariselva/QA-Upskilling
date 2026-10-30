package Coding;

public class ArrayPractice {
	/* Array:Non-primitive datatype stores huge amount of data of similar dataype under a single variable in same memory location
	 * This program is used to calculate overall percentage of marks among 5 students in 5 subjects in 5 different classes.
	 * 
	 */

	public static void main(String[] args) {
		//Array declaration for 5 different class has 5 different students each secure marks in 5 different subjects
		
		
		int[][][] studentRecord= new int[5][5][5];
		
		//Class1
		studentRecord[0][0][0]=65;//Class1 Student1 marks in 5 different subjects
		studentRecord[0][0][1]=78;
		studentRecord[0][0][2]=70;
		studentRecord[0][0][3]=80;
		studentRecord[0][0][4]=90;
		
		studentRecord[0][1][0]=60;//Class1 Student2 marks in 5 different subjects
		studentRecord[0][1][1]=73;
		studentRecord[0][1][2]=90;
		studentRecord[0][1][3]=80;
		studentRecord[0][1][4]=80;
		
		studentRecord[0][2][0]=65;//Class1 Student3 marks in 5 different subjects
		studentRecord[0][2][1]=86;
		studentRecord[0][2][2]=77;
		studentRecord[0][2][3]=86;
		studentRecord[0][2][4]=99;
		
		studentRecord[0][3][0]=56;//Class1 Student4 marks in 5 different subjects
		studentRecord[0][3][1]=87;
		studentRecord[0][3][2]=80;
		studentRecord[0][3][3]=87;
		studentRecord[0][3][4]=97;
		
		studentRecord[0][4][0]=78;//Class1 Student5 marks in 5 different subjects
		studentRecord[0][4][1]=70;
		studentRecord[0][4][2]=75;
		studentRecord[0][4][3]=85;
		studentRecord[0][4][4]=98;
		
		//Class2
		studentRecord[1][0][0]=50;//Class2 Student1 marks in 5 different subjects
		studentRecord[1][0][1]=87;
		studentRecord[1][0][2]=50;
		studentRecord[1][0][3]=84;
		studentRecord[1][0][4]=93;
		
		studentRecord[1][1][0]=70;//Class2 Student2 marks in 5 different subjects
		studentRecord[1][1][1]=63;
		studentRecord[1][1][2]=70;
		studentRecord[1][1][3]=80;
		studentRecord[1][1][4]=80;
		
		studentRecord[1][2][0]=65;//Class2 Student3 marks in 5 different subjects
		studentRecord[1][2][1]=88;
		studentRecord[1][2][2]=77;
		studentRecord[1][2][3]=89;
		studentRecord[1][2][4]=99;
		
		studentRecord[1][3][0]=59;//Class2 Student4 marks in 5 different subjects
		studentRecord[1][3][1]=81;
		studentRecord[1][3][2]=85;
		studentRecord[1][3][3]=87;
		studentRecord[1][3][4]=98;
		
		studentRecord[1][4][0]=74;//Class2 Student5 marks in 5 different subjects
		studentRecord[1][4][1]=70;
		studentRecord[1][4][2]=76;
		studentRecord[1][4][3]=87;
		studentRecord[1][4][4]=98;
		
		//Class3
		studentRecord[2][0][0]=69;//Class3 Student1 marks in 5 different subjects
		studentRecord[2][0][1]=79;
		studentRecord[2][0][2]=75;
		studentRecord[2][0][3]=88;
		studentRecord[2][0][4]=90;
		
		studentRecord[2][1][0]=60;//Class3 Student2 marks in 5 different subjects
		studentRecord[2][1][1]=73;
		studentRecord[2][1][2]=90;
		studentRecord[2][1][3]=80;
		studentRecord[2][1][4]=80;
		
		studentRecord[2][2][0]=65;//Class3 Student3 marks in 5 different subjects
		studentRecord[2][2][1]=86;
		studentRecord[2][2][2]=77;
		studentRecord[2][2][3]=86;
		studentRecord[2][2][4]=99;
		
		studentRecord[2][3][0]=56;//Class3 Student4 marks in 5 different subjects
		studentRecord[2][3][1]=87;
		studentRecord[2][3][2]=80;
		studentRecord[2][3][3]=87;
		studentRecord[2][3][4]=97;
		
		studentRecord[2][4][0]=78;//Class3 Student5 marks in 5 different subjects
		studentRecord[2][4][1]=70;
		studentRecord[2][4][2]=75;
		studentRecord[2][4][3]=85;
		studentRecord[2][4][4]=98;
		
		//Class4
		studentRecord[3][0][0]=69;//Class4 Student1 marks in 5 different subjects
		studentRecord[3][0][1]=96;
		studentRecord[3][0][2]=68;
		studentRecord[3][0][3]=91;
		studentRecord[3][0][4]=68;
		
		studentRecord[3][1][0]=59;//Class4 Student2 marks in 5 different subjects
		studentRecord[3][1][1]=72;
		studentRecord[3][1][2]=73;
		studentRecord[3][1][3]=69;
		studentRecord[3][1][4]=90;
		
		studentRecord[3][2][0]=96;//Class4 Student3 marks in 5 different subjects
		studentRecord[3][2][1]=92;
		studentRecord[3][2][2]=95;
		studentRecord[3][2][3]=96;
		studentRecord[3][2][4]=98;
		
		studentRecord[3][3][0]=81;//Class4 Student4 marks in 5 different subjects
		studentRecord[3][3][1]=73;
		studentRecord[3][3][2]=82;
		studentRecord[3][3][3]=83;
		studentRecord[3][3][4]=73;
		
		studentRecord[3][4][0]=73;//Class4 Student5 marks in 5 different subjects
		studentRecord[3][4][1]=77;
		studentRecord[3][4][2]=76;
		studentRecord[3][4][3]=83;
		studentRecord[3][4][4]=92;
		
		//Class5
		studentRecord[4][0][0]=93;//Class5 Student1 marks in 5 different subjects
		studentRecord[4][0][1]=88;
		studentRecord[4][0][2]=77;
		studentRecord[4][0][3]=66;
		studentRecord[4][0][4]=89;
		
		studentRecord[4][1][0]=99;//Class5 Student2 marks in 5 different subjects
		studentRecord[4][1][1]=85;
		studentRecord[4][1][2]=74;
		studentRecord[4][1][3]=64;
		studentRecord[4][1][4]=89;
		
		studentRecord[4][2][0]=93;//Class5 Student3 marks in 5 different subjects
		studentRecord[4][2][1]=86;
		studentRecord[4][2][2]=70;
		studentRecord[4][2][3]=66;
		studentRecord[4][2][4]=84;
		
		studentRecord[4][3][0]=99;//Class5 Student4 marks in 5 different subjects
		studentRecord[4][3][1]=85;
		studentRecord[4][3][2]=74;
		studentRecord[4][3][3]=64;
		studentRecord[4][3][4]=89;
		
		studentRecord[4][4][0]=90;//Class5 Student5 marks in 5 different subjects
		studentRecord[4][4][1]=89;
		studentRecord[4][4][2]=75;
		studentRecord[4][4][3]=64;
		studentRecord[4][4][4]=89;
		
		//Sum of marks of student1 in class1
		int sum01=studentRecord[0][0][0] + studentRecord[0][0][1] + studentRecord[0][0][2] + studentRecord[0][0][3] + studentRecord[0][0][4];
		//Percentage
		int percentage01=(sum01*100)/500;
		System.out.println(sum01);
		System.out.println("Class1 Student1 percentage:"+percentage01);
		
	}

}
