package com.bv.serviceimpl;

import java.util.Scanner;

import com.bv.model.CurrentAccount;
import com.bv.model.SavingAccount;
import com.bv.serviceimpl.CurrentAccountRepository;
import com.bv.serviceimpl.SavingAccountsRepository;

public class Services {
	public void accounts() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Select One of the Option below:" + "\n1:Saving Account" + "\n2:Current Account"
					+ "\n3:Don't have account?Create new Account" + "\n4.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter your account Number:");
				int accno = sc.nextInt();
				SavingAccountsRepository savingRepo = new SavingAccountsRepository();
				savingRepo.getAccount(accno);

				break;
			}
			case 2: {
				System.out.println("Enter your account Number:");
				int accnno = sc.nextInt();
				CurrentAccountRepository currentRepo = new CurrentAccountRepository();
				currentRepo.getAccount(accnno);
				break;
			}

			case 3: {

				System.out.println("Enter account no");
				int accno1 = sc.nextInt();
				System.out.println("Enter Holder's name");
				String holdername = sc.next();
				System.out.println("Enter balance");
				double bal = sc.nextDouble();
				System.out.println("choose which account you want to  create" + "\n1.Press 1 for saving account "
						+ "\n2.Press 2 for current account");
				int ch = sc.nextInt();
				if (ch == 1) {
					System.out.println("want salary account (true,false)");
					boolean type = sc.hasNext();
					SavingAccount savingAccount = new SavingAccount(accno1, holdername, bal, type);
					SavingAccountsRepository savingRepos = new SavingAccountsRepository();
					savingRepos.addAccount(savingAccount);
					break;
				} else if (ch == 2) {
					CurrentAccount currentAccount = new CurrentAccount(accno1, holdername, bal);
					CurrentAccountRepository currentRepos = new CurrentAccountRepository();
					currentRepos.addAccount(currentAccount);
					break;
				}

			}
			case 4:
				System.exit(0);
			default: {
				System.out.println("Invalid Operation");
			}
			}
		}
	}

}
