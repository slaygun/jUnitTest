package jUnitTestPackage;

public class jUnitFunctions {
	
	void AddSum()
	{
	int n1 = 25, n2 = 15, sum;  
	sum = n1 + n2;  
	System.out.println("The sum of numbers is: "+sum);  
	}  
	void TestStringConcatenation1()
    {  
		   String s="Nabh"+" Raghav";  
		   System.out.println(s);  
    }  
	public static void main(String args[])   
	{  
		jUnitFunctions ob = new jUnitFunctions();
		ob.AddSum();
		ob.TestStringConcatenation1();
		
	}
}
