package com.anushachandran1502.evalutionProblems;


import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		Question3 question3=new Question3();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number of Rows");
		int row=scanner.nextInt();
		scanner.close();
		int[][] array=new int[row][];
		array=question3.pascalTriangle(row ,array);
		question3.pascalTrianglePrint(row,array);
	}
	private void pascalTrianglePrint(int row, int[][] array) {
		// TODO Auto-generated method stub
		System.out.println("Pascal's Triangle");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(" "+array[i][j]);
			}
			System.out.println();
		}
		
	}
	private int[][] pascalTriangle(int row,int[][] array)
	{
		for(int i=0;i<row;i++)
		{
			array[i]=new int[i+1];
			for(int j=0;j<=i;j++)
			{
				if(j==0|| j==i)
				{
					array[i][j]=1;
				}
				else
				{
					array[i][j]=array[i-1][j-1]+array[i-1][j];
				}
			}
		}
		//System.out.println(Arrays.deepToString(array));
		return array;
	}

}
