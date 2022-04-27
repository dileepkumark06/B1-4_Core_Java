package com.git.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Example1 
{
	public static void main(String[] args) 
	{
		LocalDateTime dt=LocalDateTime.now();
		LocalDate d=LocalDate.of(2022,Month.APRIL,31);
		System.out.println(dt);
		System.out.println(d);
	}
}