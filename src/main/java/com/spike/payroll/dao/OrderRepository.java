package com.spike.payroll.dao;

import com.spike.payroll.bean.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Spike on 2020/5/9.
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
