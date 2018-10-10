package com.springrecipes.beans;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.context.ApplicationEventPublisher;
import java.util.Locale;
import java.util.Date;
public class Cashier implements ApplicationEventPublisherAware{
	private ApplicationEventPublisher applicationEventPublisher;
	private MessageSource messageSource;
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource=messageSource;
	}
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher=applicationEventPublisher;
	}
	public void checkout(ShoppingCart cart) {
		System.out.println("Items checkout:"+cart.getCart());
		AmazonCheckoutEvent checkoutEvent=new AmazonCheckoutEvent(this,new Date());
		applicationEventPublisher.publishEvent(checkoutEvent);
		String alert=messageSource.getMessage("alert.inventory.checkout",new Object[] {cart.getCart(),new Date()},Locale.US);
		System.out.println(alert);
	}
}
