package com.benefactor.core.user.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import com.benefactor.core.dataaccess.DataSourceManager;
import com.benefactor.core.user.common.UserDetails;
import com.opensymphony.xwork2.ActionContext;

public class UserRegistrationManager {

	
	private PreparedStatement ps = null;
	private Connection conn = null;

	private boolean isRegistrationSuccessful = false;
	private boolean isUpdateSuccessful = false;

	public boolean registerUser(UserDetails userDetails) {

		isRegistrationSuccessful = false;

		try {
			conn = DataSourceManager.getConnection();
			ps = conn.prepareStatement(Constants.SQL_INSERT_INTO_USERS);
			ps.setString(1, userDetails.getUserName());
			ps.setString(2, userDetails.getEmailAddress());
			ps.setString(3, userDetails.getMD5Password());
			ps.setString(4, userDetails.getFirstName());
			ps.setString(5, userDetails.getLastName());
			ps.setString(6, userDetails.getAddress());
			ps.setString(7, userDetails.getCity());
			ps.setString(8, userDetails.getState());
			ps.setString(9, userDetails.getZip());
			ps.setString(10, userDetails.getTitle());
			ps.setString(11, userDetails.getCompany());
			ps.setString(12, userDetails.getPhoneNumber());
			ps.setString(13, userDetails.getWebsite());

			System.out.println(userDetails.toString());
			
			isRegistrationSuccessful = ps.executeUpdate() > 0;
			
			if(isRegistrationSuccessful){
				//User object is created and stored in session because when user is redirected to assess hardship form after successful registration, user object is required there when user submits the form.
				Map session = (Map) ActionContext.getContext().get("session");
				
				session.put("userobj", userDetails);
				
			}
			
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed			
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
			}

		}

		return isRegistrationSuccessful;
	}
	
	public boolean updateUserDetails(UserDetails userDetails){
		
		try {
			conn = DataSourceManager.getConnection();
			ps = conn.prepareStatement(Constants.SQL_UPDATE_USER_DETAILS);
			ps.setString(1, userDetails.getFirstName());
			ps.setString(2, userDetails.getLastName());
			ps.setDate(3, userDetails.getDateOfBirth());
			ps.setString(4, userDetails.getGender());
			ps.setString(5, userDetails.getMaritalStatus());
			ps.setString(6, userDetails.getDependantName());
			ps.setString(7, userDetails.getAddress());
			ps.setString(8, userDetails.getPhoneNumber());
			ps.setString(9, userDetails.getMobile());
			ps.setString(10, userDetails.getDriverLicense());
			ps.setString(11, userDetails.getEmployerName());
			ps.setString(12, userDetails.getEmployerType());
			ps.setTimestamp(13, com.benefactor.commons.utils.datetime.DateTimeUtils.getCurrentTimeStamp());
			ps.setString(14, userDetails.getUserName());

			
			
			isUpdateSuccessful = ps.executeUpdate() > 0;
			
			System.out.println(userDetails.toString() + " " + isUpdateSuccessful);
			
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed			
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
			}

		}
		
		
		return isUpdateSuccessful;
	} 

}
