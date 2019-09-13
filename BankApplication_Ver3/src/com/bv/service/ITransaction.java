package com.bv.service;

import com.exception.InsufficientFundException;

public interface ITransaction {

	public void withdraw(double amount) throws InsufficientFundException;
	public void deposite(double amount);
	
}
