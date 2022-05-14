package com.git.framework;

public abstract class NormalAcc extends ShopAcc
{
	private static float deliveryCharges;
	
	
	public NormalAcc(int accNo,String accNm,float deliveryCharges, float charges) 
	{
		super(accNo,accNm,charges);
		NormalAcc.deliveryCharges=deliveryCharges;
	}

	public static float getDeliveryCharges() 
	{
		return deliveryCharges;
	}
	@Override
	public String toString() 
	{
		return "NormalAcc[getCharges()="+getCharges()+"getDeliveryCharges"+getDeliveryCharges()+",toString()="+super.toString()+"]";
	}
}