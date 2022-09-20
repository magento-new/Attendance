package com.zoho.attendance.service;

import org.springframework.stereotype.Service;

import com.zoho.attendance.entity.PaySlip;
import com.zoho.attendance.repository.PaySlipRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service("PaySlipService")
public class PaySlipService {
    @Autowired
	PaySlipRepository paySlipRepository;

    public String postPaySlip(PaySlip paySlip) {

        //Expense expensedetail = expenserepository.findById(expense.getId()).get();
           //if(expensedetail==null) {
            paySlipRepository.save(paySlip);
           return "PaySlip has been added";
           //}
           //return null;
       }

       public List<PaySlip> getPaySlip() {        
        List<PaySlip> paySlip = (List<PaySlip>)paySlipRepository.findAll();
        if (paySlip != null) {
            return paySlip;
        }
        return null;
    }
}
