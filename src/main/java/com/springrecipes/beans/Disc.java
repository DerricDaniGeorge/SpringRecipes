package com.springrecipes.beans;

public class Disc extends Product {
private int capacity;
private double discount;
public int getCapacity() {
	return capacity;
}
public double getDiscount() {
	return discount;
}
public Disc() {}
public Disc(String name,double price) {
	super(name,price);
}
public void setCapacity(int capacity) {
	this.capacity=capacity;
}

public void setDiscount(double discount) {
	this.discount=discount;
}

}
