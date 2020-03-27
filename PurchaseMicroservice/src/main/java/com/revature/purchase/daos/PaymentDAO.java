package com.revature.purchase.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.purchase.domain.Payment;

@Repository
public interface PaymentDAO extends JpaRepository<Payment, Integer> {

}