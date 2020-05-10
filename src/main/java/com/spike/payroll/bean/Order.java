package com.spike.payroll.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Spike on 2020/5/9.
 */
@Entity
@Data
@Table(name = "CUSTOMER_ORDER")
public class Order {

    private @Id
    @GeneratedValue()
    Long id;

    private String description;
    private Status status;

    public Order() {}

    public Order(String description, Status status) {

        this.description = description;
        this.status = status;
    }
}
