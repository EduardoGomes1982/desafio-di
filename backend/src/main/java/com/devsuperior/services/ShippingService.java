package com.devsuperior.services;

import org.springframework.stereotype.Service;

import com.devsuperior.models.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		Double basic = order.getBasic();
		return (basic >= 200 ? 0 : (basic >= 100 ? 12.0 : 20.0));
	}
}
