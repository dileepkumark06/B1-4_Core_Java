package com.git.application;

import com.git.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) 
	{
		super(accNo, accNm, accBal, isSalary);
	}

	@Override
	public String toString() 
	{
		return String.format("MMSavingAcc [toString()=%s]", super.toString());
	}

	@Override
	public void deposite(float accBal) 
	{
		
	}
}