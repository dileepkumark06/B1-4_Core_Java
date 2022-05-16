package com.git.client;

import com.git.application.MMBankFactory;
import com.git.application.MMCurrentAcc;
import com.git.application.MMSavingAcc;
import com.git.framework.BankFactory;
import com.git.framework.CurrentAcc;
import com.git.framework.SavingAcc;

public class Client 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		BankFactory obj=new MMBankFactory();
		SavingAcc a=new MMSavingAcc(153, "Kiran", 20000, true);
		CurrentAcc b=new MMCurrentAcc(152, "Ramesh", 5000, 500);
		System.out.println("Saving Account: ");
		a.withdraw(a.getAccBal());
		System.out.println();
		System.out.println("Current Account: ");
		b.withdraw(b.getAccBal());
		
		
		System.out.println(a);
		System.out.println();
		System.out.println(b);
	}
}