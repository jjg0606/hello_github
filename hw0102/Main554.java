package com.saffy.algo;
import java.util.Scanner;

public class Main554 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		
		if(rows<1)
			return;
		
		int nextInt = 1;
		char nextChar = 'A' ;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows+1;j++)
			{
				if(j>=rows-i)
				{
					System.out.print(String.format("%-2c", nextChar++));
				}
				else
				{
					System.out.print(String.format("%-2d", nextInt++));
				}
			}
			System.out.println();
		}
	}
}
