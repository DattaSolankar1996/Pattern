package com.datta.star.pattern;

/* 
print the star pattern in the below format

 *****
 *****
 *****
 *****
 *****
  
*/

public class Star2 {
	public static void main(String[] args) {
		int lines = 5;
		String str = "*****";
		for (int i = 1; i <= lines; i++) {
			System.out.println(str);
		}
	}
}
