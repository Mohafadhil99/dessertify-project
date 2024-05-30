package com.capstone.ccsd.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @GetMapping("/{id}")
    public Payment getPaymentById(@PathVariable Integer id) {
        return paymentService.getPaymentById(id);
    }

    @PostMapping
    public void addPayment(@RequestBody Payment payment) {
        paymentService.savePayment(payment);
    }

    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable Integer id) {
        paymentService.deletePayment(id);
    }
}
