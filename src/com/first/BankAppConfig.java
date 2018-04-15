package com.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.first.model.CreditCard;
import com.first.model.CurrentAccount;

public class BankAppConfig {
	
	@Bean
	public CreditCard creditCard() {
		return new CreditCard();
	}
	
	@Bean(initMethod = "onInit", destroyMethod="onDestroy")
	@Scope("prototype")
	public CurrentAccount currentAccount(){
		return new CurrentAccount();
	}
	
	
	
	
}
 