package com.first;

import com.first.model.CurrentAccount;
import com.first.model.SavingAccount;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBankApp {
	public static void main(String args[]) {
		//SavingAccount account = new SavingAccount();
		//Account account = new SavingAccount();
		//Account account = new CurrentAccount();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Account account = context.getBean("myAccount", Account.class); 
		System.out.println(account.createAccount());
		System.out.println(account.cardDetails());
		//Account account2 = context.getBean("myAccount", Account.class); 
		//boolean isSame = (account1 == account2);
		//System.out.println(isSame);
		//System.out.println(account1.hashCode() + " " + account2.hashCode() );
		context.close();
	}
}
  