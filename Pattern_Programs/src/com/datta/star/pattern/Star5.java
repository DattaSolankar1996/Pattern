package com.datta.star.pattern;

/* 
print the star pattern in the below format

 *****
 ****
 ***
 **
 *
  
*/

public class Star5 {
	public static void main(String[] args) {
		System.out.println("Program Started");
		int lines =5;
		int starCount =5;
		
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=starCount;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			starCount--;
		}
		System.out.println("Program Ended");
	}
}
