package org.marks;

import java.util.Scanner;

public class Student {
	private static Scanner sc;
public static void main(String[] args) {
	 sc =new Scanner(System.in);
	int tamil,english,maths,science,social;
	float total,average,percentage;
	System.out.println("enter the five subject marks");
	tamil=sc.nextInt();
	english=sc.nextInt();
	maths=sc.nextInt();
	science=sc.nextInt();
	social=sc.nextInt();
	
	total=tamil+english+maths+science+social;
	average=total/5;
	percentage=(total/500)*100;
	
	System.out.println("Total marks ="+total);
	System.out.println("Average marks ="+average);
	System.out.println("Percentage marks ="+percentage);
			
}
}
