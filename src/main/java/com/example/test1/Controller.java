package com.example.test1;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class Controller {
    private final ExpenseService service;

    public Controller(ExpenseService service){
        this.service = service;
    }

    @GetMapping("/expenses")
    public List<Expense> getExpenses(){
        return service.getExpenses();
    }


}

