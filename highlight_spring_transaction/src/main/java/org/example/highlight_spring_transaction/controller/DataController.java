package org.example.highlight_spring_transaction.controller;

import org.example.highlight_spring_transaction.Entity.Person;
import org.example.highlight_spring_transaction.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    TransactionService transactionService;


    @RequestMapping("/rollback")
    public Person rollback(Person person) {
        return transactionService.savePersonWithRollBack(person);
    }

    @RequestMapping("/norollback")
    public Person norollback(Person person) {
        return transactionService.savePersonWithoutRollBack(person);
    }


}
