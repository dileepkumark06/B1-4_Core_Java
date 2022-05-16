package com.git.client;

import com.git.application.GSNormalAcc;
import com.git.application.GSPrimeAcc;
import com.git.application.GSShopFactory;
import com.git.framework.NormalAcc;
import com.git.framework.PrimeAcc;
import com.git.framework.ShopFactory;

public class Client 
{
	public static void main(String[] args) 
	{
		ShopFactory obj=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(101,"Dileep",0.0f,true);
		NormalAcc n=new GSNormalAcc(102,"Vinay",50.0f,0.0f);
		System.out.println("Prime Account: ");
		p.bookProduct(350.0f);
		System.out.println();
		System.out.println("Normal Account: ");
		n.bookProduct(400.0f);
		
		System.out.println(p);
		System.out.println();	
		System.out.println(n);
	}
}