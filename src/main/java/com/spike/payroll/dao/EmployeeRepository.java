package com.spike.payroll.dao;

import com.spike.payroll.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Spike on 2020/5/9.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
