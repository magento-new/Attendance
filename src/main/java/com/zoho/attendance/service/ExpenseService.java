package com.zoho.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.attendance.entity.Expense;
import com.zoho.attendance.repository.ExpenseRepository;

@Service("ExpenseService")
public class ExpenseService {
    @Autowired
	ExpenseRepository expenserepository;

    public String postExpenses(Expense expense) {

        //Expense expensedetail = expenserepository.findById(expense.getId()).get();
           //if(expensedetail==null) {
            expenserepository.save(expense);
           return "Expense has been added";
           //}
           //return null;
       }

    public List<Expense> getExpenses() {        
        List<Expense> expense = (List<Expense>)expenserepository.findAll();
        if (expense != null) {
            return expense;
        }
        return null;
    }

    public String updateExpenses(Long id,Expense expense) {
    	Expense l = expenserepository.findByEmpidAndId(expense.getEmpid(),expense.getId());
    	if(l!=null) {
            l.setAmount(expense.getAmount());
            l.setCategory(expense.getCategory());
            l.setItem(expense.getItem());
            l.setSpendOn(expense.getSpendOn());

            expenserepository.save(l);		
    	}
		return "Expense has been updated, user name = " + l.getEmpid();
	}

    public String deleteExpenseEntry(Long id) {
    	expenserepository.deleteById(id);
        return "Expense data has been deleted successfully.";

    }
}
