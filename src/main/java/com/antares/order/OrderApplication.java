package com.antares.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.antares.order.entities.Order;
import com.antares.order.services.OrderService;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1309, 95.90, 00.00);
		
		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: " + orderService.total(order));
	}

}
