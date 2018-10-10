package com.springrecipes.beans;

public class Battery extends Product{
private boolean rechargeable;
private double discount;
public Battery() {}
public Battery(String name,double price) {
	super(name,price);
}
public boolean isRechargeable() {
	return rechargeable;
}
public double getDiscount() {
	return discount;
}
public void setRechargeable(boolean rechargeable) {
	this.rechargeable=rechargeable;
}
public void setDiscount(double discount) {
	this.discount=discount;
}

}
