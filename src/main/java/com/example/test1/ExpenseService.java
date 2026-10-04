package com.example.test1;

import tools.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.*;

@Service
public class ExpenseService {
    private final List<Expense> expenses = new ArrayList<Expense>();

    public ExpenseService(){
        Expense e = new Expense(0L, new BigDecimal("23.23"), "Food", "Bought a cake", "23-03-2026");
        expenses.add(e);
    }


    public List<Expense> getExpenses(){
        return expenses;
    }

}
