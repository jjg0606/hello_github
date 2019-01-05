package com.ssafy.hw;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("Solution2.txt"));
		Scanner sc = new Scanner(System.in);
		
		int[][] movingTable = {{-1,0},{0,1},{1,0},{0,-1}}; 
		
		int testCase = sc.nextInt();
		for(int tc=0; tc<testCase ; tc++)
		{
			int dimension = sc.nextInt();
			int posR = sc.nextInt()-1;
			int posC = sc.nextInt()-1;
			int jumperNum = sc.nextInt();
			int[][] mapArr = new int[dimension][dimension];
			
			for(int i=0;i<jumperNum;i++)
			{
				mapArr[sc.nextInt()-1][sc.nextInt()-1]=-1;
			}
			
			int insNum = sc.nextInt();
			int[][] insArray = new int[insNum][2]; //0 방향지시, 1이동칸수
			for(int i = 0;i<insNum;i++)
			{
				insArray[i][0] = sc.nextInt()-1; // 방향
				insArray[i][1] = sc.nextInt();
			}
			
			outline : for(int i=0;i<insNum;i++)
			{
				int direction = insArray[i][0];
				int movingnum = insArray[i][1];
				for(int mn=0;mn<movingnum;mn++)
				{
					posR+=movingTable[direction][0];
					posC+=movingTable[direction][1];
					if(posR<0||posR>=dimension||posC<0||posC>=dimension||mapArr[posR][posC]==-1)
					{
						posR=-1;
						posC=-1;
						break outline;
					}				
				}
				
						
			}
			
			System.out.println(String.format("#%d %d %d", tc+1,posR+1,posC+1));
			
		}//test case end
	}
}
