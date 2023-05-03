package com.eibfs.bankingapp;

import java.time.LocalDate;

import com.eibfs.bankingapp.dto.Account;
import com.eibfs.bankingapp.dto.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Account Class 
		Account account = new Account();
		Account account2 = new Account();
		
		
		
		account.setAccountNumber("NF001");
		account.setAccountHolderName("Nouf");
		account.setAccountType("Saving");
		account.setAddress("AbuDhabi");
		account.setBalance(500);
		account.setContactNumber("9997779797");
		//account.setAccountCreated(LocalDate.now());
		account.setActive(true);
		
		//when you will print the ref. then it will call toString method implicitly.
				System.out.println(account);
				//System.out.println(account.toString());
				
				
	
	// Customer Class 
				Customer customer = new Customer();
				
				customer.setCustomerID("N007");
				customer.setCustomerName("Nouf Al Hammadi");
				customer.setContactNumber("01364565496");
				customer.setAddress("AbuDhabi");
				
				System.out.println(customer);
				//System.out.println(customer.toString());
				
				
				
											
 }  
		  
		
	}


