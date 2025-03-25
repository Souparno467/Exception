package com.assignment;

 class CalculatorSimulator {// Class to test the TaxCalculator class

    public static void testCase(TaxCalculator taxCalculator,String empName,boolean isIndian,double empSal){
        try{// Try block to handle exceptions
            double tax = taxCalculator.calculateTax(empName,isIndian,empSal);
            System.out.println("Tax amount is:- "+tax);
        }catch (CountryNotValidException|EmployeeNameInvalidException|TaxNotEligibleException e){
            System.out.println(e.getMessage());// Print the exception message
        }
    }
     public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator(); // Creating object of TaxCalculator class
        testCase(taxCalculator,"Ron",true,34000);// Test case 1
        testCase(taxCalculator,"Tim",false,1000);// Test case 2
        testCase(taxCalculator,"Jack",true,55000);// Test case 3
        testCase(taxCalculator,"",true,30000);// Test case 4

     }
}
