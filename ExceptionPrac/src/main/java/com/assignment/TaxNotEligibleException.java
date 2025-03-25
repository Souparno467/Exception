package com.assignment;
// Custom exception class for tax not eligible
 class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);//calling the constructor of parent class
    }
}
