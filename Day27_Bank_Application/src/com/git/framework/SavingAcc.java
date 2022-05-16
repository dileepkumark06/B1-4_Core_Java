package com.git.framework;

public abstract class SavingAcc extends BankAcc
{
	private boolean isSalary;
	@SuppressWarnings("unused")
	private static final float MINBAL=1000;	
	
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalary)
	{
		super(accNo,accNm,accBal);
		this.isSalary=isSalary;
	}

	public void withdraw(float accBal) 
	{
		System.out.println("Account no: "+this.getAccNo()+"\n "+" Account name: "+this.getAccNm()+ "\n"+"Account Balance:"+accBal);
	
	}

	@Override
	public String toString() 
	{
		return String.format("SavingAcc [isSalaried=%s, toString()=%s]", isSalary,super.toString());
	}
}
	