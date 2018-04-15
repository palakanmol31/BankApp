package com.first.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.first.Account;
import com.first.Card;

public class CurrentAccount implements Account{
	
	@Autowired
	private Card creditCard;
	
	public void setCreditCard(Card creditCard) {
		this.creditCard = creditCard;
	}
	
	public void onInit() {
		System.out.println("on init method of current account");
	}
	
	public void onDestroy() {
		System.out.println("destroy method of current account");
	}

	@Override
	public String createAccount() {
		// TODO Auto-generated method stub
		return "Current Account created successfully";
	}

	@Override
	public String cardDetails() {
		// TODO Auto-generated method stub
		return this.creditCard.cardDetails();
	}

}
