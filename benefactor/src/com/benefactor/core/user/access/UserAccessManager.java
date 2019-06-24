package com.benefactor.core.user.access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.benefactor.core.dataaccess.DataSourceManager;
import com.benefactor.core.user.common.UserDetails;

public class UserAccessManager {
	
	
	
	private ResultSet rs = null;
	private PreparedStatement ps = null;
	private Connection conn = null;

	public UserDetails retrieveUser(UserDetails ud)throws UserNotFoundException {
		
		try {
			conn = DataSourceManager.getConnection();
			ps = conn.prepareStatement(Constants.SQL_SELECT_USERS);
			ps.setString(1, ud.getUserName());
			ps.setString(2, ud.getMD5Password());
			
			rs = ps.executeQuery();
			
			if (!rs.next() ) {
			    throw new UserNotFoundException();
			} else {

			    do {
			     ud.setAddress(rs.getString("address"));
			     ud.setCity(rs.getString("city"));
			     ud.setCompany(rs.getString("company"));
			     ud.setDateOfBirth(rs.getDate("dob"));
			     ud.setDependantName(rs.getString("dependant"));
			     ud.setDriverLicense(rs.getString("driverlicense"));
			     ud.setEmailAddress(rs.getString("email"));
			     ud.setEmployerName(rs.getString("employername"));
			     ud.setEmployerType(rs.getString("employertype"));
			     ud.setFirstName(rs.getString("first_name"));
			     ud.setLastName(rs.getString("last_name"));
			     ud.setGender(rs.getString("gender"));
			     ud.setMaritalStatus(rs.getString("maritalstatus"));
			     ud.setMobile(rs.getString("mobile"));
			     ud.setPhoneNumber(rs.getString("phone"));
			     ud.setState(rs.getString("state"));
			     ud.setTitle(rs.getString("title"));
			     ud.setUserId(String.valueOf(rs.getInt("user_id")));
			     ud.setUserName(rs.getString("user_name"));
			     ud.setWebsite(rs.getString("website"));
			     ud.setZip(rs.getString("zip"));			     
			     
			    } while (rs.next());
			}
		} catch (SQLException ex) {
			ud = null;
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {
			// it is a good idea to release
			// resources in a finally{} block
			// in reverse-order of their creation
			// if they are no-longer needed
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) {
				} // ignore
				rs = null;
			}
			if (ps != null) {
				try {
					ps.close();					
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
				ps = null;
			}
			/*if (conn != null){
				try{
					conn.close();					
				}catch(SQLException sqle) {
					sqle.printStackTrace();
				}
				conn = null;
			}*/

		}
		return ud;
	}
	
	
	
	

}
