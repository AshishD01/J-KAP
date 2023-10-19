package com.fil.basics;

public class ConstructorExample {
	
	int a ;
	String b;
	int c;
	
	ConstructorExample()
	{
		System.out.println("Default Constructor Running");
	}
	ConstructorExample(int a)
	{
		System.out.println(a);
	}
	ConstructorExample(int a,float b)
	{
		System.out.println(a+b);
	}
	ConstructorExample(double a, float b, int c)
	{
		System.out.println(a+b+c);
	}
	ConstructorExample(char a , long b, boolean c, double d)
	{
		System.out.println(a+" "+b+c+" "+d);
	}
	

	public static void main(String[] args) 
	{
		ConstructorExample obj = new ConstructorExample();
		ConstructorExample obj1 = new ConstructorExample(10,5.6f);
		System.out.println(obj1.a);
		ConstructorExample obj2 = new ConstructorExample(12);
		ConstructorExample obj3 = new ConstructorExample('s',654654156,true,2.5252535);
		ConstructorExample obj4 = new ConstructorExample(12);

	}

}
