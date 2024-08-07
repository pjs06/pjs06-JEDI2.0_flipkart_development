package com.flipkart.client;


import com.flipkart.business.CustomerBusiness;
public class CustomerClient {

	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		CustomerBusiness business=new CustomerBusiness();
		business.createCustomer();
		System.out.println("delete customer by Id-->" +business.deleteCustomer (101));
		System.out.println ("Update Customer by id-->" +business.updateCustomer (101));
		business.listCustomer();
	}
}
