package com.saffy.algo;
import java.util.Scanner;

public class Main633 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] capital = {"Seoul","Washington","Tokyo","Beijing"};
		
		System.out.println("* 각 나라의 수도 :");
		System.out.println("\t대한민국 = 서울("+capital[0]+")");
		System.out.println("\t미국 = 워싱턴("+capital[1]+")");
		System.out.println("\t일본 = 동경("+capital[2]+")");
		System.out.println("\t중국 = 북경("+capital[3]+")\n\n");
		
		while(true)
		{
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.println("number? ");
			int num = sc.nextInt();
			if(num<0||num>4)
			{
				System.out.println("none");
				break;
			}
			System.out.println("\n\n"+capital[num-1]+"\n\n");
			
		}
	}
}
