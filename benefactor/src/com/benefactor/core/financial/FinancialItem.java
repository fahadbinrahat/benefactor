package com.benefactor.core.financial;

public class FinancialItem implements IFinancialItem {

	private int type;
	private int subType;

	private double value;

	private String currency = "AUD"; // AUD is default currency
	private String description; // Any additional/extra information such as
								// libality(loan/creditcard) is with citibank.
	private String id; // Unique ID (DB generated) to reference particular
						// financial item such as for delete or search.

	private PaymentSchedule paymentSchedule;

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public void setType(int type) {
		// TODO Auto-generated method stub
		this.type = type;

	}

	@Override
	public void setValue(double amount) {
		// TODO Auto-generated method stub
		this.value = amount;

	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return this.value;
	}

	@Override
	public void setCurrency(String currency) {
		// TODO Auto-generated method stub
		this.currency = currency;

	}

	@Override
	public String getCurrency() {
		// TODO Auto-generated method stub
		return this.currency;
	}

	@Override
	public void setSubType(int subType) {
		// TODO Auto-generated method stub
		this.subType = subType;
	}

	@Override
	public int getSubType() {
		// TODO Auto-generated method stub
		return this.subType;
	}

	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		this.description = description;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	@Override
	public void setPaymentSchedule(PaymentSchedule paymentSchedule) {
		// TODO Auto-generated method stub
		this.paymentSchedule = paymentSchedule;

	}

	@Override
	public PaymentSchedule getPaymentSchedule() {
		// TODO Auto-generated method stub
		return this.paymentSchedule;
	}

}
