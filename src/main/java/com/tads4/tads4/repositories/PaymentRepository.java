package com.tads4.tads4.repositories;

import com.tads4.tads4.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
