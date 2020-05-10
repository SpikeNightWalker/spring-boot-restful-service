package com.spike.payroll.run;

import com.spike.payroll.bean.Employee;
import com.spike.payroll.bean.Order;
import com.spike.payroll.bean.Status;
import com.spike.payroll.dao.EmployeeRepository;
import com.spike.payroll.dao.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Spike on 2020/5/9.
 */
@Configuration
@Slf4j
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository, OrderRepository orderRepository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar", "gardener")));
            log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief", "gardener")));

            orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
            orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> {
                log.info("Preloaded " + order);
            });
        };
    }
}
