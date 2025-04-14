package com.datta.star.pattern;

/* 
print the star pattern in the below format

  *********
   *******
    *****
     ***
      *
  
*/
public class Star9 {
	public static void main(String[] args) {
		System.out.println("Program Started");

		int lines = 5;
		int starCount = 9;
		int spaceCount = 1;
		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= spaceCount; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= starCount; k++) {
				System.out.print("*");
			}
			System.out.println();
			starCount = starCount - 2;
			spaceCount++;
		}

		System.out.println("Program Ended");
	}
}
