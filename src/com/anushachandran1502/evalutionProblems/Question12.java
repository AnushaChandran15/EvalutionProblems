package com.anushachandran1502.evalutionProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Question12 {
	
public static void main(String[] args) {
	Question12 question12=new Question12();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Array Length");
	int n=scanner.nextInt();
	int[] array=new int[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("Index :"+i);
		array[i]=scanner.nextInt();
	}
	System.out.println(question12.MaximumGapOfArray(array));
	
	}

private int MaximumGapOfArray(int[] array) {
	// TODO Auto-generated method stub
	if(array.length==1)
	{
		return 0;
	}
	Arrays.sort(array);
	System.out.println(Arrays.toString(array));
	int max=array[1]-array[0];
	for(int i=1;i<array.length-1;i++)
	{
		int current=array[i+1]-array[i];
		if(current>max)
		{
			max=current;
		}
	}
		return max;
	}
}
