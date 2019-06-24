package com.benefactor.core.financial;

import java.util.Collection;

public interface IFinancialPosition {
	
	public void addFinancialItem(FinancialItem fitem);
	public Collection<FinancialItem> getFinancialItems(int financialItemType, int... financialItemSubType)throws IllegalArgumentException;
	public Collection<FinancialItem> getAllFinancialItems();
	public void deleteFinancialItem(FinancialItem fitem);
	public void deleteFinancialItem(String itemId);
	
	public double getNetWorth();
	
	public double getTotalAssetsValue();
	
	public double getTotalLiabilitiesValue();
	
	public double getTotalIncomeValue();
	
	public double getTotalExpensesValue();
	
	public double getTotalExpensesValueByType(int finSubType)throws IllegalArgumentException; //illegal argument means if finsubtype is not valid expense type
	
	public double getTotalIncomesValueByType(int finSubType)throws IllegalArgumentException; //illegal argument means if finsubtype is not valid income type
	
	public double getTotalAssetsValueByType(int finSubType)throws IllegalArgumentException; //illegal argument means if finsubtype is not valid asset type
	
	public double getTotalLiabilitiesValueByType(int finSubType)throws IllegalArgumentException; //illegal argument means if finsubtype is not valid liability type
	
	public int getFinancialItemCount(int finType, int... finSubType)throws IllegalArgumentException;

}
