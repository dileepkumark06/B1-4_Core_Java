package com.git.multithreading;

class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread interruption");
	}
}
public class Example5 
{
	public static void main(String[] args) 
	{
		Thread1 t=new Thread1();
		t.start();
		t.interrupt();
	}
}
