package com.example.test1;

import java.math.BigDecimal;

public class Expense {
    private Long id;
    private BigDecimal amount;
    private String category;
    private String description;
    private String date;

    public Expense(Long id, BigDecimal amount, String category, String description, String date){
        this.id = id;
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

}

