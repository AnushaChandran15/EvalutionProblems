package com.anushachandran1502.evalutionProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question9 {
	
	public static void main(String[] args) {
		Question9 question9=new Question9();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the list length");
		int listLength=scanner.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<listLength;i++)
		{
			System.out.println("Enter the Value");
			list.add(scanner.nextInt());
		}
		scanner.close();
		System.out.println("Input list: "+ list);
		question9.removeDuplicates(list);
	}

	private void removeDuplicates(List<Integer> list) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)==list.get(j))
				{
					list.remove(j);
					j=j-1;
				}
			}
		}
		System.out.println("OutputList"+list);
	}

}
