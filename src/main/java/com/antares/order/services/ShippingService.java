package com.antares.order.services;

import org.springframework.stereotype.Service;

import com.antares.order.entities.Order;

@Service
public class ShippingService {

    public Double shipment(Order order) {

        double value = 0.0;

        if (order.getBasic() < 100.00) {
            value = order.getBasic() 
            - (order.getBasic() * (order.getDiscount() / 100)) 
            + 20.00;
        } else if (order.getBasic() < 200.00) {
            value = order.getBasic() 
            - (order.getBasic() * (order.getDiscount() / 100)) 
            + 12.00;
        } else {
            value = order.getBasic() 
            - (order.getBasic() * (order.getDiscount() / 100)) 
            + 0.00;

        }
        return value;
    }

}
