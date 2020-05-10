package com.spike.payroll.exception;

/**
 * Created by Spike on 2020/5/9.
 */
public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id) {
        super("Could not find order " + id);
    }
}
