package com.cts.ecart;

import com.cts.ecart.entity.Customer;
import com.cts.ecart.entity.Order;
import com.cts.ecart.repository.CustomerRepository;
import com.cts.ecart.repository.OrderRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class MappingDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ac= SpringApplication.run(MappingDemoApplication.class, args);
        OrderRepository or=ac.getBean(OrderRepository.class);
        CustomerRepository cr=ac.getBean(CustomerRepository.class);

        List<Order> orders= Arrays.asList(new Order(LocalDate.now()),new Order(LocalDate.now()),new Order(LocalDate.now()),new Order(LocalDate.now()),new Order(LocalDate.now()));
        Customer customer=new Customer("Praveen");

        //customer.getOrders().addAll(orders);
       // cr.save(customer);

        Customer cust=cr.findById(1).orElse(null);
        System.out.println(cust);

    }

}
