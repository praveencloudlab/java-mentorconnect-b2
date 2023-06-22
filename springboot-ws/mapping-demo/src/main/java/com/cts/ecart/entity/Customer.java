package com.cts.ecart.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int custId;
    private String custName;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name="orderDetails",joinColumns = {@JoinColumn(name="custId")},inverseJoinColumns = {@JoinColumn(name="orderId")})
    List<Order> orders=new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Customer(){

    }

    public Customer(String custName) {
        this.custName = custName;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", orders=" + orders +
                '}';
    }
}
