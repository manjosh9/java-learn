// OOPS --> think in terms of objects real life object

package com.module.one;

class Customer{
	//data (characteristics)
	int cust_id;
	String cust_name;
	String cust_city;
	String cust_mob;
	
	//methods (actions of your object)
	void createCust(int cust_id, String cust_name, String cust_city, String cust_mob) {
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_city = cust_city;
		this.cust_mob = cust_mob;
	}
	
	void showCust() {
		System.out.println("Customer details of Customer ID: "+cust_id);
		System.out.println("Name: "+cust_name);
		System.out.println("City: "+cust_city);
		System.out.println("Mobile: "+cust_mob);
		
	}
}


public class TestMain1 {

	public static void main(String[] args) {
		Customer cust1 = new Customer(), cust2 = new Customer();
		
		cust1.createCust(1, "Manthan", "Indore", "8989504658");
		cust1.showCust();
		System.out.println();
		
		cust2.createCust(2, "Tony", "New York", "2234556780");
		cust2.showCust();
	}
}
