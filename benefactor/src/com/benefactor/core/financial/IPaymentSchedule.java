package com.benefactor.core.financial;

public interface IPaymentSchedule {
	public void setFrequency(String frequency);
	public String getFrequency();
	public void setPeriod(String period);
	public String getPeriod();	
}
