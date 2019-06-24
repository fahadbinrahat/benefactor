package com.benefactor.core.user.registration;

public interface Constants {
	
	public static final String SQL_INSERT_INTO_USERS = "insert into bene_users(user_name,email,password,first_name,last_name,address,city,state,zip,title,company,phone,website) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String SQL_UPDATE_USER_DETAILS = "update bene_users set first_name=?,last_name=?,dob=?,gender=?,maritalstatus=?,dependant=?,address=?,phone=?,mobile=?,driverlicense=?,employername=?,employertype=?,lastupdate_timestamp=? where user_name=?";

}
