package com.anushachandran1502.evalutionProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question4 {
	


public static void main(String[] args) {
	Question4 question4=new Question4();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a sentence");
	String sentence=scanner.nextLine();
	scanner.close();
	question4.wordFrequency(sentence);
}

private void wordFrequency(String sentence) {
	// TODO Auto-generated method stub
	Map<String, Integer> map=new HashMap<String, Integer>();
	char[] chars=sentence.toCharArray();
	String word="";
	for(int i=0;i<=chars.length;i++)
	{
		if( i==chars.length|| chars[i]==','|| chars[i]=='.' || chars[i]==' ')
		{
			word=word.toLowerCase();
			if(map.containsKey(word))
			{
				map.put(word, map.get(word)+1);
			}
			else
			{
				map.put(word, 1);
			}
			word="";
		}
		else
		{
			word+=chars[i];
		}
	}
	System.out.println(map);
	
}

}
