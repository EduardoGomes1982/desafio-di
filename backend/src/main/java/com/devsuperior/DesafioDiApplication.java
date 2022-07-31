package com.devsuperior;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.models.entities.Order;
import com.devsuperior.services.OrderService;

@SpringBootApplication
public class DesafioDiApplication implements CommandLineRunner {
	private OrderService orderService;
	
	public DesafioDiApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DesafioDiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.0, 20.0);
		System.out.printf("Pedido código %d%n", order1.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order1));
		
		Order order2 = new Order(2282, 800.0, 10.0);
		System.out.printf("Pedido código %d%n", order2.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order2));
		
		Order order3 = new Order(1309, 95.9, 0.0);
		System.out.printf("Pedido código %d%n", order3.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order3));
	}
}
