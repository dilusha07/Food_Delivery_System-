package com.mds.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mds.dto.ResturantDto;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User customer;

    @JsonIgnore
    @ManyToOne
    private Resturant resturant;

    private Long totalAmount;

    private String orderStatus;

    private Date createAt;

    @ManyToOne
    private Address deliveryAddress;

    private List<Orderitem> items;


}
