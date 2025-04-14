package com.datta.star.pattern;

/* 
 print the star pattern in the below format
 
  *****
  *****
  *****
  *****
  *****
   
 */

public class Star1 {
	public static void main(String[] args) {
		int lines = 5;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= lines; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
