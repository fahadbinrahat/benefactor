package com.benefactor.core.financial;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.benefactor.core.financial.Constants;
import com.benefactor.core.user.common.UserDetails;

import com.benefactor.core.dataaccess.DataSourceManager;

public class FinancialPositionManager {

	private ResultSet rs = null;
	private PreparedStatement ps = null;
	private Connection conn = null;

	Collection<FinancialItem> existingFinancialItems = new ArrayList<FinancialItem>();
	Collection<FinancialItem> newFinancialItems = new ArrayList<FinancialItem>();

	boolean isFinancialPositionUpdateSuccessful = false;

	/**
	 * Updated given financial position in database
	 * 
	 * @param fp
	 *            Financial Position
	 */
	public boolean updateFinancialPosition(FinancialPosition fp, UserDetails ud) {

		try {

			conn = DataSourceManager.getConnection();
			ps = conn.prepareStatement(Constants.SQL_SELECT_FINANCIAL_POSITION_BY_CUSTOMER_AND_ID);

			// first separate existing and new ones
			for (FinancialItem fitem : fp.getAllFinancialItems()) {

				if (fitem.getId() != null && !fitem.getId().trim().equalsIgnoreCase("")) {
					ps.setString(1, ud.getUserName());					
					ps.setInt(2, Integer.valueOf(fitem.getId()));
					

					rs = ps.executeQuery();

					if (rs.next()) {
						existingFinancialItems.add(fitem);
					} else {
						newFinancialItems.add(fitem);
					}

					ps.clearParameters();
					if (rs != null) {
						rs.close();
						rs = null;
					}
				} else {
					newFinancialItems.add(fitem);
				}

			}

			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (ps != null) {
				ps.close();
				ps = null;
			}

			ps = conn.prepareStatement(Constants.SQL_UPDATE_FINANCIAL_POSITION);

			// now update existing ones
			for (FinancialItem fitem : existingFinancialItems) {

				ps.setInt(1, fitem.getType());
				ps.setInt(2, fitem.getSubType());
				ps.setDouble(3, fitem.getValue());
				if (fitem.getPaymentSchedule() != null) {
					ps.setString(4, fitem.getPaymentSchedule().getFrequency());
					ps.setString(5, fitem.getPaymentSchedule().getPeriod());
				} else {
					ps.setNull(4, java.sql.Types.INTEGER);
					ps.setInt(5, java.sql.Types.INTEGER);
				}
				ps.setString(6, fitem.getCurrency());
				ps.setString(7, fitem.getDescription());
				ps.setString(8, ud.getUserName());
				ps.setInt(9, Integer.valueOf(fitem.getId()));
				ps.setTimestamp(10, com.benefactor.commons.utils.datetime.DateTimeUtils.getCurrentTimeStamp());
				ps.executeUpdate();
				ps.clearParameters();
			}

			if (ps != null) {
				ps.close();
				ps = null;
			}

			// now insert new ones
			ps = conn.prepareStatement(Constants.SQL_INSERT_FINANCIAL_POSITION);

			for (FinancialItem fitem : newFinancialItems) {

				System.out.println(fitem.getType() + "---" + fitem.getSubType());
				ps.setInt(1, fitem.getType());
				ps.setInt(2, fitem.getSubType());
				ps.setDouble(3, fitem.getValue());
				if (fitem.getPaymentSchedule() != null) {
					ps.setString(4, fitem.getPaymentSchedule().getFrequency());
					ps.setString(5, fitem.getPaymentSchedule().getPeriod());
				} else {
					ps.setNull(4, java.sql.Types.INTEGER);
					ps.setInt(5, java.sql.Types.INTEGER);
				}
				ps.setString(6, fitem.getCurrency());
				ps.setString(7, fitem.getDescription());
				ps.setString(8, ud.getUserName());
				ps.executeUpdate();
				ps.clearParameters();
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

		return isFinancialPositionUpdateSuccessful;
	}

	/**
	 * Retrieves financial position from database
	 * 
	 * @return Financial Position
	 */
	public FinancialPosition retrieveFinancialPosition(UserDetails ud) {

		FinancialPosition fp = new FinancialPosition();

		try {

			conn = DataSourceManager.getConnection();
			ps = conn.prepareStatement(Constants.SQL_GET_FINANCIAL_POSITION_BY_USERNAME);
			ps.setString(1, ud.getUserName());

			rs = ps.executeQuery();

			while (rs.next()) {
				FinancialItem fitem = new FinancialItem();
				fitem.setId(String.valueOf(rs.getInt("ID")));
				fitem.setType(rs.getInt("FI_TYPE_ID"));
				fitem.setSubType(rs.getInt("FI_SUBTYPE"));
				fitem.setValue(rs.getDouble("FI_VALUE"));
				try {
					fitem.setPaymentSchedule(
							new PaymentSchedule(rs.getString("FI_PAYMENT_FREQUENCY"), rs.getString("FI_FREQUENCY_PERIOD")));
				} catch (NullPointerException npe) {
					npe.printStackTrace();
				}
				fitem.setCurrency(rs.getString("FI_CURRENCY"));
				fitem.setDescription(rs.getString("FI_DESCRIPTION"));

				fp.addFinancialItem(fitem);

			}
			
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (ps != null) {
				ps.close();
				ps = null;
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

		return fp;
	}

}
