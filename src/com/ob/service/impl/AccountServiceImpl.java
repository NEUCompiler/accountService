package com.ob.service.impl;

import java.util.ArrayList;

import com.ob.dao.AccountDAO;
import com.ob.dao.ClientDAO;
import com.ob.dao.DealinformDAO;
import com.ob.dao.impl.ClientDAOImpl;
import com.ob.model. Account;
import com.ob.model.Client;
import com.ob.service. AccountService;

public class AccountServiceImpl implements  AccountService {
	private AccountDAO dao;
	private ClientDAO clientDAO;
	private DealinformDAO dealinformDAO;
	
	public AccountDAO getDao() {
		return dao;
	}
	
	public DealinformDAO getDealinformDAO() {
		return dealinformDAO;
	}

	
	public void setDao(AccountDAO dao) {
		this.dao = dao;
	}

	public void setClientDAO(ClientDAO clientDAO) {
		this.clientDAO = clientDAO;
	}

	public void setDealinformDAO(DealinformDAO dealinformDAO) {
		this.dealinformDAO = dealinformDAO;
	}
	
	
	public Account findById(String id) {
		return dao.findById(id);
	}
	
	
	public boolean setLoss(Account account) {
		account = dao.findById(account.getAccountid());
		account.setIsloss(1);
		//TODO merge�����⡣
		dao.merge(account);
		System.out.println(account);
		return true;
	}
	
	public boolean confirmSearchPassword(Client client) {
	
		System.out.println("erereru"+client.getUserpassword());
		System.out.println(null==clientDAO);
		if(null==clientDAO){
			clientDAO =  new ClientDAOImpl();
		}
		System.out.println(clientDAO.findById(111));
		if (client.getUserpassword().equals(clientDAO.findById(client.getClientid()).getUserpassword().toString())) {
			return true;
		}
		
		return false;
	}
	
	public ArrayList<String> getCdsOfClient(Account account) {
		ArrayList<String> accountIdList = new ArrayList<String>();
		ArrayList<Account> accounts = (ArrayList<Account>)dao.findByClientid(account.getClientid());
		
		for (Account item : accounts) {
			accountIdList.add(item.getAccountid());
		}
		
		return accountIdList;
	}
	
	public ArrayList<Account> getAllAccount(Account account) {
		ArrayList<Account> accounts = (ArrayList<Account>)dao.findByClientid(account.getClientid());
		return accounts;
	}
	
	public ArrayList<String> getCdsOfSignClient(Account account) {
		ArrayList<String> accountIdList = new ArrayList<String>();
		ArrayList<Account> accounts = (ArrayList<Account>)dao.findByClientid(account.getClientid());
		
		for (Account item : accounts) {
			if((item.getIsopenob() == 1)&&(item.getCdlimit()==0)) {
				accountIdList.add(item.getAccountid());
			
			}
		}
		
		return accountIdList;
	}
	
	public boolean setDealPassword(Account account) {
		Integer dealPassword = account.getDealpassword();
		account  = dao.findById(account.getAccountid());
		account.setDealpassword(dealPassword);
		dao.merge(account);
		return false;
	}
	public boolean setOthername(Account account) {
		String othername = account.getOthername();
		account  = dao.findById(account.getAccountid());
		account.setOthername(othername);
		dao.merge(account);
		return false;
	}
	
	public ArrayList<String> getCdsOfClientByLoss(Account account) {
		ArrayList<String> accountIdList = new ArrayList<String>();
		ArrayList<Account> accounts = (ArrayList<Account>)dao.findByClientid(account.getClientid());
		
		for (Account item : accounts) {
			
			if ((item.getIsloss() == 0)&&(item.getCdlimit()==0)) {
				accountIdList.add(item.getAccountid());
			}
		}
		
		return accountIdList;
	}

	public ArrayList<String> getCdsOfClientByAccount(Account account) {
		ArrayList<String> accountIdList = new ArrayList<String>();
		ArrayList<Account> accounts = (ArrayList<Account>)dao.findByClientid(account.getClientid());
		
		for (Account item : accounts) {
			
			if (item.getCdlimit()==0) {
				accountIdList.add(item.getAccountid());
			}
		}
		
		return accountIdList;
	}
	
	
}
