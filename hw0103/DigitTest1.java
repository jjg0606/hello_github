package com.ssafy.hw;
import java.util.Scanner;

public class DigitTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count=new int[10];
		
		while(true)
		{
			int next=sc.nextInt();
			if(next == 0)
			{
				break;
			}
			
			count[next/10]++;
		}
		
		for(int i=0;i<10;i++)
		{
			if(count[i]!=0)
				System.out.println(String.format("%d : %d개", i,count[i])); 
		}
		
	}

}
