package com.git.application;

import com.git.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc
{

	public GSNormalAcc(int accNo, String accNm, float deliveryCharges, float charges) 
	{
		super(accNo, accNm, deliveryCharges, charges);
	}

	@Override
	public void bookProduct(float charges) 
	{
		float charges1=charges+NormalAcc.getDeliveryCharges();
		System.out.println("Account No"+NormalAcc.getAccNo()+"\n"+"Account Name: "+NormalAcc.getAccNm()+"\n"+"Charges: "+NormalAcc.getCharge()+"\n"+"Delivery Charges: "+NormalAcc.getDeliveryCharges());
	}
	@Override
	public void items(float item_id) 
	{
		System.out.println();
	}
	@Override
	public String toString() 
	{
		return "GSNormalAcc[toString()="+super.toString()+",getCharges()="+getCharges()+"]";
	}
}