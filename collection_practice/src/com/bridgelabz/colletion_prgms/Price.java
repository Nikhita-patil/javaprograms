package com.bridgelabz.colletion_prgms;

public class Price {
    
	String item;
	int price;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Price(String item, int price) {
		super();
		this.item = item;
		this.price = price;
	}

	@Override
	public int hashCode() {

	int hashcode=0;
    hashcode=price*20;
    hashcode+=item.hashCode();
	return hashcode;
	
	}

	@Override
	public boolean equals(Object obj) {
	
        if (obj instanceof Price) {
            Price pp = (Price) obj;
            return (pp.item.equals(this.item) && pp.price == this.price);
        } else {
            return false;
        }
	}

	@Override
	public String toString() {
		return "Price [item=" + item + ", price=" + price + "]";
	}
	
}