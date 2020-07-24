package com.Employee;

public class JavaClassObjectSample 
{
	private static int id;
	private static String FirstName;
	private static String LastName;
	private static int MobileNo;
	
	public JavaClassObjectSample(int id,String FirstName,String LastName,int MobileNo)
	{
		this.id=id;
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.MobileNo=MobileNo;
	}
	public void Display()
	{
		System.out.println("Accoount Id= "+id);
		System.out.println("First Name= "+FirstName);
		System.out.println("Last Name= "+LastName);
		System.out.println("Mobile Number= "+MobileNo);
	}
	public static void main(String rags[])
	{
		 JavaClassObjectSample obj=new  JavaClassObjectSample(1,"Rohini","Jadhav",99);
		 obj.Display();
		 JavaClassObjectSample ob=new  JavaClassObjectSample(2,"Sayli","Chavan",98);
		 ob.Display();
	}
}
