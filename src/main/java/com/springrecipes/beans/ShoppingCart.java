package com.springrecipes.beans;
import java.util.List;
import java.util.ArrayList;
public class ShoppingCart {
private List<Product> cart=new ArrayList<>();
public void addItem(Product product) {
	cart.add(product);
}
public List<Product> getCart(){
	return cart;
}
}
