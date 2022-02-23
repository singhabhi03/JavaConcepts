package com.java.programs;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 490, 50 };
		int[] b = { 10, 20, 30, 40, 50 };

		boolean isEqual = true;

		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {

				if (a[i] != b[i]) {
					isEqual = false;
					System.out.println("Element at position " + (i + 1) + " are not equal");
					break;
				} else
					isEqual = true;

			}

		} else {
			isEqual = false;
			System.out.println("Length of arrays are not equal");
		}
		if (isEqual)
			System.out.println("Arrays are Equal");

		else
			System.out.println("Arrays are not Equal");

	}

}
