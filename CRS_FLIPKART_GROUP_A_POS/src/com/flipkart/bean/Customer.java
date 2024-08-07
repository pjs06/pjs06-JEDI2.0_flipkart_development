package com.flipkart.bean;

/**
 * @author Dell
 *
 */
public class Customer {
	
	// Properties of Domain
	private int customerID;
	private String customerName;
	private String customerAddress;
		
	// Properties with Setter Getter
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	

}
