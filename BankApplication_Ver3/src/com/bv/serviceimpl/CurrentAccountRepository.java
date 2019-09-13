package com.bv.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.bv.database.DatabaseClass;
import com.bv.model.Account;
import com.bv.model.CurrentAccount;
import com.bv.model.SavingAccount;

public class CurrentAccountRepository {
	
	private Map<Integer, CurrentAccount> currentAccounts = DatabaseClass.getCurrentAccount();
	
	public  CurrentAccountRepository() {
	
		currentAccounts.put(101, new CurrentAccount(101, "Parvati", 5000));
		currentAccounts.put(102, new CurrentAccount(102, "Jaya", 7000));
	}
	// select all statement in sequel
	//select * from accounts
	public List<CurrentAccount> getAllAccounts()
	{
		return new ArrayList<CurrentAccount>(currentAccounts.values());
	}
	//select * from accounts where acc_no = ?
	public void  getAccount(int acc_no)
	{
		Account currentAccount1 = currentAccounts.get(acc_no);
		/*System.out.println(currentAccount1);*/
		  CurrentAccountService curentAccountService1 = new
		  CurrentAccountService((CurrentAccount) currentAccount1);
		/*  System.out.println(curentAccountService1);*/
		  curentAccountService1.chooseOperation();
//		return savingAccounts.get(acc_no);
	}
	public CurrentAccount addAccount(CurrentAccount savingAccount) {
		savingAccount.setAcc_no(savingAccount.getAcc_no()+0);
		currentAccounts.put(savingAccount.getAcc_no(),savingAccount);
		return savingAccount;
	}
	
	public Account updateAccount(CurrentAccount savingAccount)
	{
		if(savingAccount.getHolder_name().isEmpty())
		{
			return null;
		}
		currentAccounts.put(savingAccount.getAcc_no(), savingAccount);
		return savingAccount;
			
	}
	public Account removeAccount(int acc_no)
	{
		return currentAccounts.remove(acc_no);
	}

}
