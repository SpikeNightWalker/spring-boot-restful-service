package com.spike.payroll.exception;

/**
 * Created by Spike on 2020/5/9.
 */
public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
