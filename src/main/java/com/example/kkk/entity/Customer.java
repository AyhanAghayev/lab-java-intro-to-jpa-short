package com.example.kkk.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "customer_name", nullable = false, length = 50)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "customer_status", nullable = false)
    private CustomerStatus status = CustomerStatus.NONE;

    @Column(name = "total_customer_mileage", nullable = false)
    private Integer totalMileage;

    public Customer() {
    }

    public Customer(String name, CustomerStatus status, Integer totalMileage) {
        this.name = name;
        this.status = status;
        this.totalMileage = totalMileage;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public Integer getTotalMileage() {
        return totalMileage;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTotalMileage(Integer totalMileage) {
        this.totalMileage = totalMileage;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }
}