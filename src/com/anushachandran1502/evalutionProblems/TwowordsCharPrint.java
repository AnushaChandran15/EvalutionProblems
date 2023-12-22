package com.anushachandran1502.evalutionProblems;

import java.util.Scanner;

public class TwowordsCharPrint {
	
	public static void main(String[] args) {
		TwowordsCharPrint obj=new TwowordsCharPrint();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Word (Input example:BreakingBad)");
		String word=scanner.nextLine();
		obj.wordsPrint(word);
	}

	private void wordsPrint(String word) {
		// TODO Auto-generated method stub
		String word1="";
		String word2="";
		for(int i=1;i<word.length();i++)
		{
			if(word.charAt(i)>=65 && word.charAt(i)<=90)
			{
				word1=word.substring(0,i);
				word2=word.substring(i,word.length());
				break;
			}
		}
		String str1="";
		String str2="";
	for(int j=0;j<Math.max(word1.length(),word2.length());j++)
	{
			if(j<word1.length())
			{
			str1=word1.substring(0,j+1);
			}

			if(j<word2.length())
			{
			str2=word2.substring(0,j+1);
			}
						
			System.out.println((str1+str2).toUpperCase());

		}
	}

}
