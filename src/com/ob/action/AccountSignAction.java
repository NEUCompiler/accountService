package com.ob.action;

import java.io.UnsupportedEncodingException;

import com.ob.model.Account;
import com.ob.service.AccountService;
import com.opensymphony.xwork2.ModelDriven;

public class AccountSignAction  extends SuperAction implements
ModelDriven<Account> {


	private Account account;
	private AccountService accountService;

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
		
	}
	
	public String showAccount() {
		account.setClientid(111);
		session.setAttribute("clientId", 111);
		request.setAttribute("accountIdList", accountService.getCdsOfSignClient(account));
		System.out.println(accountService.getCdsOfSignClient(account));
		return "showSignAccount";
	}
	
	public String selectCard() {
		session.setAttribute("account", request.getParameter("selectAccount"));
		return "selectOkSignAccount";
	}
	public String setOtherName(){
		account.setAccountid(session.getAttribute("account").toString());
		String othername = request.getParameter("othername");
		System.out.println("othername:"+othername);
		account.setOthername(othername);
		accountService.setOthername(account);
		return "issuccess";
	}
	
	public Account getModel() {
		if (account == null) {
			account = new Account();
		}
		return account;
	}

	
}