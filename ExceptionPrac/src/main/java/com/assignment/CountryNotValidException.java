package com.assignment;
// Custom exception class for invalid country
    class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);//calling the constructor of parent class
    }
}
