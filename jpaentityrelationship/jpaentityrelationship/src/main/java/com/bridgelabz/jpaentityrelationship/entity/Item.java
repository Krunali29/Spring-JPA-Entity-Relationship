package com.bridgelabz.jpaentityrelationship.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Item {
    @Id
    @GeneratedValue
    private  int id;
    private String name;

    public Item(String name){
        this.name=name;

    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "items")
    private Set<Customer> customer=new HashSet<>();

    public Set<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Set<Customer> customer) {
        this.customer = customer;
    }
}
