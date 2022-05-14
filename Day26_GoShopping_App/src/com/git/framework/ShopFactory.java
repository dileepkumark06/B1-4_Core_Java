package com.git.framework;

public abstract class ShopFactory 
{
	public abstract PrimeAcc getNewPrimeAccount(int accNo,String accNm,float delivaryCharges,float charges);
	public abstract NormalAcc getNewNormalAccount(int accNo,String accNm,float delivaryCharges,float charges);
}