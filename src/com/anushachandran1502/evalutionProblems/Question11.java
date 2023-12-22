package com.anushachandran1502.evalutionProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Question11 {
	public static void main(String[] args) {
		Question11 question11=new Question11();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Array Length");
		int length=scanner.nextInt();
		int[] array=new int[length];
		for(int i=0;i<length;i++)
		{
			System.out.println("Index : "+ i);
			array[i]=scanner.nextInt();
		}
		System.out.println("Input Array :"+Arrays.toString(array));
		System.out.println("Enter K value");
		int k=scanner.nextInt();
		scanner.close();
		String result=question11.findKthSmallestNumber(length,array,k);
		System.out.println(result);
	}

	private String findKthSmallestNumber(int length, int[] array, int k) {
		// TODO Auto-generated method stub
		if(k>length)
		{
			return "k is exceeded the array length";
		}
		int n=k;
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j+1]<array[j])
				{
					int temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}	
//Set<Integer> set=new HashSet<Integer>();
//		int max=0;
//		for(int i=0;i<array.length;i++)
//		{
//			if(k<=0)
//			{
//				break;
//			}
//			max=array[i];
//			for(int j=0;j<array.length;j++)
//			{
//				if(i!=j &&  array[j]!=0 && array[j]<max)
//				{
//					max=array[j];
//					array[j]=0;
//				}
//				
//			}
//			k--;
//		}
		return ""+n+"th Smallest element in the array "+ array[k-1];
	}

	}
