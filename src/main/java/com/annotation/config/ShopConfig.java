package com.annotation.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;

import com.springrecipes.beans.ArithmeticCalculator;
import com.springrecipes.beans.ArithmeticCalculatorImpl;
import com.springrecipes.beans.BannerLoader;
import com.springrecipes.beans.Battery;
import com.springrecipes.beans.CalculatorLoggingAspect;
import com.springrecipes.beans.Cashier;
import com.springrecipes.beans.Product;
import com.springrecipes.beans.ShoppingCart;
import com.springrecipes.beans.UnitCalculator;
import com.springrecipes.beans.UnitCalculatorImpl;

import org.springframework.beans.factory.annotation.Value;

@Configuration
public class ShopConfig {
	@Value("classpath:banner.txt")
	private Resource banner;
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	@Bean
	public BannerLoader bannerLoader() {
		BannerLoader b=new BannerLoader();
		b.setBanner(banner);
		return b;
	}
	@Bean
	public static ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
		String[] resources= {"classpath:messages"};
		messageSource.setBasenames(resources);
		messageSource.setCacheSeconds(1);
		return messageSource;
	}
	@Bean(name="cashier2")
	public Cashier cashier() {
		Cashier c=new Cashier();
		c.setMessageSource(messageSource());
		return c;
	}
	@Bean(name="battery1")
	public Product aaa() {
		Battery b=new Battery("AAA",4.5);
		return b;
	}
	@Bean
	public ShoppingCart shoppingCart() {
		return new ShoppingCart();
	}
	@Bean
	public ArithmeticCalculator arithmeticCalculator() {
		return new ArithmeticCalculatorImpl();
	}
	@Bean
	public CalculatorLoggingAspect calculatorLoggingAspect() {
		return new CalculatorLoggingAspect();
	}
	@Bean UnitCalculator unitCalculator() {
		return new UnitCalculatorImpl();
	}
}
