package com.benefactor.commons.utils.datetime;

public class DateTimeUtils {

	public static java.sql.Timestamp getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());

	}
	
}
