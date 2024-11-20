package com.antares.order.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antares.order.entities.Order;

@Service
public class OrderService {
    @Autowired
    ShippingService shippingService;

    public Double total(Order order){

        return shippingService.shipment(order);
    }
}
