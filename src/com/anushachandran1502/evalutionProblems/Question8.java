package com.anushachandran1502.evalutionProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question8 {
	
	public static void main(String[] args) {
		Question8 question8=new Question8();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Arraylist length");
		int n1=scanner.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n1;i++)
		{
			System.out.println("Enter a value");
			list.add(scanner.nextInt());
		}
		System.out.println("ArrayList :"+list);
		System.out.println("Enter a Sub-ArrayList length");
		int n2=scanner.nextInt();
		List<Integer> subList=new ArrayList<Integer>();
		for(int i=0;i<n2;i++)
		{
			System.out.println("Enter a value");
			subList.add(scanner.nextInt());
		}
		scanner.close();
		System.out.println("Sub-ArrayList :"+subList);
		boolean flag=question8.findTheSubList(list,subList);
		System.out.println(flag);
	}

	private boolean findTheSubList(List<Integer> list, List<Integer> subList) {
		for(int i=0;i<list.size();i++)
		{ int count=0;
			int j=0;
			for(int k=i;k<list.size()-subList.size()+i&&j<subList.size();k++)
			{
					if((int)list.get(k)==(int)subList.get(j))
					{
						count++;
						j++;
					}
					else
					{
						break;
					}
			}
			//System.out.println(count);
			if(count==subList.size())
			{
				return true;
			}
		}
		
		return false;
	}

}
