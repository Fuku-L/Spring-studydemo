package org.example.highlight_spring_transaction.service;

import org.example.highlight_spring_transaction.Entity.Person;

public interface TransactionService {
    public Person savePersonWithRollBack(Person person);
    public Person savePersonWithoutRollBack(Person person) ;
}
