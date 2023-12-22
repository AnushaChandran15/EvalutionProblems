package com.anushachandran1502.evalutionProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question13 {
	public static void main(String[] args) {
		Question13 question13=new Question13();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		String word=scanner.nextLine();
		List<String> list=new ArrayList<String>();
		question13.combination(list,"",word);
		scanner.close();
		System.out.println(list);
	}

	private void combination(List<String> list, String str, String word) {
		Question13 question13=new Question13();
		if(word.isEmpty())
		{
			if(!list.contains(str) && !str.isEmpty())
			{
				list.add(str);
			}
				return;
			
		}
		question13.combination(list, str+word.charAt(0), word.substring(1));
		question13.combination(list, str, word.substring(1));

	}

}
