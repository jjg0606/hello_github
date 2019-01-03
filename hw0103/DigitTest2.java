package com.ssafy.hw;
import java.util.Scanner;

public class DigitTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int prior = 100;
		int next = sc.nextInt();
		System.out.print(prior+" "+next+" ");
		while(true)
		{
			int temp = prior-next;
			
			if(temp<0)
			{
				System.out.print(temp+" ");
				break;
			}				
			
			System.out.print(temp+" ");			
			prior = next;
			next =temp;
		}
		
	}

}
