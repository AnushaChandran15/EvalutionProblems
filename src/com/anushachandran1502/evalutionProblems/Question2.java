package com.anushachandran1502.evalutionProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question2 {
	private void primeNumbersWithinRange(int n)
	{
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<n;i++)
		{ int count=1;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				list.add(i);
			}
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		Question2 question2=new Question2();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scanner.nextInt();
		scanner.close();
		question2.primeNumbersWithinRange(n);
		
	}
}
