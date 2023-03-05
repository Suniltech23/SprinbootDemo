package com.example.day1.service;

import com.example.day1.model.PaymentDetails;
import com.example.day1.repository.PaymentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentDetailsService {
    @Autowired    PaymentDetailsRepository  paymentDetailsRepository;

    //To get all Payment details
    public List<PaymentDetails> getAllPaymentDetails()
    {
        List<PaymentDetails> paymentDetails= new ArrayList<PaymentDetails>();
        paymentDetailsRepository.findAll().forEach(PaymentDetails -> paymentDetails.add(PaymentDetails));
        return  paymentDetails;
    }

    //To get payment details by payment id
    public PaymentDetails getPaymentDetailsById(int id)
    {
        return paymentDetailsRepository.findById(id).get();
    }

    // To save PaymentDetails
    public void savePaymentDetails(PaymentDetails paymentDetails)
    {
        paymentDetailsRepository.save(paymentDetails);
    }

    // To delete PaymentDetails buy Payment Id
    public void deletePaymentDetails(int id){
        paymentDetailsRepository.deleteById(id);
    }
}
