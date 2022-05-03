package com.indiabix.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 
{
	public static void main(String[] args) 
	{
		Pattern p=Pattern.compile("I");
		Matcher m=p.matcher("I lives in mumbai and its famous for bollywood");
		while(m.find())
		{
			System.out.println("Pattern found from" +m.start()+ "to" + (m.end()-1));
		}
	}
}