package com.saffy.algo;
import java.util.Scanner;

public class Main540 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int input = sc.nextInt();
			if(input==-1)
			{
				break;
			}
			if(input%3==0)
			{
				System.out.println(input/3);
			}
		}
	}
}
