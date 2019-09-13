package com.bv.execution;

import com.bv.serviceimpl.Services;

public class BankApp {

	public static void main(String[] args) {
		// Account salAccount = new SalaryAccount(102, "SalaryAccountHolder", 4000,
		// true);
		/*
		 * Account savingAccount = new SavingAccount(101, "Parvati", 5000, true);
		 * 
		 * SavingAccountService savingAccountService = new
		 * SavingAccountService((SavingAccount) savingAccount);
		 * savingAccountService.chooseOperation();
		 * 
		 * 
		 * Account savingAccount1 = new SavingAccount(102, "Dhaval", 2000, false);
		 * 
		 * SavingAccountService savingAccountService1 = new
		 * SavingAccountService((SavingAccount) savingAccount1);
		 * savingAccountService1.chooseOperation();
		 */

		/*
		 * SavingAccountsRepository savingRepo = new SavingAccountsRepository();
		 * System.out.println(savingRepo.getAllAccounts());
		 * System.out.println(savingRepo.getAccount(101)); SavingAccount savingAccount =
		 * new SavingAccount(103, "Kajal", 10000, true);
		 * System.out.println(savingRepo.addAccount(savingAccount));
		 * System.out.println(savingRepo.getAllAccounts());
		 * System.out.println(savingRepo.removeAccount(102));
		 * System.out.println("After Deletion");
		 * System.out.println(savingRepo.getAllAccounts());
		 */
		/*
		 * /* savingAccountService.deposite(500); savingAccountService.withdraw(4600);
		 * //savingAccountService.deposite(1000); savingAccountService.withdraw(350);
		 * savingAccountService.withdraw(350); savingAccountService.deposite(1050);
		 * 
		 * System.out.println("-------------------------------");
		 * 
		 * System.out.println("Acco no: "+salAccount.getAcc_no());
		 * System.out.println("Holder name: "+salAccount.getHolder_name());
		 * System.out.println("Balance: "+salAccount.getBalance());
		 * System.out.println("Credit card Issued: "+((SalaryAccount)
		 * salAccount).isCreditCardIssued());
		 * 
		 * 
		 * SalaryAccountService salaryAccountService = new
		 * SalaryAccountService((SalaryAccount) salAccount);
		 * salaryAccountService.withdraw(1000); salaryAccountService.deposite(100);
		 * 
		 * 
		 */
		Services s=new Services();
		s.accounts();
	
	}

}
