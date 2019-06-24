package com.benefactor.core.financial;

public interface Constants {
	
	public static final String SQL_UPDATE_FINANCIAL_POSITION = 	"update financialposition set fi_type_id=?, fi_subtype = ?, fi_value=?, fi_payment_frequency=?, fi_frequency_period=?, fi_currency=?, fi_description=?, last_update_timestamp=? where customer_id = ? and id = ?";
	
	public static final String SQL_SELECT_FINANCIAL_POSITION_BY_CUSTOMER_AND_ID = "select * from financialposition where customer_id = ? and id = ?";
	
	public static final String SQL_INSERT_FINANCIAL_POSITION = 	"insert into financialposition(fi_type_id,fi_subtype,fi_value,fi_payment_frequency,fi_frequency_period,fi_currency,fi_description,customer_id) values(?,?,?,?,?,?,?,?)";
	
	public static final String SQL_GET_FINANCIAL_POSITION_BY_USERNAME = "select * from financialposition where customer_id = ?";
}
