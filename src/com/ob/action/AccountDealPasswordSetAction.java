package com.ob.action;

import com.ob.model.Account;
import com.ob.service.AccountService;
import com.opensymphony.xwork2.ModelDriven;

public class AccountDealPasswordSetAction  extends SuperAction implements
ModelDriven<Account> {


	private Account account;
	private AccountService accountService;

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	
	/**
	 * �����������á�
	 * @return
	 */
	public String setPassword() { 
		account.setAccountid(session.getAttribute("account").toString());
		String chPassword = request.getParameter("chPassword");
		String confirmPassword = request.getParameter("confirmPassword");
		
		if (!account.getDealpassword().equals(accountService.getDao().findById(account.getAccountid()).getDealpassword())) {
			request.setAttribute("info", "��ǰ�������벻��ȷ");
		} else if (!chPassword.equals(confirmPassword)) {
			request.setAttribute("info", "�������벻һ�£����������룡");
			
		} else if(!chPassword.matches("^[0-9]{6}$")) {
			request.setAttribute("info", "����������6������");
		} else {
			account.setDealpassword(Integer.parseInt((chPassword)));
			accountService.setDealPassword(account);
			return "dealPasswordSetSuccess";
		}
		return "dealPasswordSetFailed";
	}
	
	/**
	 * ��ʾ����
	 * @return
	 */
	public String showAccount() {
		account.setClientid(111);
		session.setAttribute("clientId", 111);
		System.out.println("111");
		request.setAttribute("accountIdList", accountService.getCdsOfClientByAccount(account));
		System.out.println("a111");
		return "showAccountDealPasswordSet";
	}
	
	/**
	 * ѡ�񿨡�
	 * @return
	 */
	public String selectCard() {
		session.setAttribute("account", request.getParameter("selectAccount"));
		
		return "selectOkDealPassword";
	}
	
	@Override
	public Account getModel() {
		if (account == null) {
			account = new Account();
		}
		return account;
	}
}
