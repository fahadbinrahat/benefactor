package com.benefactor.core.financial;

public interface IFinancialItem {
	
	public String getId();
	public void setId(String id);
	public int getType();
	public void setType(int type);
	public void setValue(double amount);
	public double getValue();
	public void setCurrency(String currency);
	public String getCurrency();
	public void setSubType(int subType);
	public int getSubType();
	public void setDescription(String description);
	public String getDescription();	
	public void setPaymentSchedule(PaymentSchedule schedule);
	public PaymentSchedule getPaymentSchedule();

}
