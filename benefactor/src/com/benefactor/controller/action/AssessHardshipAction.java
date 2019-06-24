package com.benefactor.controller.action;

import java.sql.Date;

import java.util.Map;

import com.benefactor.commons.utils.validation.DataValidationUtils;

import com.benefactor.core.financial.FinancialItem;
import com.benefactor.core.financial.FinancialPosition;
import com.benefactor.core.financial.FinancialPositionManager;
import com.benefactor.core.financial.IFinancialItemSubType;
import com.benefactor.core.financial.IFinancialItemType;
import com.benefactor.core.financial.IPaymentFrequency;
import com.benefactor.core.financial.PaymentSchedule;
import com.benefactor.core.financial.assessment.Assessment;
import com.benefactor.core.financial.assessment.HardshipAssessmentManager;
import com.benefactor.core.financial.assessment.IOutcome;
import com.benefactor.core.user.common.UserDetails;
import com.benefactor.core.user.registration.UserRegistrationManager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AssessHardshipAction extends ActionSupport {

	public static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String driverLicense;
	private String address;
	private String gender;
	private String telephone;
	private String mobile;
	private String maritalStatus;
	private String dependantName;
	private String employerName;
	private String employerType;

	private double salaryIncome;
	private double partnerSalaryIncome;
	private double savingsIncome;
	private double dividentsIncome;
	private double commissionsIncome;
	private double royaltiesIncome;
	private double centerlinkPaymentsIncome;
	private double rentalIncome;
	private double otherIncome;

	private double mortgageExpense;
	private double carLoanExpense;
	private double personalLoanExpense;
	private double payDayLoanExpense;
	private double creditCardExpense;
	private double feeHelpExpense;
	private double otherDebtExpense;
	private double rentExpense;
	private double basicLivingExpense;
	private double telephoneBillExpense;
	private double mobileBillExpense;
	private double internetBillExpense;
	private double payTvBillExpense;
	private double electricityBillExpense;
	private double gasBillExpense;
	private double waterBillExpense;
	private double strataBillExpense;
	private double councilRatesExpense;
	private double trainFareExpense;
	private double fuelExpense;
	private double carServicingExpense;
	private double regoExpense;
	private double carInsuranceExpense;
	private double homeInsuranceExpense;
	private double healthInsuranceExpense;
	private double gymMembershipExpense;
	private double petExpense;
	private double resturantBillExpense;
	private double cinemaMovieExpense;
	private double smokingBillExpense;
	private double alcoholExpense;
	private double gamblingExpense;
	private double familyGiftsExpense;
	private double studyExpense;

	private String salaryIncomeFrequency;
	private String partnerSalaryIncomeFrequency;
	private String savingsIncomeFrequency;
	private String dividentsIncomeFrequency;
	private String commissionIncomeFrequency;
	private String royaltyIncomeFrequency;
	private String centerlinkPaymentsIncomeFrequency;
	private String rentalIncomeFrequency;
	private String otherIncomeFrequency;

	private String mortgageExpenseFrequency;
	private String carLoanExpenseFrequency;
	private String personalLoanExpenseFrequency;
	private String payDayLoanExpenseFrequency;
	private String creditCardExpenseFrequency;
	private String feeHelpExpenseFrequency;
	private String otherDebtExpenseFrequency;
	private String rentalExpenseFrequency;
	private String basicLivingExpenseFrequency;
	private String telephoneBillExpenseFrequency;
	private String mobileBillExpenseFrequency;
	private String internetBillExpenseFrequency;
	private String payTvBillExpenseFrequency;
	private String electricityBillExpenseFrequency;
	private String gasBillExpenseFrequency;
	private String waterBillExpenseFrequency;
	private String strataExpenseFrequency;
	private String councilRatesExpenseFrequency;
	private String trainFareExpenseFrequency;
	private String fuelExpenseFrequency;
	private String carServicingExpenseFrequency;
	private String regoExpenseFrequency;
	private String carInsuranceExpenseFrequency;
	private String homeInsuranceExpenseFrequency;
	private String healthInsuranceExpenseFrequency;
	private String gymMembershipExpenseFrequency;
	private String petExpenseFrequency;
	private String resturantBillExpenseFrequency;
	private String cinemaExpenseFrequency;
	private String smokingExpenseFrequency;
	private String alcoholExpenseFrequency;
	private String gamblingExpenseFrequency;
	private String familyGiftsExpenseFrequency;
	private String studyExpenseFrequency;
	private String cinemaMovieExpenseFrequency;
	private String commissionsIncomeFrequency;
	private String rentExpenseFrequency;

	private double houseMortgageLiability;
	private double carLoanLiability;
	private double personalLoanLiability;
	private double storeAccountsLiability;
	private double onlineStoreAccountsLiability;
	private double creditCardOneLiability;
	private double creditCardTwoLiability;
	private double creditCardThreeLiability;
	private double otherLiability;
	private double studyLoanLiability;
	private double atoDebtLiability;
	private double familyDebtLiability;
	private double investmentPropertyLiability;

	private double housePropertyAsset;
	private double houseHoldFurnitureAsset;
	private double vehicleAsset;
	private double bankAccountCashAsset;
	private double boatAsset;
	private double jewelleryAsset;
	private double superAnnuationAsset;
	private double stocksAsset;
	private double investmentPropertyAsset;
	private double termDepositAsset;

	private String salaryIncomeId;
	private String partnerSalaryIncomeId;
	private String savingsIncomeId;
	private String dividentsIncomeId;
	private String commissionsIncomeId;
	private String royaltiesIncomeId;
	private String centerlinkPaymentsIncomeId;
	private String rentalIncomeId;
	private String otherIncomeId;

	private String mortgageExpenseId;
	private String carLoanExpenseId;
	private String personalLoanExpenseId;
	private String payDayLoanExpenseId;
	private String creditCardExpenseId;
	private String feeHelpExpenseId;
	private String otherDebtExpenseId;
	private String rentExpenseId;
	private String basicLivingExpenseId;
	private String telephoneBillExpenseId;
	private String mobileBillExpenseId;
	private String internetBillExpenseId;
	private String payTvBillExpenseId;
	private String electricityBillExpenseId;
	private String gasBillExpenseId;
	private String waterBillExpenseId;
	private String strataBillExpenseId;
	private String councilRatesExpenseId;
	private String trainFareExpenseId;
	private String fuelExpenseId;
	private String carServicingExpenseId;
	private String regoExpenseId;
	private String carInsuranceExpenseId;
	private String homeInsuranceExpenseId;
	private String healthInsuranceExpenseId;
	private String gymMembershipExpenseId;
	private String petExpenseId;
	private String resturantBillExpenseId;
	private String cinemaMovieExpenseId;
	private String smokingBillExpenseId;
	private String alcoholExpenseId;
	private String gamblingExpenseId;
	private String familyGiftsExpenseId;
	private String studyExpenseId;
	private String houseMortgageLiabilityId;
	private String carLoanLiabilityId;
	private String personalLoanLiabilityId;
	private String storeAccountsLiabilityId;
	private String onlineStoreAccountsLiabilityId;
	private String creditCardOneLiabilityId;
	private String creditCardTwoLiabilityId;
	private String creditCardThreeLiabilityId;
	private String otherLiabilityId;
	private String studyLoanLiabilityId;
	private String atoDebtLiabilityId;
	private String familyDebtLiabilityId;
	private String investmentPropertyLiabilityId;

	private String housePropertyAssetId;
	private String houseHoldFurnitureAssetId;
	private String vehicleAssetId;
	private String bankAccountCashAssetId;
	private String boatAssetId;
	private String jewelleryAssetId;
	private String superAnnuationAssetId;
	private String stocksAssetId;
	private String investmentPropertyAssetId;
	private String termDepositAssetId;

	public String populate() {

		// Populate form here
		System.out.println("Inside populate");

		FinancialPositionManager fpm = new FinancialPositionManager();
		Map session = (Map) ActionContext.getContext().get("session");
		UserDetails ud = (UserDetails) session.get("userobj");

		System.out.println(ud.toString());

		setFirstName(ud.getFirstName());
		setLastName(ud.getLastName());
		setDateOfBirth(ud.getDateOfBirth());
		setGender(ud.getGender());
		setMaritalStatus(ud.getMaritalStatus());
		setDependantName(ud.getDependantName());
		setAddress(ud.getAddress());
		setTelephone(ud.getPhoneNumber());
		setMobile(ud.getMobile());
		setDriverLicense(ud.getDriverLicense());
		setEmployerName(ud.getEmployerName());
		setEmployerType(ud.getEmployerType());

		FinancialPosition fp = fpm.retrieveFinancialPosition(ud);

		for (FinancialItem fitem : fp.getAllFinancialItems()) {

			if (fitem.getSubType() == IFinancialItemSubType.ALCOHOL_EXPENSE) {
				this.setAlcoholExpense(fitem.getValue());
				this.setAlcoholExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setAlcoholExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.ATO_DEBT_LIABILITY) {
				this.setAtoDebtLiability(fitem.getValue());
				this.setAtoDebtLiabilityId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.BANK_ACCOUNT_CASH_ASSET) {
				this.setBankAccountCashAsset(fitem.getValue());
				this.setBankAccountCashAssetId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.BASIC_LIVING_EXPENSE) {
				this.setBasicLivingExpense(fitem.getValue());
				this.setBasicLivingExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setBasicLivingExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.BOAT_ASSET) {
				this.setBoatAsset(fitem.getValue());
				this.setBoatAssetId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.CAR_INSURANCE_EXPENSE) {
				this.setCarInsuranceExpense(fitem.getValue());
				this.setCarInsuranceExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setCarInsuranceExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.CAR_LOAN_EXPENSE) {
				this.setCarLoanExpense(fitem.getValue());
				this.setCarLoanExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setCarLoanExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.CAR_LOAN_LIABILITY) {
				this.setCarLoanLiability(fitem.getValue());
				this.setCarLoanLiabilityId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.CAR_SERVICING_EXPENSE) {
				this.setCarServicingExpense(fitem.getValue());
				this.setCarServicingExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setCarServicingExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.CENTERLINK_PAYMENTS_INCOME) {
				this.setCenterlinkPaymentsIncome(fitem.getValue());
				this.setCenterlinkPaymentsIncomeFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setCenterlinkPaymentsIncomeId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.CINEMA_MOVIE_EXPENSE) {
				this.setCinemaMovieExpense(fitem.getValue());
				this.setCinemaMovieExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setCinemaMovieExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.COMMISSIONS_INCOME) {
				this.setCommissionsIncome(fitem.getValue());
				this.setCommissionsIncomeFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setCommissionsIncomeId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.COUNCIL_RATES_EXPENSE) {
				this.setCouncilRatesExpense(fitem.getValue());
				this.setCouncilRatesExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setCouncilRatesExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.CREDIT_CARD_1_LIABILITY) {
				this.setCreditCardOneLiability(fitem.getValue());
				this.setCreditCardOneLiabilityId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.CREDIT_CARD_2_LIABILITY) {
				this.setCreditCardTwoLiability(fitem.getValue());
				this.setCreditCardTwoLiabilityId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.CREDIT_CARD_3_LIABILITY) {
				this.setCreditCardThreeLiability(fitem.getValue());
				this.setCreditCardThreeLiabilityId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.CREDIT_CARD_EXPENSE) {
				this.setCreditCardExpense(fitem.getValue());
				this.setCreditCardExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setCreditCardExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.DIVIDENTS_INCOME) {
				this.setDividentsIncome(fitem.getValue());
				this.setDividentsIncomeFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setDividentsIncomeId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.ELECTRICITY_EXPENSE) {
				this.setElectricityBillExpense(fitem.getValue());
				this.setElectricityBillExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setElectricityBillExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.FAMILY_DEBT_LIABILITY) {
				this.setFamilyDebtLiability(fitem.getValue());
				this.setFamilyDebtLiabilityId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.FAMILY_GIFTS_EXPENSE) {
				this.setFamilyGiftsExpense(fitem.getValue());
				this.setFamilyGiftsExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setFamilyGiftsExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.FEE_HELP_EXPENSE) {
				this.setFeeHelpExpense(fitem.getValue());
				this.setFeeHelpExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setFeeHelpExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.FUEL_EXPENSE) {
				this.setFuelExpense(fitem.getValue());
				this.setFuelExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setFuelExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.GAMBLING_EXPENSE) {
				this.setGamblingExpense(fitem.getValue());
				this.setGamblingExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setGamblingExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.GAS_EXPENSE) {
				this.setGasBillExpense(fitem.getValue());
				this.setGasBillExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setGasBillExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.GYM_MEMBERSHIP_EXPENSE) {
				this.setGymMembershipExpense(fitem.getValue());
				this.setGymMembershipExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setGymMembershipExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.HEALTH_INSURANCE_EXPENSE) {
				this.setHealthInsuranceExpense(fitem.getValue());
				this.setHealthInsuranceExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setHealthInsuranceExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.HOME_INSURANCE_EXPENSE) {
				this.setHomeInsuranceExpense(fitem.getValue());
				this.setHomeInsuranceExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setHomeInsuranceExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.HOUSE_MORTGAGE_LIABILITY) {
				this.setHouseMortgageLiability(fitem.getValue());
				this.setHouseMortgageLiabilityId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.HOUSE_PROPERTY_ASSET) {
				this.setHousePropertyAsset(fitem.getValue());
				this.setHousePropertyAssetId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.HOUSEHOLD_FURNITURE_ASSET) {
				this.setHouseHoldFurnitureAsset(fitem.getValue());
				this.setHouseHoldFurnitureAssetId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.INTERNET_BILL_EXPENSE) {
				this.setInternetBillExpense(fitem.getValue());
				this.setInternetBillExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setInternetBillExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.INVESTMENT_PROPERTY_ASSET) {
				this.setInvestmentPropertyAsset(fitem.getValue());
				this.setInvestmentPropertyAssetId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.INVESTMENT_PROPERTY_LIABILITY) {
				this.setInvestmentPropertyLiability(fitem.getValue());
				this.setInvestmentPropertyLiabilityId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.JEWELLERY_ASSET) {
				this.setJewelleryAsset(fitem.getValue());
				this.setJewelleryAssetId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.MOBILE_BILL_EXPENSE) {
				this.setMobileBillExpense(fitem.getValue());
				this.setMobileBillExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setMobileBillExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.MORTGAGE_EXPENSE) {
				this.setMortgageExpense(fitem.getValue());
				this.setMortgageExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setMortgageExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.ONLINE_STORE_ACCOUNTS_LIABILITY) {
				this.setOnlineStoreAccountsLiability(fitem.getValue());
				this.setOnlineStoreAccountsLiabilityId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.OTHER_DEBT_EXPENSE) {
				this.setOtherDebtExpense(fitem.getValue());
				this.setOtherDebtExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setOtherDebtExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.OTHER_INCOME) {
				this.setOtherIncome(fitem.getValue());
				this.setOtherIncomeFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setOtherIncomeId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.OTHER_LIABILITY) {
				this.setOtherLiability(fitem.getValue());
				this.setOtherLiabilityId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.PARTNER_SALARY_INCOME) {
				this.setPartnerSalaryIncome(fitem.getValue());
				this.setPartnerSalaryIncomeFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setPartnerSalaryIncomeId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.PAY_TV_EXPENSE) {
				this.setPayTvBillExpense(fitem.getValue());
				this.setPayTvBillExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setPayTvBillExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.PAYDAY_LOAN_EXPENSE) {
				this.setPayDayLoanExpense(fitem.getValue());
				this.setPayDayLoanExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setPayDayLoanExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.PERSONAL_LOAN_EXPENSE) {
				this.setPersonalLoanExpense(fitem.getValue());
				this.setPersonalLoanExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setPersonalLoanExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.PERSONAL_LOAN_LIABILITY) {
				this.setPersonalLoanLiability(fitem.getValue());
				this.setPersonalLoanLiabilityId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.PET_EXPENSE) {
				this.setPetExpense(fitem.getValue());
				this.setPetExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setPetExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.REGO_EXPENSE) {
				this.setRegoExpense(fitem.getValue());
				this.setRegoExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setRegoExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.RENT_EXPENSE) {
				this.setRentExpense(fitem.getValue());
				this.setRentExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setRentExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.RENTAL_INCOME) {
				this.setRentalIncome(fitem.getValue());
				this.setRentalIncomeFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setRentalIncomeId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.RESTURANT_EXPENSE) {
				this.setResturantBillExpense(fitem.getValue());
				this.setResturantBillExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setResturantBillExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.ROYALTIES_INCOME) {
				this.setRoyaltiesIncome(fitem.getValue());
				this.setRoyaltyIncomeFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setRoyaltiesIncomeId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.SALARY_INCOME) {
				this.setSalaryIncome(fitem.getValue());
				this.setSalaryIncomeFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setSalaryIncomeId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.SAVINGS_INCOME) {
				this.setSavingsIncome(fitem.getValue());
				this.setSavingsIncomeFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setSavingsIncomeId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.SMOKING_BILL_EXPENSE) {
				this.setSmokingBillExpense(fitem.getValue());
				this.setSmokingExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setSmokingBillExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.STOCKS_ASSET) {
				this.setStocksAsset(fitem.getValue());
				this.setStocksAssetId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.STORE_ACCOUNTS_LIABILITY) {
				this.setStoreAccountsLiability(fitem.getValue());
				this.setStoreAccountsLiabilityId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.STRATA_EXPENSE) {
				this.setStrataBillExpense(fitem.getValue());
				this.setStrataExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setStrataBillExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.STUDY_EXPENSE) {
				this.setStudyExpense(fitem.getValue());
				this.setStudyExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setStudyExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.STUDY_LOAN_LIABILITY) {
				this.setStudyLoanLiability(fitem.getValue());
				this.setStudyLoanLiabilityId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.SUPERANNUATION_ASSET) {
				this.setSuperAnnuationAsset(fitem.getValue());
				this.setSuperAnnuationAssetId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.TELEPHONE_BILL_EXPENSE) {
				this.setTelephoneBillExpense(fitem.getValue());
				this.setTelephoneBillExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setTelephoneBillExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.TERM_DEPOSIT_ASSET) {
				this.setTermDepositAsset(fitem.getValue());
				this.setTermDepositAssetId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.TRAIN_FARE_EXPENSE) {
				this.setTrainFareExpense(fitem.getValue());
				this.setTrainFareExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setTrainFareExpenseId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.VEHICLE_ASSET) {
				this.setVehicleAsset(fitem.getValue());
				this.setVehicleAssetId(fitem.getId());
			} else if (fitem.getSubType() == IFinancialItemSubType.WATER_EXPENSE) {
				this.setWaterBillExpense(fitem.getValue());
				this.setWaterBillExpenseFrequency(fitem.getPaymentSchedule().getPeriod());
				this.setWaterBillExpenseId(fitem.getId());
			}

		}

		System.out.println("getCarInsuranceExpenseFrequency() : " + getCarInsuranceExpenseFrequency());

		return "populate";
	}

	public String execute() {

		System.out.println("Execute ");

		/*
		 * @todo add a class AssessHardshipManager and create its instance here
		 * and use it.
		 */

		// HardshipAssessmentVO havo = new AssessHardshipAction();

		DataValidationUtils valUtils = new DataValidationUtils();
		FinancialPosition fp = new FinancialPosition();

		Map session = (Map) ActionContext.getContext().get("session");
		UserDetails ud = (UserDetails) session.get("userobj");

		// 1 - Prepare data for PersonalDetails
		ud.setFirstName(getFirstName());
		ud.setLastName(getLastName());
		ud.setDateOfBirth(getDateOfBirth());
		ud.setDriverLicense(getDriverLicense());
		ud.setAddress(getAddress());
		ud.setGender(getGender());
		ud.setPhoneNumber(getTelephone());
		ud.setMobile(getMobile());
		ud.setEmployerName(getEmployerName());
		ud.setEmployerType(getEmployerType());
		ud.setDependantName(getDependantName());
		ud.setMaritalStatus(getMaritalStatus());

		session.put("userobj", ud);

		// 2 - Update personal details in database
		UserRegistrationManager urm = new UserRegistrationManager();
		urm.updateUserDetails(ud);

		// 3 - Prepare data for Incomes, expenses, assets and liabilities
		if (valUtils.isValidAmount(getSalaryIncome())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.INCOME);
			fitem.setSubType(IFinancialItemSubType.SALARY_INCOME);
			fitem.setValue(getSalaryIncome());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getSalaryIncomeFrequency()));
			fitem.setId(getSalaryIncomeId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getPartnerSalaryIncome())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.INCOME);
			fitem.setSubType(IFinancialItemSubType.PARTNER_SALARY_INCOME);
			fitem.setValue(getPartnerSalaryIncome());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getPartnerSalaryIncomeFrequency()));
			fitem.setId(getPartnerSalaryIncomeId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getSavingsIncome())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.INCOME);
			fitem.setSubType(IFinancialItemSubType.SAVINGS_INCOME);
			fitem.setValue(getSavingsIncome());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getSavingsIncomeFrequency()));
			fitem.setId(getSavingsIncomeId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getDividentsIncome())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.INCOME);
			fitem.setSubType(IFinancialItemSubType.DIVIDENTS_INCOME);
			fitem.setValue(getDividentsIncome());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getDividentsIncomeFrequency()));
			fitem.setId(getDividentsIncomeId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getCommissionsIncome())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.INCOME);
			fitem.setSubType(IFinancialItemSubType.COMMISSIONS_INCOME);
			fitem.setValue(getCommissionsIncome());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getCommissionsIncomeFrequency()));
			fitem.setId(getCommissionsIncomeId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getCenterlinkPaymentsIncome())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.INCOME);
			fitem.setSubType(IFinancialItemSubType.CENTERLINK_PAYMENTS_INCOME);
			fitem.setValue(getCenterlinkPaymentsIncome());
			fitem.setPaymentSchedule(
					new PaymentSchedule(IPaymentFrequency.DEFAULT, getCenterlinkPaymentsIncomeFrequency()));
			fitem.setId(getCenterlinkPaymentsIncomeId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getRentalIncome())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.INCOME);
			fitem.setSubType(IFinancialItemSubType.RENTAL_INCOME);
			fitem.setValue(getRentalIncome());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getRentalIncomeFrequency()));
			fitem.setId(getRentalIncomeId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getOtherIncome())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.INCOME);
			fitem.setSubType(IFinancialItemSubType.OTHER_INCOME);
			fitem.setValue(getOtherIncome());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getOtherIncomeFrequency()));
			fitem.setId(getOtherIncomeId());
			fp.addFinancialItem(fitem);
		}

		// Expenses
		if (valUtils.isValidAmount(getMortgageExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.MORTGAGE_EXPENSE);
			fitem.setValue(getMortgageExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getMortgageExpenseFrequency()));
			fitem.setId(getMortgageExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getCarLoanExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.CAR_LOAN_EXPENSE);
			fitem.setValue(getCarLoanExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getCarLoanExpenseFrequency()));
			fitem.setId(getCarLoanExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getPersonalLoanExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.PERSONAL_LOAN_EXPENSE);
			fitem.setValue(getPersonalLoanExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getPersonalLoanExpenseFrequency()));
			fitem.setId(getPersonalLoanExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getPayDayLoanExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.PAYDAY_LOAN_EXPENSE);
			fitem.setValue(getPayDayLoanExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getPayDayLoanExpenseFrequency()));
			fitem.setId(getPayDayLoanExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getCreditCardExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.CREDIT_CARD_EXPENSE);
			fitem.setValue(getCreditCardExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getCreditCardExpenseFrequency()));
			fitem.setId(getCreditCardExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getFeeHelpExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.FEE_HELP_EXPENSE);
			fitem.setValue(getFeeHelpExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getFeeHelpExpenseFrequency()));
			fitem.setId(getFeeHelpExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getOtherDebtExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.OTHER_DEBT_EXPENSE);
			fitem.setValue(getOtherDebtExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getOtherDebtExpenseFrequency()));
			fitem.setId(getOtherDebtExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getRentExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.RENT_EXPENSE);
			fitem.setValue(getRentExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getRentalExpenseFrequency()));
			fitem.setId(getRentExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getBasicLivingExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.BASIC_LIVING_EXPENSE);
			fitem.setValue(getBasicLivingExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getBasicLivingExpenseFrequency()));
			fitem.setId(getBasicLivingExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getTelephoneBillExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.TELEPHONE_BILL_EXPENSE);
			fitem.setValue(getTelephoneBillExpense());
			fitem.setPaymentSchedule(
					new PaymentSchedule(IPaymentFrequency.DEFAULT, getTelephoneBillExpenseFrequency()));
			fitem.setId(getTelephoneBillExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getMobileBillExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.MOBILE_BILL_EXPENSE);
			fitem.setValue(getMobileBillExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getMobileBillExpenseFrequency()));
			fitem.setId(getMobileBillExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getInternetBillExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.INTERNET_BILL_EXPENSE);
			fitem.setValue(getInternetBillExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getInternetBillExpenseFrequency()));
			fitem.setId(getInternetBillExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getPayTvBillExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.PAY_TV_EXPENSE);
			fitem.setValue(getPayTvBillExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getPayTvBillExpenseFrequency()));
			fitem.setId(getPayTvBillExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getElectricityBillExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.ELECTRICITY_EXPENSE);
			fitem.setValue(getElectricityBillExpense());
			fitem.setPaymentSchedule(
					new PaymentSchedule(IPaymentFrequency.DEFAULT, getElectricityBillExpenseFrequency()));
			fitem.setId(getElectricityBillExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getGasBillExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.GAS_EXPENSE);
			fitem.setValue(getGasBillExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getGasBillExpenseFrequency()));
			fitem.setId(getGasBillExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getWaterBillExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.WATER_EXPENSE);
			fitem.setValue(getWaterBillExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getWaterBillExpenseFrequency()));
			fitem.setId(getWaterBillExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getStrataBillExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.STRATA_EXPENSE);
			fitem.setValue(getStrataBillExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getStrataExpenseFrequency()));
			fitem.setId(getStrataBillExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getCouncilRatesExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.COUNCIL_RATES_EXPENSE);
			fitem.setValue(getCouncilRatesExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getCouncilRatesExpenseFrequency()));
			fitem.setId(getCouncilRatesExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getTrainFareExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.TRAIN_FARE_EXPENSE);
			fitem.setValue(getTrainFareExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getTrainFareExpenseFrequency()));
			fitem.setId(getTrainFareExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getFuelExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.FUEL_EXPENSE);
			fitem.setValue(getFuelExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getFuelExpenseFrequency()));
			fitem.setId(getFuelExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getCarServicingExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.CAR_SERVICING_EXPENSE);
			fitem.setValue(getCarServicingExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getCarServicingExpenseFrequency()));
			fitem.setId(getCarServicingExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getRegoExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.REGO_EXPENSE);
			fitem.setValue(getRegoExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getRegoExpenseFrequency()));
			fitem.setId(getRegoExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getCarInsuranceExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.CAR_INSURANCE_EXPENSE);
			fitem.setValue(getCarInsuranceExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getCarInsuranceExpenseFrequency()));
			fitem.setId(getCarInsuranceExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getHomeInsuranceExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.HOME_INSURANCE_EXPENSE);
			fitem.setValue(getHomeInsuranceExpense());
			fitem.setPaymentSchedule(
					new PaymentSchedule(IPaymentFrequency.DEFAULT, getHomeInsuranceExpenseFrequency()));
			fitem.setId(getHomeInsuranceExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getHealthInsuranceExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.HEALTH_INSURANCE_EXPENSE);
			fitem.setValue(getHealthInsuranceExpense());
			fitem.setPaymentSchedule(
					new PaymentSchedule(IPaymentFrequency.DEFAULT, getHealthInsuranceExpenseFrequency()));
			fitem.setId(getHealthInsuranceExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getGymMembershipExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.GYM_MEMBERSHIP_EXPENSE);
			fitem.setValue(getGymMembershipExpense());
			fitem.setPaymentSchedule(
					new PaymentSchedule(IPaymentFrequency.DEFAULT, getGymMembershipExpenseFrequency()));
			fitem.setId(getGymMembershipExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getPetExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.PET_EXPENSE);
			fitem.setValue(getPetExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getPetExpenseFrequency()));
			fitem.setId(getPetExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getResturantBillExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.RESTURANT_EXPENSE);
			fitem.setValue(getResturantBillExpense());
			fitem.setPaymentSchedule(
					new PaymentSchedule(IPaymentFrequency.DEFAULT, getResturantBillExpenseFrequency()));
			fitem.setId(getResturantBillExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getCinemaMovieExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.CINEMA_MOVIE_EXPENSE);
			fitem.setValue(getCinemaMovieExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getCinemaExpenseFrequency()));
			fitem.setId(getCinemaMovieExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getSmokingBillExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.SMOKING_BILL_EXPENSE);
			fitem.setValue(getSmokingBillExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getSmokingExpenseFrequency()));
			fitem.setId(getSmokingBillExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getAlcoholExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.ALCOHOL_EXPENSE);
			fitem.setValue(getAlcoholExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getAlcoholExpenseFrequency()));
			fitem.setId(getAlcoholExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getGamblingExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.GAMBLING_EXPENSE);
			fitem.setValue(getGamblingExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getGasBillExpenseFrequency()));
			fitem.setId(getGamblingExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getFamilyGiftsExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.FAMILY_GIFTS_EXPENSE);
			fitem.setValue(getFamilyGiftsExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getFamilyGiftsExpenseFrequency()));
			fitem.setId(getFamilyGiftsExpenseId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getStudyExpense())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.EXPENSE);
			fitem.setSubType(IFinancialItemSubType.STUDY_EXPENSE);
			fitem.setValue(getStudyExpense());
			fitem.setPaymentSchedule(new PaymentSchedule(IPaymentFrequency.DEFAULT, getStudyExpenseFrequency()));
			fitem.setId(getStudyExpenseId());
			fp.addFinancialItem(fitem);
		}

		// Assets
		if (valUtils.isValidAmount(getHousePropertyAsset())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.ASSET);
			fitem.setSubType(IFinancialItemSubType.HOUSE_PROPERTY_ASSET);
			fitem.setValue(getHousePropertyAsset());
			fitem.setId(getHousePropertyAssetId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getHouseHoldFurnitureAsset())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.ASSET);
			fitem.setSubType(IFinancialItemSubType.HOUSEHOLD_FURNITURE_ASSET);
			fitem.setValue(getHouseHoldFurnitureAsset());
			fitem.setId(getHouseHoldFurnitureAssetId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getVehicleAsset())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.ASSET);
			fitem.setSubType(IFinancialItemSubType.VEHICLE_ASSET);
			fitem.setValue(getVehicleAsset());
			fitem.setId(getVehicleAssetId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getBankAccountCashAsset())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.ASSET);
			fitem.setSubType(IFinancialItemSubType.BANK_ACCOUNT_CASH_ASSET);
			fitem.setValue(getBankAccountCashAsset());
			fitem.setId(getBankAccountCashAssetId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getBoatAsset())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.ASSET);
			fitem.setSubType(IFinancialItemSubType.BOAT_ASSET);
			fitem.setValue(getBoatAsset());
			fitem.setId(getBoatAssetId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getJewelleryAsset())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.ASSET);
			fitem.setSubType(IFinancialItemSubType.JEWELLERY_ASSET);
			fitem.setValue(getJewelleryAsset());
			fitem.setId(getJewelleryAssetId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getSuperAnnuationAsset())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.ASSET);
			fitem.setSubType(IFinancialItemSubType.SUPERANNUATION_ASSET);
			fitem.setValue(getSuperAnnuationAsset());
			fitem.setId(getSuperAnnuationAssetId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getStocksAsset())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.ASSET);
			fitem.setSubType(IFinancialItemSubType.STOCKS_ASSET);
			fitem.setValue(getStocksAsset());
			fitem.setId(getStocksAssetId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getInvestmentPropertyAsset())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.ASSET);
			fitem.setSubType(IFinancialItemSubType.INVESTMENT_PROPERTY_ASSET);
			fitem.setValue(getInvestmentPropertyAsset());
			fitem.setId(getInvestmentPropertyAssetId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getTermDepositAsset())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.ASSET);
			fitem.setSubType(IFinancialItemSubType.TERM_DEPOSIT_ASSET);
			fitem.setValue(getTermDepositAsset());
			fitem.setId(getTermDepositAssetId());
			fp.addFinancialItem(fitem);
		}

		// Liabilities
		if (valUtils.isValidAmount(getHouseMortgageLiability())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.LIABILITY);
			fitem.setSubType(IFinancialItemSubType.HOUSE_MORTGAGE_LIABILITY);
			fitem.setValue(getHouseMortgageLiability());
			fitem.setId(getHouseMortgageLiabilityId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getCarLoanLiability())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.LIABILITY);
			fitem.setSubType(IFinancialItemSubType.CAR_LOAN_LIABILITY);
			fitem.setValue(getCarLoanLiability());
			fitem.setId(getCarLoanLiabilityId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getPersonalLoanLiability())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.LIABILITY);
			fitem.setSubType(IFinancialItemSubType.PERSONAL_LOAN_LIABILITY);
			fitem.setValue(getPersonalLoanLiability());
			fitem.setId(getPersonalLoanLiabilityId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getStoreAccountsLiability())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.LIABILITY);
			fitem.setSubType(IFinancialItemSubType.STORE_ACCOUNTS_LIABILITY);
			fitem.setValue(getStoreAccountsLiability());
			fitem.setId(getStoreAccountsLiabilityId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getOnlineStoreAccountsLiability())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.LIABILITY);
			fitem.setSubType(IFinancialItemSubType.ONLINE_STORE_ACCOUNTS_LIABILITY);
			fitem.setValue(getOnlineStoreAccountsLiability());
			fitem.setId(getOnlineStoreAccountsLiabilityId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getCreditCardOneLiability())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.LIABILITY);
			fitem.setSubType(IFinancialItemSubType.CREDIT_CARD_1_LIABILITY);
			fitem.setValue(getCreditCardOneLiability());
			fitem.setId(getCreditCardOneLiabilityId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getCreditCardTwoLiability())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.LIABILITY);
			fitem.setSubType(IFinancialItemSubType.CREDIT_CARD_2_LIABILITY);
			fitem.setValue(getCreditCardTwoLiability());
			fitem.setId(getCreditCardTwoLiabilityId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getCreditCardThreeLiability())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.LIABILITY);
			fitem.setSubType(IFinancialItemSubType.CREDIT_CARD_3_LIABILITY);
			fitem.setValue(getCreditCardThreeLiability());
			fitem.setId(getCreditCardThreeLiabilityId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getOtherLiability())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.LIABILITY);
			fitem.setSubType(IFinancialItemSubType.OTHER_LIABILITY);
			fitem.setValue(getOtherLiability());
			fitem.setId(getOtherLiabilityId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getStudyLoanLiability())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.LIABILITY);
			fitem.setSubType(IFinancialItemSubType.STUDY_LOAN_LIABILITY);
			fitem.setValue(getStudyLoanLiability());
			fitem.setId(getStudyLoanLiabilityId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getAtoDebtLiability())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.LIABILITY);
			fitem.setSubType(IFinancialItemSubType.ATO_DEBT_LIABILITY);
			fitem.setValue(getAtoDebtLiability());
			fitem.setId(getAtoDebtLiabilityId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getFamilyDebtLiability())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.LIABILITY);
			fitem.setSubType(IFinancialItemSubType.FAMILY_DEBT_LIABILITY);
			fitem.setValue(getFamilyDebtLiability());
			fitem.setId(getFamilyDebtLiabilityId());
			fp.addFinancialItem(fitem);
		}
		if (valUtils.isValidAmount(getInvestmentPropertyLiability())) {
			FinancialItem fitem = new FinancialItem();
			fitem.setType(IFinancialItemType.LIABILITY);
			fitem.setSubType(IFinancialItemSubType.INVESTMENT_PROPERTY_LIABILITY);
			fitem.setValue(getInvestmentPropertyLiability());
			fitem.setId(getInvestmentPropertyLiabilityId());
			fp.addFinancialItem(fitem);
		}

		// 4 - Save financial position in database first
		FinancialPositionManager fpm = new FinancialPositionManager();
		fpm.updateFinancialPosition(fp, ud);

		// 5- Now do assessment
		HardshipAssessmentManager hassessManager = new HardshipAssessmentManager();
		Assessment assessment = hassessManager.assess(fp);
		if (assessment.getOutcome() == IOutcome.ASSESSMENT_SUCCESSFUL) {
			// Map successful response
			return IActionConstants.ASSESSMENT_SUCCESS;
		} else if (assessment.getOutcome() == IOutcome.ASSESSMENT_FAILED) {
			// Map failure response
			return IActionConstants.ASSESSMENT_FAILED;
		} else if (assessment.getOutcome() == IOutcome.ASSESSMENT_WITHHELD) {
			// Map withheld response
			return IActionConstants.ASSESSMENT_WITHHELD;
		} else if (assessment.getOutcome() == IOutcome.REFERRED_FOR_MANUAL_DECISION) {
			// Map referred response
			return IActionConstants.ASSESSMENT_MANUAL_REFERRED;
		}

		return IActionConstants.ASSESSMENT_ERROR;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getDependantName() {
		return dependantName;
	}

	public void setDependantName(String dependantName) {
		this.dependantName = dependantName;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getEmployerType() {
		return employerType;
	}

	public void setEmployerType(String employerType) {
		this.employerType = employerType;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getPartnerSalaryIncome() {
		return partnerSalaryIncome;
	}

	public void setPartnerSalaryIncome(double partnerSalaryIncome) {
		this.partnerSalaryIncome = partnerSalaryIncome;
	}

	public double getSavingsIncome() {
		return savingsIncome;
	}

	public void setSavingsIncome(double savingsIncome) {
		this.savingsIncome = savingsIncome;
	}

	public double getDividentsIncome() {
		return dividentsIncome;
	}

	public void setDividentsIncome(double dividentsIncome) {
		this.dividentsIncome = dividentsIncome;
	}

	public double getCommissionsIncome() {
		return commissionsIncome;
	}

	public void setCommissionsIncome(double commissionsIncome) {
		this.commissionsIncome = commissionsIncome;
	}

	public double getRoyaltiesIncome() {
		return royaltiesIncome;
	}

	public void setRoyaltiesIncome(double royaltiesIncome) {
		this.royaltiesIncome = royaltiesIncome;
	}

	public double getCenterlinkPaymentsIncome() {
		return centerlinkPaymentsIncome;
	}

	public void setCenterlinkPaymentsIncome(double centerlinkPaymentsIncome) {
		this.centerlinkPaymentsIncome = centerlinkPaymentsIncome;
	}

	public double getRentalIncome() {
		return rentalIncome;
	}

	public void setRentalIncome(double rentalIncome) {
		this.rentalIncome = rentalIncome;
	}

	public double getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(double otherIncome) {
		this.otherIncome = otherIncome;
	}

	public double getMortgageExpense() {
		return mortgageExpense;
	}

	public void setMortgageExpense(double mortgageExpense) {
		this.mortgageExpense = mortgageExpense;
	}

	public double getCarLoanExpense() {
		return carLoanExpense;
	}

	public void setCarLoanExpense(double carLoanExpense) {
		this.carLoanExpense = carLoanExpense;
	}

	public double getPersonalLoanExpense() {
		return personalLoanExpense;
	}

	public void setPersonalLoanExpense(double personalLoanExpense) {
		this.personalLoanExpense = personalLoanExpense;
	}

	public double getCreditCardExpense() {
		return creditCardExpense;
	}

	public void setCreditCardExpense(double creditCardExpense) {
		this.creditCardExpense = creditCardExpense;
	}

	public double getFeeHelpExpense() {
		return feeHelpExpense;
	}

	public void setFeeHelpExpense(double feeHelpExpense) {
		this.feeHelpExpense = feeHelpExpense;
	}

	public double getOtherDebtExpense() {
		return otherDebtExpense;
	}

	public void setOtherDebtExpense(double otherDebtExpense) {
		this.otherDebtExpense = otherDebtExpense;
	}

	public double getRentExpense() {
		return rentExpense;
	}

	public void setRentExpense(double rentExpense) {
		this.rentExpense = rentExpense;
	}

	public double getBasicLivingExpense() {
		return basicLivingExpense;
	}

	public void setBasicLivingExpense(double basicLivingExpense) {
		this.basicLivingExpense = basicLivingExpense;
	}

	public double getTelephoneBillExpense() {
		return telephoneBillExpense;
	}

	public void setTelephoneBillExpense(double telephoneBillExpense) {
		this.telephoneBillExpense = telephoneBillExpense;
	}

	public double getMobileBillExpense() {
		return mobileBillExpense;
	}

	public void setMobileBillExpense(double mobileBillExpense) {
		this.mobileBillExpense = mobileBillExpense;
	}

	public double getInternetBillExpense() {
		return internetBillExpense;
	}

	public void setInternetBillExpense(double internetBillExpense) {
		this.internetBillExpense = internetBillExpense;
	}

	public double getPayTvBillExpense() {
		return payTvBillExpense;
	}

	public void setPayTvBillExpense(double payTvBillExpense) {
		this.payTvBillExpense = payTvBillExpense;
	}

	public double getElectricityBillExpense() {
		return electricityBillExpense;
	}

	public void setElectricityBillExpense(double electricityBillExpense) {
		this.electricityBillExpense = electricityBillExpense;
	}

	public double getGasBillExpense() {
		return gasBillExpense;
	}

	public void setGasBillExpense(double gasBillExpense) {
		this.gasBillExpense = gasBillExpense;
	}

	public double getWaterBillExpense() {
		return waterBillExpense;
	}

	public void setWaterBillExpense(double waterBillExpense) {
		this.waterBillExpense = waterBillExpense;
	}

	public double getStrataBillExpense() {
		return strataBillExpense;
	}

	public void setStrataBillExpense(double strataBillExpense) {
		this.strataBillExpense = strataBillExpense;
	}

	public double getCouncilRatesExpense() {
		return councilRatesExpense;
	}

	public void setCouncilRatesExpense(double councilRatesExpense) {
		this.councilRatesExpense = councilRatesExpense;
	}

	public double getTrainFareExpense() {
		return trainFareExpense;
	}

	public void setTrainFareExpense(double trainFareExpense) {
		this.trainFareExpense = trainFareExpense;
	}

	public double getFuelExpense() {
		return fuelExpense;
	}

	public void setFuelExpense(double fuelExpense) {
		this.fuelExpense = fuelExpense;
	}

	public double getCarServicingExpense() {
		return carServicingExpense;
	}

	public void setCarServicingExpense(double carServicingExpense) {
		this.carServicingExpense = carServicingExpense;
	}

	public double getRegoExpense() {
		return regoExpense;
	}

	public void setRegoExpense(double regoExpense) {
		this.regoExpense = regoExpense;
	}

	public double getCarInsuranceExpense() {
		return carInsuranceExpense;
	}

	public void setCarInsuranceExpense(double carInsuranceExpense) {
		this.carInsuranceExpense = carInsuranceExpense;
	}

	public double getHomeInsuranceExpense() {
		return homeInsuranceExpense;
	}

	public void setHomeInsuranceExpense(double homeInsuranceExpense) {
		this.homeInsuranceExpense = homeInsuranceExpense;
	}

	public double getHealthInsuranceExpense() {
		return healthInsuranceExpense;
	}

	public void setHealthInsuranceExpense(double healthInsuranceExpense) {
		this.healthInsuranceExpense = healthInsuranceExpense;
	}

	public double getGymMembershipExpense() {
		return gymMembershipExpense;
	}

	public void setGymMembershipExpense(double gymMembershipExpense) {
		this.gymMembershipExpense = gymMembershipExpense;
	}

	public double getPetExpense() {
		return petExpense;
	}

	public void setPetExpense(double petExpense) {
		this.petExpense = petExpense;
	}

	public double getResturantBillExpense() {
		return resturantBillExpense;
	}

	public void setResturantBillExpense(double resturantBillExpense) {
		this.resturantBillExpense = resturantBillExpense;
	}

	public double getCinemaMovieExpense() {
		return cinemaMovieExpense;
	}

	public void setCinemaMovieExpense(double cinemaMovieExpense) {
		this.cinemaMovieExpense = cinemaMovieExpense;
	}

	public double getSmokingBillExpense() {
		return smokingBillExpense;
	}

	public void setSmokingBillExpense(double smokingBillExpense) {
		this.smokingBillExpense = smokingBillExpense;
	}

	public double getAlcoholExpense() {
		return alcoholExpense;
	}

	public void setAlcoholExpense(double alcoholExpense) {
		this.alcoholExpense = alcoholExpense;
	}

	public double getGamblingExpense() {
		return gamblingExpense;
	}

	public void setGamblingExpense(double gamblingExpense) {
		this.gamblingExpense = gamblingExpense;
	}

	public double getFamilyGiftsExpense() {
		return familyGiftsExpense;
	}

	public void setFamilyGiftsExpense(double familyGiftsExpense) {
		this.familyGiftsExpense = familyGiftsExpense;
	}

	public double getStudyExpense() {
		return studyExpense;
	}

	public void setStudyExpense(double studyExpense) {
		this.studyExpense = studyExpense;
	}

	public double getHouseMortgageLiability() {
		return houseMortgageLiability;
	}

	public void setHouseMortgageLiability(double houseMortgageLiability) {
		this.houseMortgageLiability = houseMortgageLiability;
	}

	public double getCarLoanLiability() {
		return carLoanLiability;
	}

	public void setCarLoanLiability(double carLoanLiability) {
		this.carLoanLiability = carLoanLiability;
	}

	public double getPersonalLoanLiability() {
		return personalLoanLiability;
	}

	public void setPersonalLoanLiability(double personalLoanLiability) {
		this.personalLoanLiability = personalLoanLiability;
	}

	public double getStoreAccountsLiability() {
		return storeAccountsLiability;
	}

	public void setStoreAccountsLiability(double storeAccountsLiability) {
		this.storeAccountsLiability = storeAccountsLiability;
	}

	public double getOnlineStoreAccountsLiability() {
		return onlineStoreAccountsLiability;
	}

	public void setOnlineStoreAccountsLiability(double onlineStoreAccountsLiability) {
		this.onlineStoreAccountsLiability = onlineStoreAccountsLiability;
	}

	public double getCreditCardOneLiability() {
		return creditCardOneLiability;
	}

	public void setCreditCardOneLiability(double creditCardOneLiability) {
		this.creditCardOneLiability = creditCardOneLiability;
	}

	public double getCreditCardTwoLiability() {
		return creditCardTwoLiability;
	}

	public void setCreditCardTwoLiability(double creditCardTwoLiability) {
		this.creditCardTwoLiability = creditCardTwoLiability;
	}

	public double getCreditCardThreeLiability() {
		return creditCardThreeLiability;
	}

	public void setCreditCardThreeLiability(double creditCardThreeLiability) {
		this.creditCardThreeLiability = creditCardThreeLiability;
	}

	public double getOtherLiability() {
		return otherLiability;
	}

	public void setOtherLiability(double otherLiability) {
		this.otherLiability = otherLiability;
	}

	public double getStudyLoanLiability() {
		return studyLoanLiability;
	}

	public void setStudyLoanLiability(double studyLoanLiability) {
		this.studyLoanLiability = studyLoanLiability;
	}

	public double getAtoDebtLiability() {
		return atoDebtLiability;
	}

	public void setAtoDebtLiability(double atoDebtLiability) {
		this.atoDebtLiability = atoDebtLiability;
	}

	public double getFamilyDebtLiability() {
		return familyDebtLiability;
	}

	public void setFamilyDebtLiability(double familyDebtLiability) {
		this.familyDebtLiability = familyDebtLiability;
	}

	public double getInvestmentPropertyLiability() {
		return investmentPropertyLiability;
	}

	public void setInvestmentPropertyLiability(double investmentPropertyLiability) {
		this.investmentPropertyLiability = investmentPropertyLiability;
	}

	public double getHousePropertyAsset() {
		return housePropertyAsset;
	}

	public void setHousePropertyAsset(double housePropertyAsset) {
		this.housePropertyAsset = housePropertyAsset;
	}

	public double getHouseHoldFurnitureAsset() {
		return houseHoldFurnitureAsset;
	}

	public void setHouseHoldFurnitureAsset(double houseHoldFurnitureAsset) {
		this.houseHoldFurnitureAsset = houseHoldFurnitureAsset;
	}

	public double getVehicleAsset() {
		return vehicleAsset;
	}

	public void setVehicleAsset(double vehicleAsset) {
		this.vehicleAsset = vehicleAsset;
	}

	public double getBankAccountCashAsset() {
		return bankAccountCashAsset;
	}

	public void setBankAccountCashAsset(double bankAccountCashAsset) {
		this.bankAccountCashAsset = bankAccountCashAsset;
	}

	public double getBoatAsset() {
		return boatAsset;
	}

	public void setBoatAsset(double boatAsset) {
		this.boatAsset = boatAsset;
	}

	public double getJewelleryAsset() {
		return jewelleryAsset;
	}

	public void setJewelleryAsset(double jewelleryAsset) {
		this.jewelleryAsset = jewelleryAsset;
	}

	public double getSuperAnnuationAsset() {
		return superAnnuationAsset;
	}

	public void setSuperAnnuationAsset(double superAnnuationAsset) {
		this.superAnnuationAsset = superAnnuationAsset;
	}

	public double getStocksAsset() {
		return stocksAsset;
	}

	public void setStocksAsset(double stocksAsset) {
		this.stocksAsset = stocksAsset;
	}

	public double getInvestmentPropertyAsset() {
		return investmentPropertyAsset;
	}

	public void setInvestmentPropertyAsset(double investmentPropertyAsset) {
		this.investmentPropertyAsset = investmentPropertyAsset;
	}

	public double getTermDepositAsset() {
		return termDepositAsset;
	}

	public void setTermDepositAsset(double termDepositAsset) {
		this.termDepositAsset = termDepositAsset;
	}

	public String getSalaryIncomeFrequency() {
		return salaryIncomeFrequency;
	}

	public void setSalaryIncomeFrequency(String salaryIncomeFrequency) {
		this.salaryIncomeFrequency = salaryIncomeFrequency;
	}

	public String getPartnerSalaryIncomeFrequency() {
		return partnerSalaryIncomeFrequency;
	}

	public void setPartnerSalaryIncomeFrequency(String partnerSalaryIncomeFrequency) {
		this.partnerSalaryIncomeFrequency = partnerSalaryIncomeFrequency;
	}

	public String getSavingsIncomeFrequency() {
		return savingsIncomeFrequency;
	}

	public void setSavingsIncomeFrequency(String savingsIncomeFrequency) {
		this.savingsIncomeFrequency = savingsIncomeFrequency;
	}

	public String getDividentsIncomeFrequency() {
		return dividentsIncomeFrequency;
	}

	public void setDividentsIncomeFrequency(String dividentsIncomeFrequency) {
		this.dividentsIncomeFrequency = dividentsIncomeFrequency;
	}

	public String getRoyaltyIncomeFrequency() {
		return royaltyIncomeFrequency;
	}

	public void setRoyaltyIncomeFrequency(String royaltyIncomeFrequency) {
		this.royaltyIncomeFrequency = royaltyIncomeFrequency;
	}

	public String getCenterlinkPaymentsIncomeFrequency() {
		return centerlinkPaymentsIncomeFrequency;
	}

	public void setCenterlinkPaymentsIncomeFrequency(String centerlinkPaymentsIncomeFrequency) {
		this.centerlinkPaymentsIncomeFrequency = centerlinkPaymentsIncomeFrequency;
	}

	public String getRentalIncomeFrequency() {
		return rentalIncomeFrequency;
	}

	public void setRentalIncomeFrequency(String rentalIncomeFrequency) {
		this.rentalIncomeFrequency = rentalIncomeFrequency;
	}

	public String getOtherIncomeFrequency() {
		return otherIncomeFrequency;
	}

	public void setOtherIncomeFrequency(String otherIncomeFrequency) {
		this.otherIncomeFrequency = otherIncomeFrequency;
	}

	public String getMortgageExpenseFrequency() {
		return mortgageExpenseFrequency;
	}

	public void setMortgageExpenseFrequency(String mortgageExpenseFrequency) {
		this.mortgageExpenseFrequency = mortgageExpenseFrequency;
	}

	public String getCarLoanExpenseFrequency() {
		return carLoanExpenseFrequency;
	}

	public void setCarLoanExpenseFrequency(String carLoanExpenseFrequency) {
		this.carLoanExpenseFrequency = carLoanExpenseFrequency;
	}

	public String getPersonalLoanExpenseFrequency() {
		return personalLoanExpenseFrequency;
	}

	public void setPersonalLoanExpenseFrequency(String personalLoanExpenseFrequency) {
		this.personalLoanExpenseFrequency = personalLoanExpenseFrequency;
	}

	public String getCreditCardExpenseFrequency() {
		return creditCardExpenseFrequency;
	}

	public void setCreditCardExpenseFrequency(String creditCardExpenseFrequency) {
		this.creditCardExpenseFrequency = creditCardExpenseFrequency;
	}

	public String getFeeHelpExpenseFrequency() {
		return feeHelpExpenseFrequency;
	}

	public void setFeeHelpExpenseFrequency(String feeHelpExpenseFrequency) {
		this.feeHelpExpenseFrequency = feeHelpExpenseFrequency;
	}

	public String getOtherDebtExpenseFrequency() {
		return otherDebtExpenseFrequency;
	}

	public void setOtherDebtExpenseFrequency(String otherDebtExpenseFrequency) {
		this.otherDebtExpenseFrequency = otherDebtExpenseFrequency;
	}

	public String getRentalExpenseFrequency() {
		return rentalExpenseFrequency;
	}

	public void setRentalExpenseFrequency(String rentalExpenseFrequency) {
		this.rentalExpenseFrequency = rentalExpenseFrequency;
	}

	public String getBasicLivingExpenseFrequency() {
		return basicLivingExpenseFrequency;
	}

	public void setBasicLivingExpenseFrequency(String basicLivingExpenseFrequency) {
		this.basicLivingExpenseFrequency = basicLivingExpenseFrequency;
	}

	public String getTelephoneBillExpenseFrequency() {
		return telephoneBillExpenseFrequency;
	}

	public void setTelephoneBillExpenseFrequency(String telephoneBillExpenseFrequency) {
		this.telephoneBillExpenseFrequency = telephoneBillExpenseFrequency;
	}

	public String getMobileBillExpenseFrequency() {
		return mobileBillExpenseFrequency;
	}

	public void setMobileBillExpenseFrequency(String mobileBillExpenseFrequency) {
		this.mobileBillExpenseFrequency = mobileBillExpenseFrequency;
	}

	public String getInternetBillExpenseFrequency() {
		return internetBillExpenseFrequency;
	}

	public void setInternetBillExpenseFrequency(String internetBillExpenseFrequency) {
		this.internetBillExpenseFrequency = internetBillExpenseFrequency;
	}

	public String getPayTvBillExpenseFrequency() {
		return payTvBillExpenseFrequency;
	}

	public void setPayTvBillExpenseFrequency(String payTvBillExpenseFrequency) {
		this.payTvBillExpenseFrequency = payTvBillExpenseFrequency;
	}

	public String getElectricityBillExpenseFrequency() {
		return electricityBillExpenseFrequency;
	}

	public void setElectricityBillExpenseFrequency(String electricityBillExpenseFrequency) {
		this.electricityBillExpenseFrequency = electricityBillExpenseFrequency;
	}

	public String getGasBillExpenseFrequency() {
		return gasBillExpenseFrequency;
	}

	public void setGasBillExpenseFrequency(String gasBillExpenseFrequency) {
		this.gasBillExpenseFrequency = gasBillExpenseFrequency;
	}

	public String getWaterBillExpenseFrequency() {
		return waterBillExpenseFrequency;
	}

	public void setWaterBillExpenseFrequency(String waterBillExpenseFrequency) {
		this.waterBillExpenseFrequency = waterBillExpenseFrequency;
	}

	public String getStrataExpenseFrequency() {
		return strataExpenseFrequency;
	}

	public void setStrataExpenseFrequency(String strataExpenseFrequency) {
		this.strataExpenseFrequency = strataExpenseFrequency;
	}

	public String getCouncilRatesExpenseFrequency() {
		return councilRatesExpenseFrequency;
	}

	public void setCouncilRatesExpenseFrequency(String councilRatesExpenseFrequency) {
		this.councilRatesExpenseFrequency = councilRatesExpenseFrequency;
	}

	public String getTrainFareExpenseFrequency() {
		return trainFareExpenseFrequency;
	}

	public void setTrainFareExpenseFrequency(String trainFareExpenseFrequency) {
		this.trainFareExpenseFrequency = trainFareExpenseFrequency;
	}

	public String getFuelExpenseFrequency() {
		return fuelExpenseFrequency;
	}

	public void setFuelExpenseFrequency(String fuelExpenseFrequency) {
		this.fuelExpenseFrequency = fuelExpenseFrequency;
	}

	public String getCarServicingExpenseFrequency() {
		return carServicingExpenseFrequency;
	}

	public void setCarServicingExpenseFrequency(String carServicingExpenseFrequency) {
		this.carServicingExpenseFrequency = carServicingExpenseFrequency;
	}

	public String getRegoExpenseFrequency() {
		return regoExpenseFrequency;
	}

	public void setRegoExpenseFrequency(String regoExpenseFrequency) {
		this.regoExpenseFrequency = regoExpenseFrequency;
	}

	public String getCarInsuranceExpenseFrequency() {
		return carInsuranceExpenseFrequency;
	}

	public void setCarInsuranceExpenseFrequency(String carInsuranceExpenseFrequency) {
		this.carInsuranceExpenseFrequency = carInsuranceExpenseFrequency;
	}

	public String getHomeInsuranceExpenseFrequency() {
		return homeInsuranceExpenseFrequency;
	}

	public void setHomeInsuranceExpenseFrequency(String homeInsuranceExpenseFrequency) {
		this.homeInsuranceExpenseFrequency = homeInsuranceExpenseFrequency;
	}

	public String getHealthInsuranceExpenseFrequency() {
		return healthInsuranceExpenseFrequency;
	}

	public void setHealthInsuranceExpenseFrequency(String healthInsuranceExpenseFrequency) {
		this.healthInsuranceExpenseFrequency = healthInsuranceExpenseFrequency;
	}

	public String getGymMembershipExpenseFrequency() {
		return gymMembershipExpenseFrequency;
	}

	public void setGymMembershipExpenseFrequency(String gymMembershipExpenseFrequency) {
		this.gymMembershipExpenseFrequency = gymMembershipExpenseFrequency;
	}

	public String getPetExpenseFrequency() {
		return petExpenseFrequency;
	}

	public void setPetExpenseFrequency(String petExpenseFrequency) {
		this.petExpenseFrequency = petExpenseFrequency;
	}

	public String getResturantBillExpenseFrequency() {
		return resturantBillExpenseFrequency;
	}

	public void setResturantBillExpenseFrequency(String resturantBillExpenseFrequency) {
		this.resturantBillExpenseFrequency = resturantBillExpenseFrequency;
	}

	public String getCinemaExpenseFrequency() {
		return cinemaExpenseFrequency;
	}

	public void setCinemaExpenseFrequency(String cinemaExpenseFrequency) {
		this.cinemaExpenseFrequency = cinemaExpenseFrequency;
	}

	public String getSmokingExpenseFrequency() {
		return smokingExpenseFrequency;
	}

	public void setSmokingExpenseFrequency(String smokingExpenseFrequency) {
		this.smokingExpenseFrequency = smokingExpenseFrequency;
	}

	public String getAlcoholExpenseFrequency() {
		return alcoholExpenseFrequency;
	}

	public void setAlcoholExpenseFrequency(String alcoholExpenseFrequency) {
		this.alcoholExpenseFrequency = alcoholExpenseFrequency;
	}

	public String getGamblingExpenseFrequency() {
		return gamblingExpenseFrequency;
	}

	public void setGamblingExpenseFrequency(String gamblingExpenseFrequency) {
		this.gamblingExpenseFrequency = gamblingExpenseFrequency;
	}

	public String getFamilyGiftsExpenseFrequency() {
		return familyGiftsExpenseFrequency;
	}

	public void setFamilyGiftsExpenseFrequency(String familyGiftsExpenseFrequency) {
		this.familyGiftsExpenseFrequency = familyGiftsExpenseFrequency;
	}

	public String getStudyExpenseFrequency() {
		return studyExpenseFrequency;
	}

	public void setStudyExpenseFrequency(String studyExpenseFrequency) {
		this.studyExpenseFrequency = studyExpenseFrequency;
	}

	public String getCinemaMovieExpenseFrequency() {
		return cinemaMovieExpenseFrequency;
	}

	public void setCinemaMovieExpenseFrequency(String cinemaMovieExpenseFrequency) {
		this.cinemaMovieExpenseFrequency = cinemaMovieExpenseFrequency;
	}

	public String getCommissionsIncomeFrequency() {
		return commissionsIncomeFrequency;
	}

	public void setCommissionsIncomeFrequency(String commissionsIncomeFrequency) {
		this.commissionsIncomeFrequency = commissionsIncomeFrequency;
	}

	public double getPayDayLoanExpense() {
		return payDayLoanExpense;
	}

	public void setPayDayLoanExpense(double payDayLoanExpense) {
		this.payDayLoanExpense = payDayLoanExpense;
	}

	public String getPayDayLoanExpenseFrequency() {
		return payDayLoanExpenseFrequency;
	}

	public void setPayDayLoanExpenseFrequency(String payDayLoanExpenseFrequency) {
		this.payDayLoanExpenseFrequency = payDayLoanExpenseFrequency;
	}

	public String getRentExpenseFrequency() {
		return rentExpenseFrequency;
	}

	public void setRentExpenseFrequency(String rentExpenseFrequency) {
		this.rentExpenseFrequency = rentExpenseFrequency;
	}

	public String getSalaryIncomeId() {
		return salaryIncomeId;
	}

	public void setSalaryIncomeId(String salaryIncomeId) {
		this.salaryIncomeId = salaryIncomeId;
	}

	public String getPartnerSalaryIncomeId() {
		return partnerSalaryIncomeId;
	}

	public void setPartnerSalaryIncomeId(String partnerSalaryIncomeId) {
		this.partnerSalaryIncomeId = partnerSalaryIncomeId;
	}

	public String getSavingsIncomeId() {
		return savingsIncomeId;
	}

	public void setSavingsIncomeId(String savingsIncomeId) {
		this.savingsIncomeId = savingsIncomeId;
	}

	public String getDividentsIncomeId() {
		return dividentsIncomeId;
	}

	public void setDividentsIncomeId(String dividentsIncomeId) {
		this.dividentsIncomeId = dividentsIncomeId;
	}

	public String getCommissionsIncomeId() {
		return commissionsIncomeId;
	}

	public void setCommissionsIncomeId(String commissionsIncomeId) {
		this.commissionsIncomeId = commissionsIncomeId;
	}

	public String getRoyaltiesIncomeId() {
		return royaltiesIncomeId;
	}

	public void setRoyaltiesIncomeId(String royaltiesIncomeId) {
		this.royaltiesIncomeId = royaltiesIncomeId;
	}

	public String getCenterlinkPaymentsIncomeId() {
		return centerlinkPaymentsIncomeId;
	}

	public void setCenterlinkPaymentsIncomeId(String centerlinkPaymentsIncomeId) {
		this.centerlinkPaymentsIncomeId = centerlinkPaymentsIncomeId;
	}

	public String getRentalIncomeId() {
		return rentalIncomeId;
	}

	public void setRentalIncomeId(String rentalIncomeId) {
		this.rentalIncomeId = rentalIncomeId;
	}

	public String getOtherIncomeId() {
		return otherIncomeId;
	}

	public void setOtherIncomeId(String otherIncomeId) {
		this.otherIncomeId = otherIncomeId;
	}

	public String getMortgageExpenseId() {
		return mortgageExpenseId;
	}

	public void setMortgageExpenseId(String mortgageExpenseId) {
		this.mortgageExpenseId = mortgageExpenseId;
	}

	public String getCarLoanExpenseId() {
		return carLoanExpenseId;
	}

	public void setCarLoanExpenseId(String carLoanExpenseId) {
		this.carLoanExpenseId = carLoanExpenseId;
	}

	public String getPersonalLoanExpenseId() {
		return personalLoanExpenseId;
	}

	public void setPersonalLoanExpenseId(String personalLoanExpenseId) {
		this.personalLoanExpenseId = personalLoanExpenseId;
	}

	public String getPayDayLoanExpenseId() {
		return payDayLoanExpenseId;
	}

	public void setPayDayLoanExpenseId(String payDayLoanExpenseId) {
		this.payDayLoanExpenseId = payDayLoanExpenseId;
	}

	public String getCreditCardExpenseId() {
		return creditCardExpenseId;
	}

	public void setCreditCardExpenseId(String creditCardExpenseId) {
		this.creditCardExpenseId = creditCardExpenseId;
	}

	public String getFeeHelpExpenseId() {
		return feeHelpExpenseId;
	}

	public void setFeeHelpExpenseId(String feeHelpExpenseId) {
		this.feeHelpExpenseId = feeHelpExpenseId;
	}

	public String getOtherDebtExpenseId() {
		return otherDebtExpenseId;
	}

	public void setOtherDebtExpenseId(String otherDebtExpenseId) {
		this.otherDebtExpenseId = otherDebtExpenseId;
	}

	public String getRentExpenseId() {
		return rentExpenseId;
	}

	public void setRentExpenseId(String rentExpenseId) {
		this.rentExpenseId = rentExpenseId;
	}

	public String getBasicLivingExpenseId() {
		return basicLivingExpenseId;
	}

	public void setBasicLivingExpenseId(String basicLivingExpenseId) {
		this.basicLivingExpenseId = basicLivingExpenseId;
	}

	public String getTelephoneBillExpenseId() {
		return telephoneBillExpenseId;
	}

	public void setTelephoneBillExpenseId(String telephoneBillExpenseId) {
		this.telephoneBillExpenseId = telephoneBillExpenseId;
	}

	public String getMobileBillExpenseId() {
		return mobileBillExpenseId;
	}

	public void setMobileBillExpenseId(String mobileBillExpenseId) {
		this.mobileBillExpenseId = mobileBillExpenseId;
	}

	public String getInternetBillExpenseId() {
		return internetBillExpenseId;
	}

	public void setInternetBillExpenseId(String internetBillExpenseId) {
		this.internetBillExpenseId = internetBillExpenseId;
	}

	public String getPayTvBillExpenseId() {
		return payTvBillExpenseId;
	}

	public void setPayTvBillExpenseId(String payTvBillExpenseId) {
		this.payTvBillExpenseId = payTvBillExpenseId;
	}

	public String getElectricityBillExpenseId() {
		return electricityBillExpenseId;
	}

	public void setElectricityBillExpenseId(String electricityBillExpenseId) {
		this.electricityBillExpenseId = electricityBillExpenseId;
	}

	public String getGasBillExpenseId() {
		return gasBillExpenseId;
	}

	public void setGasBillExpenseId(String gasBillExpenseId) {
		this.gasBillExpenseId = gasBillExpenseId;
	}

	public String getWaterBillExpenseId() {
		return waterBillExpenseId;
	}

	public void setWaterBillExpenseId(String waterBillExpenseId) {
		this.waterBillExpenseId = waterBillExpenseId;
	}

	public String getStrataBillExpenseId() {
		return strataBillExpenseId;
	}

	public void setStrataBillExpenseId(String strataBillExpenseId) {
		this.strataBillExpenseId = strataBillExpenseId;
	}

	public String getCouncilRatesExpenseId() {
		return councilRatesExpenseId;
	}

	public void setCouncilRatesExpenseId(String councilRatesExpenseId) {
		this.councilRatesExpenseId = councilRatesExpenseId;
	}

	public String getTrainFareExpenseId() {
		return trainFareExpenseId;
	}

	public void setTrainFareExpenseId(String trainFareExpenseId) {
		this.trainFareExpenseId = trainFareExpenseId;
	}

	public String getFuelExpenseId() {
		return fuelExpenseId;
	}

	public void setFuelExpenseId(String fuelExpenseId) {
		this.fuelExpenseId = fuelExpenseId;
	}

	public String getCarServicingExpenseId() {
		return carServicingExpenseId;
	}

	public void setCarServicingExpenseId(String carServicingExpenseId) {
		this.carServicingExpenseId = carServicingExpenseId;
	}

	public String getRegoExpenseId() {
		return regoExpenseId;
	}

	public void setRegoExpenseId(String regoExpenseId) {
		this.regoExpenseId = regoExpenseId;
	}

	public String getCarInsuranceExpenseId() {
		return carInsuranceExpenseId;
	}

	public void setCarInsuranceExpenseId(String carInsuranceExpenseId) {
		this.carInsuranceExpenseId = carInsuranceExpenseId;
	}

	public String getHomeInsuranceExpenseId() {
		return homeInsuranceExpenseId;
	}

	public void setHomeInsuranceExpenseId(String homeInsuranceExpenseId) {
		this.homeInsuranceExpenseId = homeInsuranceExpenseId;
	}

	public String getHealthInsuranceExpenseId() {
		return healthInsuranceExpenseId;
	}

	public void setHealthInsuranceExpenseId(String healthInsuranceExpenseId) {
		this.healthInsuranceExpenseId = healthInsuranceExpenseId;
	}

	public String getGymMembershipExpenseId() {
		return gymMembershipExpenseId;
	}

	public void setGymMembershipExpenseId(String gymMembershipExpenseId) {
		this.gymMembershipExpenseId = gymMembershipExpenseId;
	}

	public String getPetExpenseId() {
		return petExpenseId;
	}

	public void setPetExpenseId(String petExpenseId) {
		this.petExpenseId = petExpenseId;
	}

	public String getResturantBillExpenseId() {
		return resturantBillExpenseId;
	}

	public void setResturantBillExpenseId(String resturantBillExpenseId) {
		this.resturantBillExpenseId = resturantBillExpenseId;
	}

	public String getCinemaMovieExpenseId() {
		return cinemaMovieExpenseId;
	}

	public void setCinemaMovieExpenseId(String cinemaMovieExpenseId) {
		this.cinemaMovieExpenseId = cinemaMovieExpenseId;
	}

	public String getSmokingBillExpenseId() {
		return smokingBillExpenseId;
	}

	public void setSmokingBillExpenseId(String smokingBillExpenseId) {
		this.smokingBillExpenseId = smokingBillExpenseId;
	}

	public String getAlcoholExpenseId() {
		return alcoholExpenseId;
	}

	public void setAlcoholExpenseId(String alcoholExpenseId) {
		this.alcoholExpenseId = alcoholExpenseId;
	}

	public String getGamblingExpenseId() {
		return gamblingExpenseId;
	}

	public void setGamblingExpenseId(String gamblingExpenseId) {
		this.gamblingExpenseId = gamblingExpenseId;
	}

	public String getFamilyGiftsExpenseId() {
		return familyGiftsExpenseId;
	}

	public void setFamilyGiftsExpenseId(String familyGiftsExpenseId) {
		this.familyGiftsExpenseId = familyGiftsExpenseId;
	}

	public String getStudyExpenseId() {
		return studyExpenseId;
	}

	public void setStudyExpenseId(String studyExpenseId) {
		this.studyExpenseId = studyExpenseId;
	}

	public String getHouseMortgageLiabilityId() {
		return houseMortgageLiabilityId;
	}

	public void setHouseMortgageLiabilityId(String houseMortgageLiabilityId) {
		this.houseMortgageLiabilityId = houseMortgageLiabilityId;
	}

	public String getCarLoanLiabilityId() {
		return carLoanLiabilityId;
	}

	public void setCarLoanLiabilityId(String carLoanLiabilityId) {
		this.carLoanLiabilityId = carLoanLiabilityId;
	}

	public String getPersonalLoanLiabilityId() {
		return personalLoanLiabilityId;
	}

	public void setPersonalLoanLiabilityId(String personalLoanLiabilityId) {
		this.personalLoanLiabilityId = personalLoanLiabilityId;
	}

	public String getStoreAccountsLiabilityId() {
		return storeAccountsLiabilityId;
	}

	public void setStoreAccountsLiabilityId(String storeAccountsLiabilityId) {
		this.storeAccountsLiabilityId = storeAccountsLiabilityId;
	}

	public String getOnlineStoreAccountsLiabilityId() {
		return onlineStoreAccountsLiabilityId;
	}

	public void setOnlineStoreAccountsLiabilityId(String onlineStoreAccountsLiabilityId) {
		this.onlineStoreAccountsLiabilityId = onlineStoreAccountsLiabilityId;
	}

	public String getCreditCardOneLiabilityId() {
		return creditCardOneLiabilityId;
	}

	public void setCreditCardOneLiabilityId(String creditCardOneLiabilityId) {
		this.creditCardOneLiabilityId = creditCardOneLiabilityId;
	}

	public String getCreditCardTwoLiabilityId() {
		return creditCardTwoLiabilityId;
	}

	public void setCreditCardTwoLiabilityId(String creditCardTwoLiabilityId) {
		this.creditCardTwoLiabilityId = creditCardTwoLiabilityId;
	}

	public String getCreditCardThreeLiabilityId() {
		return creditCardThreeLiabilityId;
	}

	public void setCreditCardThreeLiabilityId(String creditCardThreeLiabilityId) {
		this.creditCardThreeLiabilityId = creditCardThreeLiabilityId;
	}

	public String getOtherLiabilityId() {
		return otherLiabilityId;
	}

	public void setOtherLiabilityId(String otherLiabilityId) {
		this.otherLiabilityId = otherLiabilityId;
	}

	public String getStudyLoanLiabilityId() {
		return studyLoanLiabilityId;
	}

	public void setStudyLoanLiabilityId(String studyLoanLiabilityId) {
		this.studyLoanLiabilityId = studyLoanLiabilityId;
	}

	public String getAtoDebtLiabilityId() {
		return atoDebtLiabilityId;
	}

	public void setAtoDebtLiabilityId(String atoDebtLiabilityId) {
		this.atoDebtLiabilityId = atoDebtLiabilityId;
	}

	public String getFamilyDebtLiabilityId() {
		return familyDebtLiabilityId;
	}

	public void setFamilyDebtLiabilityId(String familyDebtLiabilityId) {
		this.familyDebtLiabilityId = familyDebtLiabilityId;
	}

	public String getInvestmentPropertyLiabilityId() {
		return investmentPropertyLiabilityId;
	}

	public void setInvestmentPropertyLiabilityId(String investmentPropertyLiabilityId) {
		this.investmentPropertyLiabilityId = investmentPropertyLiabilityId;
	}

	public String getHousePropertyAssetId() {
		return housePropertyAssetId;
	}

	public void setHousePropertyAssetId(String housePropertyAssetId) {
		this.housePropertyAssetId = housePropertyAssetId;
	}

	public String getHouseHoldFurnitureAssetId() {
		return houseHoldFurnitureAssetId;
	}

	public void setHouseHoldFurnitureAssetId(String houseHoldFurnitureAssetId) {
		this.houseHoldFurnitureAssetId = houseHoldFurnitureAssetId;
	}

	public String getVehicleAssetId() {
		return vehicleAssetId;
	}

	public void setVehicleAssetId(String vehicleAssetId) {
		this.vehicleAssetId = vehicleAssetId;
	}

	public String getBankAccountCashAssetId() {
		return bankAccountCashAssetId;
	}

	public void setBankAccountCashAssetId(String bankAccountCashAssetId) {
		this.bankAccountCashAssetId = bankAccountCashAssetId;
	}

	public String getBoatAssetId() {
		return boatAssetId;
	}

	public void setBoatAssetId(String boatAssetId) {
		this.boatAssetId = boatAssetId;
	}

	public String getJewelleryAssetId() {
		return jewelleryAssetId;
	}

	public void setJewelleryAssetId(String jewelleryAssetId) {
		this.jewelleryAssetId = jewelleryAssetId;
	}

	public String getSuperAnnuationAssetId() {
		return superAnnuationAssetId;
	}

	public void setSuperAnnuationAssetId(String superAnnuationAssetId) {
		this.superAnnuationAssetId = superAnnuationAssetId;
	}

	public String getStocksAssetId() {
		return stocksAssetId;
	}

	public void setStocksAssetId(String stocksAssetId) {
		this.stocksAssetId = stocksAssetId;
	}

	public String getInvestmentPropertyAssetId() {
		return investmentPropertyAssetId;
	}

	public void setInvestmentPropertyAssetId(String investmentPropertyAssetId) {
		this.investmentPropertyAssetId = investmentPropertyAssetId;
	}

	public String getTermDepositAssetId() {
		return termDepositAssetId;
	}

	public void setTermDepositAssetId(String termDepositAssetId) {
		this.termDepositAssetId = termDepositAssetId;
	}

}
