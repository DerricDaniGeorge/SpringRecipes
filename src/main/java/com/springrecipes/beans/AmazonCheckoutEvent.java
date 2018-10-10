package com.springrecipes.beans;
import org.springframework.context.ApplicationEvent;
import java.util.Date;
public class AmazonCheckoutEvent extends ApplicationEvent{
private Date time;
public AmazonCheckoutEvent(Object source,Date time) {
	super(source);
	this.time=time;
}
public Date getTime() {
	return time;
}
}
