package org.sarindy.constructorWay;

public class Restaurant {
	
	IHotDrink iHotDrink;

	public Restaurant(IHotDrink iHotDrink) {
		this.iHotDrink = iHotDrink;
	}
	
	public void RestaurantPrepareDrink(){
		this.iHotDrink.PrepareDrink();
	}
	
	

}
