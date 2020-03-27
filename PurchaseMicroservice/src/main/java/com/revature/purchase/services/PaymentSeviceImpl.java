package com.revature.purchase.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.purchase.daos.PaymentDAO;
import com.revature.purchase.domain.Payment;

@Service
public class PaymentSeviceImpl implements PaymentService {

	private PaymentDAO paymentDao;

	@Autowired
	public void setPatmentDao(PaymentDAO paymentDao) {
		this.paymentDao = paymentDao;
	}

	@Override
	public Payment getPaymentById(int id) {
		Optional<Payment> opt = paymentDao.findById(id);

		if (opt.isPresent()) {
			return opt.get();
		}

		return null;
	}

	@Override
	public List<Payment> getAllPayments() {
		return paymentDao.findAll();
	}

	@Override
	public void addPayment(Payment payment) {
		Optional<Payment> opt = paymentDao.findById(payment.getId());

		if (!opt.isPresent()) {
			paymentDao.save(payment);
		} else {
			// TODO handle if payment already exists
		}
		
		
	}

}
