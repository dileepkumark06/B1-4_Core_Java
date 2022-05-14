package com.git.application;

import com.git.framework.NormalAcc;
import com.git.framework.PrimeAcc;
import com.git.framework.ShopFactory;

public class GSShopFactory extends ShopFactory
{
	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float delivaryCharges, float charges) 
	{
		return null;
	}
	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float delivaryCharges, float charges) 
	{
		return null;
	}
}