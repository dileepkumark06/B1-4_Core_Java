package com.git.decisionmaking;

import java.util.Scanner;

public class Example4 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a)
		{
			case 1:
				System.out.println("Srivali");
				break;
				
			case 2:
				System.out.println("Pushpa");
				break;
				
			case 3:
				System.out.println("Srikanth");
				break;
				
				default:
					System.out.println("Inalid Ouput");
		}
	}
}
