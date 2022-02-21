package com.java.programs;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		int a=170;int b=1700;int c=170;
		if(a==b && b==c) {
			System.out.println("All numbers are equal");
			
		}
		else if(a>b && a>c) {
			System.out.println(a+" is greatest number");
		}
		else if(b>c) {
			System.out.println(b+" is greatest number");
		}
		else {
			System.out.println(c+" is greatest");
		}

	}

}
