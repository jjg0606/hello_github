package com.saffy.algo;
import java.util.Scanner;

public class Main632 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		for(int i=0;i<3;i++)
		{
			a[i] = sc.nextInt();
		}
		
		int min = a[0];
		for(int i=1;i<3;i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
		}
		System.out.println(min);
	}

}
