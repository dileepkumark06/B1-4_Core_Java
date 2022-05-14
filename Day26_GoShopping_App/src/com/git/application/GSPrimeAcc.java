package com.git.application;

import com.git.framework.PrimeAcc;
import com.git.framework.ShopAcc;


public class GSPrimeAcc extends PrimeAcc
{
	private static float charges;
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) 
	{
		super(accNo, accNm, charges, isPrime);
		GSPrimeAcc.charges=charges;
	}
	@Override
	public void bookProduct(float charges) 
	{
		System.out.println("Account No"+ShopAcc.getAccNo()+"\n"+"Account Name: "+ShopAcc.getAccNm()+"\n"+"Charges: "+ShopAcc.getCharge()+"\n"+"Delivery Charges: "ShopAcc.getCharges());
	}
	public static float getCharges() 
	{
		return GSPrimeAcc.charges;
	}
	@Override
	public void items(float item_id) 
	{
		
	}
	public String toString() 
	{
		return "GSPrimeAcc[toString()="+super.toString()+"]";
	}
	
	