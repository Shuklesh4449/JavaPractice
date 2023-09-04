package com.java.intro.ex;

public class FactorialofNo {
	public static void main (String[] args)
	{
		int i, fact=1;
		int a1=4;
		for (i=2;i<=a1;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of a is:"+ fact);
	}

}
