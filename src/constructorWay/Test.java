package org.sarindy.constructorWay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("org/sarindy/constructorWay/springConfigConstruct.xml");
		Restaurant restaurantObj = (Restaurant) context.getBean("constructorBean");
		restaurantObj.RestaurantPrepareDrink();	

	}

}
