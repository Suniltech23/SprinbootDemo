package com.example.day1.controller;

import com.example.day1.model.PaymentDetails;
import com.example.day1.service.PaymentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentDetailsController {

    @Autowired
    PaymentDetailsService paymentDetailsService;

    @GetMapping("/paymentdetails")
    private List<PaymentDetails> getPaymentDetails(){
        return  paymentDetailsService.getAllPaymentDetails();
    }
    @GetMapping("/paymentdetails/id")
    private PaymentDetails getPaymentDetailsId(@PathVariable("id") int id){
        return paymentDetailsService.getPaymentDetailsById(id);
    }
    @PostMapping("/paymentdetails")
    private int savePaymentDetails(@RequestBody PaymentDetails paymentDetails){
        paymentDetailsService.savePaymentDetails(paymentDetails);
        return paymentDetails.getPaymentId();
    }

    @DeleteMapping("/paymentdetails/id")
    private void deletePaymentDetails(@PathVariable("id") int id){
        paymentDetailsService.deletePaymentDetails(id);
    }

}
