package com.eibfs.bankingapp.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data


public class Account {
	
	// we will have private properties
	private String accountHolderName; 
	private String accountNumber;
	private float balance; 
	private String accountType;
	private String contactNumber;
	private String address;
	
	// exclude the setter for the "Date" to be read only 
	@Setter(value = AccessLevel.NONE)
	// mark the rule to skip the getter method
	@Getter(value = AccessLevel.NONE)
	private LocalDateTime accountCreated = LocalDateTime.now();
	
	// user account is active or not 
	private boolean isActive;

	@Override
	public String toString() {
		return "Account [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", balance="
				+ balance + ", accountType=" + accountType + ", contactNumber=" + contactNumber + ", address=" + address
				+ ", accountCreated=" + accountCreated.format(DateTimeFormatter.ofPattern("D dd-MM-YYYY HH:mm:SS")) + "]";
	}

	
}
