package com.examples;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = s.nextInt();
		if(a%2==0)
		{
			System.out.println(a+"is even number");
		}
		else
		{
			System.out.println(a+"is odd number");
		}

	}

}
