'use strict';

angular.module('sample.typeform', ['cba.wizard'])
    .controller('CustomerViewModel', function (DefaultWorkflowProvider, TypeformTransitionProvider) {

        // NOTE: These do not need to be specified as they are the default providers.
        this.options = {
            transitionProvider: new TypeformTransitionProvider(),
            workflowProvider: new DefaultWorkflowProvider({
                goToErrorOnSubmit: true,
                skipValidStepsAfterSubmit: false
            })
        };
    
    this.model = {
        
        firstName : 'Fahad',
        middleName : 'Bin',
        lastName : 'Rahat',
        title : 'Mr',
        
        
        
    }
    
    this.displayNumOfDependants = false;
    this.displayEmployment = false;
    this.displayPartnerIncome = false;
    this.displaySavingsIncome = false;
    this.displayDividentsIncome = false;
    this.displayCommissionsIncome = false;
    this.displayRoyaltiesIncome = false;
    this.displayRentalIncome = false;
    this.displayMortgageExpense = false;
    this.displayCarLoanExpense = false;
    this.displayCreditCardExpense = false;
    this.displayFeeHelpLoanExpense = false;
    this.displayOtherDebtExpense = false;
    this.displayRentExpense = false;
    this.displayPublicTransportExpense = false;
    this.displayCarExpense = false;
    this.displayCenterlinkIncome = false;
    this.displayHomeAsset = false;
    
    this.displayHideDependant = function(){
        
        var haveDependants = this.CustomerViewModel.haveDependants;
        
        if(haveDependants === 'Yes'){
            this.displayNumOfDependants = true;
        }
        else{
            this.displayNumOfDependants = false;
        }
        
    }
    this.displayHideEmployment = function(){

        var isEmployed = this.CustomerViewModel.isEmployed;

        if(isEmployed === 'Yes'){
            this.displayEmployment = true;
        }
        else{
            this.displayEmployment = false;
        }

    }

    this.displayHidePartnerIncome = function(){

        var hasPartner = this.CustomerViewModel.maritalStatus;

        if(hasPartner === 'Married'){
            this.displayPartnerIncome = true;
        }
        else{
            this.displayPartnerIncome = false;
        }

    }

    this.displayHideSavingsIncome = function(){

        var hasSavingsIncome = this.CustomerViewModel.hasSavingsIncome;

        if(hasSavingsIncome === 'Yes'){
            this.displaySavingsIncome = true;
        }
        else{
            this.displaySavingsIncome = false;
        }

    }
    this.displayHideDividentsIncome = function(){

        var hasDividentsIncome = this.CustomerViewModel.hasDividentsIncome;

        if(hasDividentsIncome === 'Yes'){
            this.displayDividentsIncome = true;
        }
        else{
            this.displayDividentsIncome = false;
        }

    }
    this.displayHideCommissionsIncome = function(){

        var hasCommissionsIncome = this.CustomerViewModel.hasCommissionsIncome;

        if(hasCommissionsIncome === 'Yes'){
            this.displayCommissionsIncome = true;
        }
        else{
            this.displayCommissionsIncome = false;
        }

    }
    this.displayHideRoyaltiesIncome = function(){

        var hasRoyaltiesIncome = this.CustomerViewModel.hasRoyaltiesIncome;

        if(hasRoyaltiesIncome === 'Yes'){
            this.displayRoyaltiesIncome = true;
        }
        else{
            this.displayRoyaltiesIncome = false;
        }

    }
    this.displayHideCenterlinkIncome = function(){

        var hasCenterlinkIncome = this.CustomerViewModel.hasCenterlinkIncome;

        if(hasCenterlinkIncome === 'Yes'){
            this.displayCenterlinkIncome = true;
        }
        else{
            this.displayCenterlinkIncome = false;
        }

    }
    this.displayHideRentalIncome = function(){

        var hasRentalIncome = this.CustomerViewModel.hasRentalIncome;

        if(hasRentalIncome === 'Yes'){
            this.displayRentalIncome = true;
        }
        else{
            this.displayRentalIncome = false;
        }

    }
    
    this.displayHideOtherIncome = function(){

        var hasOtherIncome = this.CustomerViewModel.hasOtherIncome;

        if(hasOtherIncome === 'Yes'){
            this.displayOtherIncome = true;
        }
        else{
            this.displayOtherIncome = false;
        }

    }
    this.displayHideMortgageExpense = function(){

        var hasMortgageExpense = this.CustomerViewModel.hasMortgageExpense;

        if(hasMortgageExpense === 'Yes'){
            this.displayMortgageExpense = true;
        }
        else{
            this.displayMortgageExpense = false;
        }

    }
    
    this.displayHideCarLoanExpense = function(){

        var hasCarLoanExpense = this.CustomerViewModel.hasCarLoanExpense;

        if(hasCarLoanExpense === 'Yes'){
            this.displayCarLoanExpense = true;
        }
        else{
            this.displayCarLoanExpense = false;
        }

    }


    this.displayHideCreditCardExpense = function(){

        var hasCreditCardExpense = this.CustomerViewModel.hasCreditCardExpense;

        if(hasCreditCardExpense === 'Yes'){
            this.displayCreditCardExpense = true;
        }
        else{
            this.displayCreditCardExpense = false;
        }

    }
    this.displayHideFeeHelpLoanExpense = function(){

        var hasFeeHelpLoanExpense = this.CustomerViewModel.hasFeeHelpLoanExpense;

        if(hasFeeHelpLoanExpense === 'Yes'){
            this.displayFeeHelpLoanExpense = true;
        }
        else{
            this.displayFeeHelpLoanExpense = false;
        }

    }
    this.displayHideOtherDebtExpense = function(){

        var hasOtherDebtExpense = this.CustomerViewModel.hasOtherDebtExpense;

        if(hasOtherDebtExpense === 'Yes'){
            this.displayOtherDebtExpense = true;
        }
        else{
            this.displayOtherDebtExpense = false;
        }

    }
    this.displayHideRentExpense = function(){

        var hasRentExpense = this.CustomerViewModel.hasRentExpense;

        if(hasRentExpense === 'Yes'){
            this.displayRentExpense = true;
        }
        else{
            this.displayRentExpense = false;
        }

    }
    this.displayHidePublicTransportExpense = function(){

        var hasPublicTransportExpense = this.CustomerViewModel.hasPublicTransportExpense;

        if(hasPublicTransportExpense === 'Yes'){
            this.displayPublicTransportExpense = true;
        }
        else{
            this.displayPublicTransportExpense = false;
        }

    }
    this.displayHideCarExpense = function(){

        var hasCarExpense = this.CustomerViewModel.hasCarExpense;

        if(hasCarExpense === 'Yes'){
            this.displayCarExpense = true;
        }
        else{
            this.displayCarExpense = false;
        }

    }
    this.displayHideHomeInsuranceExpense = function(){

        var hasHomeInsuranceExpense = this.CustomerViewModel.hasHomeInsuranceExpense;

        if(hasHomeInsuranceExpense === 'Yes'){
            this.displayHomeInsuranceExpense = true;
        }
        else{
            this.displayHomeInsuranceExpense = false;
        }

    }
    this.displayHideHealthInsuranceExpense = function(){

        var hasHealthInsuranceExpense = this.CustomerViewModel.hasHealthInsuranceExpense;

        if(hasHealthInsuranceExpense === 'Yes'){
            this.displayHealthInsuranceExpense = true;
        }
        else{
            this.displayHealthInsuranceExpense = false;
        }

    }
    this.displayHideGymMembershipExpense = function(){

        var hasGymMembershipExpense = this.CustomerViewModel.hasGymMembershipExpense;

        if(hasGymMembershipExpense === 'Yes'){
            this.displayGymMembershipExpense = true;
        }
        else{
            this.displayGymMembershipExpense = false;
        }

    }
    this.displayHidePetsExpense = function(){

        var hasPetsExpense = this.CustomerViewModel.hasPetsExpense;

        if(hasPetsExpense === 'Yes'){
            this.displayPetsExpense = true;
        }
        else{
            this.displayPetsExpense = false;
        }

    }
    this.displayHideResturantBillExpense = function(){

        var hasResturantBillExpense = this.CustomerViewModel.hasResturantBillExpense;

        if(hasResturantBillExpense === 'Yes'){
            this.displayResturantBillExpense = true;
        }
        else{
            this.displayResturantBillExpense = false;
        }

    }
    this.displayHideCinemaMovieExpense = function(){

        var hasCinemaMovieExpense = this.CustomerViewModel.hasCinemaMovieExpense;

        if(hasCinemaMovieExpense === 'Yes'){
            this.displayCinemaMovieExpense = true;
        }
        else{
            this.displayCinemaMovieExpense = false;
        }

    }
    this.displayHideSmokingBillExpense = function(){

        var hasSmokingBillExpense = this.CustomerViewModel.hasSmokingBillExpense;

        if(hasSmokingBillExpense === 'Yes'){
            this.displaySmokingBillExpense = true;
        }
        else{
            this.displaySmokingBillExpense = false;
        }

    }
    this.displayHideAlcoholBillExpense = function(){

        var hasAlcoholBillExpense = this.CustomerViewModel.hasAlcoholBillExpense;

        if(hasAlcoholBillExpense === 'Yes'){
            this.displayAlcoholBillExpense = true;
        }
        else{
            this.displayAlcoholBillExpense = false;
        }

    }
    this.displayHideGamblingBillExpense = function(){

        var hasGamblingBillExpense = this.CustomerViewModel.hasGamblingBillExpense;

        if(hasGamblingBillExpense === 'Yes'){
            this.displayGamblingBillExpense = true;
        }
        else{
            this.displayGamblingBillExpense = false;
        }

    }
    this.displayHideFamilyGiftsBillExpense = function(){

        var hasFamilyGiftsBillExpense = this.CustomerViewModel.hasFamilyGiftsBillExpense;

        if(hasFamilyGiftsBillExpense === 'Yes'){
            this.displayFamilyGiftsBillExpense = true;
        }
        else{
            this.displayFamilyGiftsBillExpense = false;
        }

    }
    this.displayHideStudyBillExpense = function(){

        var hasStudyBillExpense = this.CustomerViewModel.hasStudyBillExpense;

        if(hasStudyBillExpense === 'Yes'){
            this.displayStudyBillExpense = true;
        }
        else{
            this.displayStudyBillExpense = false;
        }

    }
    this.displayHidePayDayLoanExpense = function(){

        var hasPayDayLoanExpense = this.CustomerViewModel.hasPayDayLoanExpense;

        if(hasPayDayLoanExpense === 'Yes'){
            this.displayPayDayLoanExpense = true;
        }
        else{
            this.displayPayDayLoanExpense = false;
        }

    }
    this.displayHideHomeAsset = function(){

        var hasHomeAsset = this.CustomerViewModel.hasHomeAsset;

        if(hasHomeAsset === 'Yes'){
            this.displayHomeAsset = true;
        }
        else{
            this.displayHomeAsset = false;
        }

    }
    this.displayHideVehicleAsset = function(){

        var hasVehicleAsset = this.CustomerViewModel.hasVehicleAsset;

        if(hasVehicleAsset === 'Yes'){
            this.displayVehicleAsset = true;
        }
        else{
            this.displayVehicleAsset = false;
        }

    }
    this.displayHideBoatAsset = function(){

        var hasBoatAsset = this.CustomerViewModel.hasBoatAsset;

        if(hasBoatAsset === 'Yes'){
            this.displayBoatAsset = true;
        }
        else{
            this.displayBoatAsset = false;
        }

    }
    this.displayHideSuperannuationAsset = function(){

        var hasSuperannuationAsset = this.CustomerViewModel.hasSuperannuationAsset;

        if(hasSuperannuationAsset === 'Yes'){
            this.displaySuperannuationAsset = true;
        }
        else{
            this.displaySuperannuationAsset = false;
        }

    }
    this.displayHideStocksAsset = function(){

        var hasStocksAsset = this.CustomerViewModel.hasStocksAsset;

        if(hasStocksAsset === 'Yes'){
            this.displayStocksAsset = true;
        }
        else{
            this.displayStocksAsset = false;
        }

    }
    this.displayHideInvestmentPropertyAsset = function(){

        var hasInvestmentPropertyAsset = this.CustomerViewModel.hasInvestmentPropertyAsset;

        if(hasInvestmentPropertyAsset === 'Yes'){
            this.displayInvestmentPropertyAsset = true;
        }
        else{
            this.displayInvestmentPropertyAsset = false;
        }

    }
    this.displayHideTermDepositAsset = function(){

        var hasTermDepositAsset = this.CustomerViewModel.hasTermDepositAsset;

        if(hasTermDepositAsset === 'Yes'){
            this.displayTermDepositAsset = true;
        }
        else{
            this.displayTermDepositAsset = false;
        }

    }
    this.displayHideTermDepositAsset = function(){

        var hasTermDepositAsset = this.CustomerViewModel.hasTermDepositAsset;

        if(hasTermDepositAsset === 'Yes'){
            this.displayTermDepositAsset = true;
        }
        else{
            this.displayTermDepositAsset = false;
        }

    }
    this.displayHideHouseMortgageLiability = function(){

        var hasHouseMortgageLiability = this.CustomerViewModel.hasHouseMortgageLiability;

        if(hasHouseMortgageLiability === 'Yes'){
            this.displayHouseMortgageLiability = true;
        }
        else{
            this.displayHouseMortgageLiability = false;
        }

    }
    this.displayHideCarLoanLiability = function(){

        var hasCarLoanLiability = this.CustomerViewModel.hasCarLoanLiability;

        if(hasCarLoanLiability === 'Yes'){
            this.displayCarLoanLiability = true;
        }
        else{
            this.displayCarLoanLiability = false;
        }

    }
    this.displayHidePersonalLoanLiability = function(){

        var hasPersonalLoanLiability = this.CustomerViewModel.hasPersonalLoanLiability;

        if(hasPersonalLoanLiability === 'Yes'){
            this.displayPersonalLoanLiability = true;
        }
        else{
            this.displayPersonalLoanLiability = false;
        }

    }
    this.displayHideStoreAccountsLiability = function(){

        var hasStoreAccountsLiability = this.CustomerViewModel.hasStoreAccountsLiability;

        if(hasStoreAccountsLiability === 'Yes'){
            this.displayStoreAccountsLiability = true;
        }
        else{
            this.displayStoreAccountsLiability = false;
        }

    }
    this.displayHideCreditCardOneLiability = function(){

        var hasCreditCardOneLiability = this.CustomerViewModel.hasCreditCardOneLiability;

        if(hasCreditCardOneLiability === 'Yes'){
            this.displayCreditCardOneLiability = true;
        }
        else{
            this.displayCreditCardOneLiability = false;
        }

    }
    this.displayHideCreditCardTwoLiability = function(){

        var hasCreditCardTwoLiability = this.CustomerViewModel.hasCreditCardTwoLiability;

        if(hasCreditCardTwoLiability === 'Yes'){
            this.displayCreditCardTwoLiability = true;
        }
        else{
            this.displayCreditCardTwoLiability = false;
        }

    }

    this.displayHideCreditCardThreeLiability = function(){

        var hasCreditCardThreeLiability = this.CustomerViewModel.hasCreditCardThreeLiability;

        if(hasCreditCardThreeLiability === 'Yes'){
            this.displayCreditCardThreeLiability = true;
        }
        else{
            this.displayCreditCardThreeLiability = false;
        }

    }
    this.displayHideStudyLoanLiability = function(){

        var hasStudyLoanLiability = this.CustomerViewModel.hasStudyLoanLiability;

        if(hasStudyLoanLiability === 'Yes'){
            this.displayStudyLoanLiability = true;
        }
        else{
            this.displayStudyLoanLiability = false;
        }

    }
    this.displayHideAtoDebtLiability = function(){

        var hasAtoDebtLiability = this.CustomerViewModel.hasAtoDebtLiability;

        if(hasAtoDebtLiability === 'Yes'){
            this.displayAtoDebtLiability = true;
        }
        else{
            this.displayAtoDebtLiability = false;
        }

    }
    this.displayHideFamilyDebtLiability = function(){

        var hasFamilyDebtLiability = this.CustomerViewModel.hasFamilyDebtLiability;

        if(hasFamilyDebtLiability === 'Yes'){
            this.displayFamilyDebtLiability = true;
        }
        else{
            this.displayFamilyDebtLiability = false;
        }

    }
    this.displayHideInvestmentPropertyLiability = function(){

        var hasInvestmentPropertyLiability = this.CustomerViewModel.hasInvestmentPropertyLiability;

        if(hasInvestmentPropertyLiability === 'Yes'){
            this.displayInvestmentPropertyLiability = true;
        }
        else{
            this.displayInvestmentPropertyLiability = false;
        }

    }

    
    
    
    

    


    
        this.submit = function (isValid) {

            if (!isValid) {
                console.log('the form is invalid, redirecting you to the errors');
                return;
            }

            alert('submit successful');
        };
    });
