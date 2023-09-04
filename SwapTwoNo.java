package com.java.intro;

public class SwapTwoNo
{
	public static void main(String []Args)
	{
		int a=5;
		int b=6;
		int c; 
		System.out.println("Before Swapping:"+a + " " +b);
		c=a; 
		a=b;
		b=c;
		System.out.println("After Swap:"+a + " " +b);
	}
}