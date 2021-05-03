package com.raza.marketapp.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import static java.lang.Math.*;

import com.google.gson.*;
import com.raza.marketapp.model.*;

@RestController
@RequestMapping("api")
public class SaleDataController {

	@RequestMapping(value = "/get_sale_data", method = RequestMethod.GET)
	public String get_sale_data() {
		int N = 15 + (int)floor(random() * 6.0);
		ArrayList<MarketItem> items = new ArrayList<MarketItem>();
		double last_buy_price = 15.0;
		double last_sell_price = 15.0;



		for (int i = 0; i < N; i++)
		{
			last_buy_price -= random() / 4; // between 0 and 0.25
			last_sell_price += random() / 4;
			items.add(new MarketItem(100, round(last_buy_price*100.0)/100.0, round(last_sell_price*100.0)/100.0, 100+i*100));
		}
		return new Gson().toJson(items); // return JSON, it's an API
	}

}
