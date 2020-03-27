package com.revature.purchase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.purchase.domain.Payment;
import com.revature.purchase.services.PaymentService;

@RestController
public class PaymentController {
	
	private PaymentService paymentService;
	
	@Autowired
	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	@GetMapping("/payment/{id}")
	public Payment getPaymentById(@PathVariable int id) {
		return paymentService.getPaymentById(id);
	}
	
	@GetMapping("/payment")
	public List<Payment> getAllPayments() {
		return paymentService.getAllPayments();
	}
	
	@PostMapping("/payment")
	public void addPayment(@RequestBody Payment payment) {
		paymentService.addPayment(payment);
	}
	
}
