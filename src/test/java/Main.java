import java.util.Locale;
import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springrecipes.beans.ArithmeticCalculator;
import com.springrecipes.beans.Battery;
import com.springrecipes.beans.Cashier;
import com.springrecipes.beans.CommonData;
import com.springrecipes.beans.Disc;
import com.springrecipes.beans.Product;
import com.springrecipes.beans.SequenceDao;
import com.springrecipes.beans.SequenceGenerator;
import com.springrecipes.beans.SequenceService;
import com.springrecipes.beans.ShoppingCart;
import com.springrecipes.beans.UnitCalculator;
public class Main {
public static void main(String[] args) {
	ApplicationContext context=new GenericXmlApplicationContext(new String[] {"appContext.xml"});
/*	Product aaa=(Product)context.getBean("aaa");
	Product cdrw=(Product)context.getBean("cdrw");
	System.out.println(aaa);
	System.out.println(cdrw);  */
/*	SequenceGenerator generator=(SequenceGenerator)context.getBean("sequenceGenerator");
	System.out.println(generator.getSequence());
	System.out.println(generator.getSequence());*/
	
/*	ShoppingCart cart1=context.getBean("shoppingCart",ShoppingCart.class);
	cart1.addItem(aaa);
	cart1.addItem(cdrw);
	System.out.println("Cart 1 contains-->"+cart1.getCart());  
	
	Product dvd=context.getBean("dvdrw",Disc.class);
	ShoppingCart cart2=context.getBean("shoppingCart",ShoppingCart.class);
	cart2.addItem(dvd);
	System.out.println("Cart 2 contains---->"+cart2.getCart());
	
	Battery battery=context.getBean("aaa",Battery.class);
	System.out.println(battery.getDiscount());
	Disc disc=context.getBean("cdrw",Disc.class);
	System.out.println(disc.getDiscount()); 
	
	
	
	
	Cashier cashier=context.getBean("cashier",Cashier.class);
	cashier.checkout(cart1);
	
//	ProductRanking ranking=context.getBean("productRanking",ProductRanking.class);
//	System.out.println(ranking.getBestSeller());
//	System.out.println(ranking.getFromDate());
//	System.out.println(ranking.getToDate()); 
	
	/*ApplicationContext context2=new ClassPathXmlApplicationContext("beans.xml");
	ProductRanking ranking=context2.getBean("productRanking",ProductRanking.class);
	System.out.println(ranking.getBestSeller());  */
	
	/*CommonData commonData=context.getBean("commonData",CommonData.class);
	System.out.println(commonData.getUserOS());
	System.out.println(commonData.getUserRegion());
	System.out.println(commonData.getRandomNumber());  */
	SequenceDao sequenceDao=context.getBean("sequenceDaoImpl",SequenceDao.class);
	System.out.println(sequenceDao.getNextValue("IT"));
	System.out.println(sequenceDao.getNextValue("IT"));
	SequenceService sqS=(SequenceService)context.getBean("sequenceService");
	System.out.println(sqS.generate("IT"));
	System.out.println(sqS.generate("IT"));
	System.out.println(sqS.generate("IT"));
	
	String alert=context.getMessage("alert.checkout",null,Locale.US);
	String alert_inventory=context.getMessage("alert.inventory.checkout",new Object[] {"DVD-RW 3.0",new Date()}, Locale.US);
	System.out.println(alert);
	System.out.println(alert_inventory);
	Product battery1=context.getBean("battery1",Product.class);
	ShoppingCart cart3=context.getBean("shoppingCart",ShoppingCart.class);
	cart3.addItem(battery1);
	Cashier cashier=context.getBean("cashier2",Cashier.class);
	cashier.checkout(cart3);
	
	
	//ApplicationContext context2=new GenericXmlApplicationContext("aopbeans.xml");
		ArithmeticCalculator arithmeticCalculator=context.getBean("arithmeticCalculator",ArithmeticCalculator.class);
		arithmeticCalculator.add(1,2);
		
		UnitCalculator unitCalculator=context.getBean("unitCalculator",UnitCalculator.class);
		unitCalculator.kilogramToPound(10);
		unitCalculator.kilometerToMile(5);  
		
	}
}
