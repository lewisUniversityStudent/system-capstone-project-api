package com.raza.marketapp.model;

public class MarketItem {
	int shares;
	double buyprice;
	double sellprice;
	int totalshares;
	public MarketItem(int shares, double buyprice, double sellprice, int totalshares)
	{
		this.shares = shares;
		this.buyprice = buyprice;
		this.sellprice = sellprice;
		this.totalshares = totalshares;
	}
	
}
