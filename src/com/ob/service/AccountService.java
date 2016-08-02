package com.ob.service;

import java.util.ArrayList;

import com.ob.dao.AccountDAO;
import com.ob.dao.DealinformDAO;
import com.ob.model.Account;
import com.ob.model.Client;

public interface AccountService {
	public AccountDAO getDao();
	public DealinformDAO getDealinformDAO();
	public Account findById(String id);
	public ArrayList<String> getCdsOfClientByLoss(Account account);
	public ArrayList<String> getCdsOfClientByAccount(Account account);
	public boolean setLoss(Account account);
	public ArrayList<String> getCdsOfClient(Account account);
	public boolean setDealPassword(Account account);
	public boolean confirmSearchPassword(Client client);
	public ArrayList<String> getCdsOfSignClient(Account account);
	public boolean setOthername(Account account);
	public ArrayList<Account> getAllAccount(Account account);
}
