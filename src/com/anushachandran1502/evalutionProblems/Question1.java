package com.anushachandran1502.evalutionProblems;


import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
		Question1 question1=new Question1();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a n");
		int n=scanner.nextInt();
		scanner.close();
		int[][] array=new int[n][n];
		int number=1;
		System.out.println("Input Matrix");
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				array[i][j]=number++;
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		//System.out.println(Arrays.deepToString(array));
		array=question1.rotate90Matrix(array);
		question1.rotated90MatrixPrint(array);
	}
	private void rotated90MatrixPrint(int[][] array) {
		// TODO Auto-generated method stub
		System.out.println("Output Matrix");
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	private int[][] rotate90Matrix(int[][] array)
	{
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int temp=array[j][i];
				array[j][i]=array[i][j];
				array[i][j]=temp;
			}
		}
		//System.out.println(Arrays.deepToString(array));
		for(int i=0;i<n;i++)
		{
			int start=0;
			int end=array[i].length-1;
			while(start<end)
			{
				int temp=array[i][end];
				array[i][end]=array[i][start];
				array[i][start]=temp;
				start++;
				end--;
			}
		}
		//System.out.println(Arrays.deepToString(array));
		return array;
	}
	

}
