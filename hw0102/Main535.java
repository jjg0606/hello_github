package com.saffy.algo;
import java.util.Scanner;

public class Main535 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float grade = sc.nextFloat();
		String output;
		
		switch((int)grade)
		{
		case 4:
			output = new String("scholarship");
			break;
		case 3:
			output = new String("next semester");
			break;
		case 2:
			output = new String("seasonal semester");
			break;
		default :
			output = new String("retake");
			break;				
		}
		
		System.out.println(output);
	}
}
