package com.springrecipes.beans;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ApplicationEvent;
import java.util.Date;
public class AmazonCheckoutListener implements ApplicationListener{
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof AmazonCheckoutEvent) {
			Date time=((AmazonCheckoutEvent)event).getTime();
			System.out.println("Checkout happened at "+time);
			System.out.println("Redirecting to bank's site for payment");
		}
	}
}
