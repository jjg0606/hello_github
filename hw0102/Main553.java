package com.saffy.algo;
import java.util.Scanner;

public class Main553 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		if(rows<1)
			return;
		
		char nextChar = 'A';
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows-i;j++)
			{
				System.out.print(nextChar++);
			}
			System.out.println();
		}
		
	}
}
