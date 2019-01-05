package com.ssafy.hw;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("Solution1.txt"));
		Scanner sc = new Scanner(System.in);
		
		int[][] jumpTable = {{1,0},{0,1}};
		int testCase = sc.nextInt();
		for(int tc = 0; tc<testCase;tc++)
		{
			int dimension = sc.nextInt(); 
			int bugNum = sc.nextInt();
			int samePoint = 0;
			int[][] mapArray = new int[dimension][dimension];
			boolean isEnd = false;
			outline : for(int i=0;i<bugNum;i++)
			{
				
				int posR = sc.nextInt();
				int posC = sc.nextInt();
				int[] direction = jumpTable[sc.nextInt()-1];
				if(isEnd)
					continue;
				for(int j=3;j>0;j--)
				{
					posR+=j*direction[0];
					posC+=j*direction[1];

					if(posR>=dimension||posC>=dimension)
						break;
					if(mapArray[posR][posC]==1)
					{
						samePoint=i+1;
						isEnd=true;
					}
					else
					{
						mapArray[posR][posC]=1;
					}
				}
			}
			System.out.println(String.format("\n#%d %d", tc+1,samePoint));
			
		} // end test case
	}
}
