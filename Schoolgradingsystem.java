package com.pack1;


/*Q-A school has following rules for grading system
 a. Below 25->F
b. 25 to Below 45->E
c. 45 to Below 50->D
d. 50 to Below 60->C
e. 60 to Below 80->B
f. Above 80->A
Take a parameterized method which takes marks as input
& print the corresponding grade*/

public class Schoolgradingsystem
{
void grade(int mark)
{
	if(mark>=80 && mark<=100)
	{
		System.out.println("Congratulation !! Your grade is=>A");
	}
	else if(mark<80 && mark>=60)
	{
		System.out.println("Congratulation !! Your grade is=>B");	
	}
	else if(mark<60 && mark>=50)
	{
		System.out.println("Congratulation !! Your grade is=>C");	
	}
	else if(mark<50 && mark>=45)
	{
		System.out.println("Congratulation !! Your grade is=>D");	
	}
	else if(mark<45 && mark>=25)
	{
		System.out.println("Need some improvement !! Your grade is=>E");	
	}
	else if(mark<25 && mark>=0)
	{
		System.out.println("Need some improvement !! Your grade is=>F");	
	}
	else
	{
	System.out.println("Please enter valid mark");	
	}
}
	public static void main(String[]args)
	{
	new	Schoolgradingsystem().grade(100);
	}
}





















 
