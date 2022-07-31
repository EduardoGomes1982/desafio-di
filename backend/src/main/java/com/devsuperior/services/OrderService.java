package com.devsuperior.services;

import org.springframework.stereotype.Service;

import com.devsuperior.models.entities.Order;

@Service
public class OrderService {
	private ShippingService shippingService;
	
	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}
	
	public Double total(Order order) {
		return order.getBasic() * (1 - order.getDiscount() / 100) + shippingService.shipment(order);
	}
}
