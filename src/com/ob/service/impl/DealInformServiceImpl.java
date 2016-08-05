package com.ob.service.impl;

import com.ob.dao.DealinformDAO;
import com.ob.model.Dealinform;
import com.ob.service.DealinformService;

public class DealInformServiceImpl implements DealinformService {
	private DealinformDAO dealinformDAO;

	public DealinformDAO getDealinformDAO() {
		return dealinformDAO;
	}
	public void setDealinformDAO(DealinformDAO dealinformDAO) {
		this.dealinformDAO = dealinformDAO;
	}
	@Override
	public boolean addOrUpdatePayment(Dealinform dealinform) {
		// TODO Auto-generated method stub
		return dealinformDAO.addOrUpdatePayment(dealinform);
	}
	@Override
	public boolean addOrUpdatePaymentIn(Dealinform dealinform) {
		// TODO Auto-generated method stub
		return dealinformDAO.addOrUpdatePaymentIn(dealinform);
	}
}
