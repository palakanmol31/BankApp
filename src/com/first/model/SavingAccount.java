 package com.first.model;
import com.first.Account;
import com.first.Card;

public class SavingAccount implements Account{
	
	private Card atmCard;
	
	public SavingAccount(Card card) {
		atmCard = card;
	}
	
	@Override
	public String createAccount(){
		return "Saving Account Created successfully" ;
	}

	@Override
	public String cardDetails() {
		// TODO Auto-generated method stub
		return atmCard.cardDetails() ;
	}
}
