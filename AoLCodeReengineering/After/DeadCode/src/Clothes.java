

import java.util.*;

public class Clothes {
	protected String name;
	protected String size;
	protected int price;
	public Clothes(String name, String size, int price) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public void setFinalPrice(int priceBefore) {
		
		double finalPrice=0;
		//Pada awal toko baju dibuka, diskon baju 20% hanya untuk pembayaran lebih dari 5000000
		if(priceBefore>5000000) {			
			finalPrice = priceBefore - (priceBefore*0.2);
		}
		
		//Setelah toko baju lumayan lama berdiri, pengunjung semakin sedikit dan diskon baju itu 10% untuk semua item
		finalPrice = priceBefore - (priceBefore*0.1);
		
		this.price = (int)finalPrice;
	}
}
