package com.assignment;
// Custom exception class for invalid employee name
   class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);//calling the constructor of parent class
    }
}
