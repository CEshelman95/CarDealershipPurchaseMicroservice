package com.revature.purchase.services;

import java.util.List;

import com.revature.purchase.domain.Payment;

public interface PaymentService {
	
	public Payment getPaymentById(int id);
	
	public List<Payment> getAllPayments();
	
	public void addPayment(Payment payment);
	
}
