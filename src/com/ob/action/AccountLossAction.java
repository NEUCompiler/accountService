package com.ob.action;

import com.ob.dao.impl.AccountDAOImpl;
import com.ob.model.Account;
import com.ob.model.Client;
import com.ob.service.AccountService;
import com.opensymphony.xwork2.ModelDriven;

public class AccountLossAction extends SuperAction implements
		ModelDriven<Account> {

	private Account account;
	private AccountService accountService;
	private Client client = new Client();

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	public void loss() {
		account.setAccountid(session.getAttribute("account").toString());
		accountService.setLoss(account);
	}
	

	public String showAccount() {
		account.setClientid(111);
		session.setAttribute("clientId", 111);
		request.setAttribute("accountIdList",
				accountService.getCdsOfClientByLoss(account));
		System.out.println(accountService.getCdsOfClientByLoss(account));
		return "zhangdabenshowAccount";
	}


	public String confirmPassword() {
		
		client.setUserpassword(request.getParameter("accountPassword"));
	
		System.out.println(session.getAttribute("clientId"));

		
		client.setClientid(Integer.parseInt(session.getAttribute("clientId")
				.toString()));

		if (!accountService.confirmSearchPassword(client)) {
			return "zhangdabenconfirmFailedLoss";
		}
		loss();
		return "zhangdabenconfirmSuccessLoss";
	}

	public String selectCard() {
		session.setAttribute("account", request.getParameter("selectAccount"));
		return "zhangdabenselectOkLoss";
	}

	@Override
	public Account getModel() {

		if (account == null) {
			account = new Account();
		}
		return account;
	}
}