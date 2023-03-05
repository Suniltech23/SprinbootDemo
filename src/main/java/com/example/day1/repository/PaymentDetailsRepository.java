package com.example.day1.repository;

import com.example.day1.model.PaymentDetails;
import org.springframework.data.repository.CrudRepository;

public interface PaymentDetailsRepository extends CrudRepository<PaymentDetails,Integer> {
}
