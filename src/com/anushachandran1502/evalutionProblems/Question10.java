package com.anushachandran1502.evalutionProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question10 {
	
	public static void main(String[] args) {
		Question10 question10=new Question10();
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of memebrs : ");
		int numberOfMembers=scanner.nextInt();
		scanner.nextLine();
		String[] names=new String[numberOfMembers];
		int[] birthYear=new int[numberOfMembers];
		int[] deathYear=new int[numberOfMembers];
		for(int i=0;i<numberOfMembers;i++)
		{
			
			System.out.println("Enter the Name : ");
			names[i]=scanner.nextLine();
			System.out.print("DateOfBirth : ");
			birthYear[i]=scanner.nextInt();
			System.out.print("DeathYear : ");
			deathYear[i]=scanner.nextInt();
			scanner.nextLine();
		}
		System.out.println("Enter the year :");
		int year=scanner.nextInt();
		scanner.close();
		ArrayList<String> list=new ArrayList<String>();
		list=question10.howManyPeopleLives(year,names,birthYear,deathYear,numberOfMembers);
		System.out.println(list);
	}

	private ArrayList<String> howManyPeopleLives(int year, String[] names, int[] birthYear, int[] deathYear,int n) {
		// TODO Auto-generated method stub
		ArrayList<String> lives=new ArrayList<String>();
				for(int i=0;i<n;i++)
				{
					if(year>=birthYear[i] && year<=deathYear[i])
					{
					System.out.println(lives.add(names[i]));      
					}
				}
		return lives;
	}

	

}
