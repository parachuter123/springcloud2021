package com.ronan.service.impl;

import com.ronan.dao.PaymentDao;
import com.ronan.entity.Payment;
import com.ronan.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {

        return paymentDao.getPaymentById(id);

    }
}