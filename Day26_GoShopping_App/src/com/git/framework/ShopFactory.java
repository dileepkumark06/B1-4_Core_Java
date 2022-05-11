  package com.git.framework;

public abstract class ShopFactory 
{
	abstract PrimeAcc getNewPrimeAccount();
	abstract NormalAcc getNewNormalAccount();
}
