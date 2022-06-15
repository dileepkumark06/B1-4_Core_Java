package com.git.application;

import com.git.framework.BankFactory;

public class MMBankFactory extends BankFactory
{
	public MMSavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried) 
	{
		MMSavingAcc s=new MMSavingAcc(accNo,accNm,accBal,isSalaried);
		return s;
	}

	public MMCurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float MINBAL) 
	{
		MMCurrentAcc c=new MMCurrentAcc(accNo,accNm,accBal,MINBAL);
		return c;
	}
}
