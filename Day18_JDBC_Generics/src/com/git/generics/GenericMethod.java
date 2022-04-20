package com.git.generics;

public class GenericMethod 
{
	public static<E>void print(E[]elements)
	{
	for(E itr:elements)
	{
		System.out.println(itr);
	}
}

public static void main(String[] args)
	{
		Integer[]arr= {1,22,33};
		Character[] arr1= {'w','e','1'};
		print(arr);
		print(arr1);
	}
}