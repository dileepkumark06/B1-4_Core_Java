package com.git.package3;

public class SBI 
{
 private int balance;
 SBI(int bal)
 {
	 balance=bal;
 }
 void display()
 {
	 System.out.println(balance);
 }
 public static void main(String args[])
 {
	 SBI s=new SBI(20600);
	 s.display();
 }
}

