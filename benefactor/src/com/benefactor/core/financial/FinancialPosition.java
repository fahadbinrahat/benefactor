package com.benefactor.core.financial;

import java.util.ArrayList;
import java.util.Collection;

public class FinancialPosition implements IFinancialPosition {

	Collection<FinancialItem> fitems = new ArrayList<FinancialItem>();
	
	@Override
	public void addFinancialItem(FinancialItem fitem) {
		// TODO Auto-generated method stub
		this.fitems.add(fitem);
	}

	@Override
	public Collection<FinancialItem> getFinancialItems(int financialItemType, int... financialItemSubType)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFinancialItem(FinancialItem fitem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFinancialItem(String itemId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getNetWorth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotalAssetsValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotalLiabilitiesValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotalIncomeValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotalExpensesValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotalExpensesValueByType(int finSubType) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotalIncomesValueByType(int finSubType) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotalAssetsValueByType(int finSubType) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotalLiabilitiesValueByType(int finSubType) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFinancialItemCount(int finType, int... finSubType) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<FinancialItem> getAllFinancialItems() {
		// TODO Auto-generated method stub
		return this.fitems;
	}

}
