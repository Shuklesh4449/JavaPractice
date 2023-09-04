package com.java.intro.ex;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=33;
		int temp=a;
		int num,rem,sum=0;
		while(a>0)
		{
			rem=a%10;
			sum=(sum*10)+rem;
			a=a/10;
		}
		if(temp==sum)
		{
			System.out.println("The No is Palindrome");		
		}
		else
		{
			System.out.println("The No is Not PalinDrome");
		}

	}

}
