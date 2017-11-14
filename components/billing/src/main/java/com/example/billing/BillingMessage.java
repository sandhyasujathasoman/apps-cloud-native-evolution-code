package com.example.billing;

import java.io.Serializable;

public class BillingMessage implements Serializable {

	
	public BillingMessage(String userId, int amount) {
		super();
		this.userId = userId;
		this.amount = amount;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userId;
	private int amount;
	
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
