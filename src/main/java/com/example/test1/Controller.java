package com.example.test1;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/expenses/{id}")
    public ResponseEntity<?> getExpenseById(@PathVariable Long id){
        Expense myExpense = service.getExpenseById(id);

        if(myExpense == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nie znaleziono obiektu o danym id: " + id);
        }
        return ResponseEntity.ok(myExpense);

    }


}

