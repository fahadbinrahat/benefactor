package com.benefactor.core.financial;

public class PaymentSchedule implements IPaymentSchedule {

	private String frequency;
	private String period;
	
	public PaymentSchedule(String frequency, String period){
		this.frequency = frequency;
		this.period = period;
	}
	@Override
	public void setFrequency(String frequency) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getFrequency() {
		// TODO Auto-generated method stub
		return this.frequency;
	}

	@Override
	public void setPeriod(String period) {
		// TODO Auto-generated method stub
		this.period = period;

	}

	@Override
	public String getPeriod() {
		// TODO Auto-generated method stub
		return this.period;
	}

}
