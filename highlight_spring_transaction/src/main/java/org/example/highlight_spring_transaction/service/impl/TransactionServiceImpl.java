package org.example.highlight_spring_transaction.service.impl;

import org.example.highlight_spring_transaction.Entity.Person;
import org.example.highlight_spring_transaction.repository.PersonRepository;
import org.example.highlight_spring_transaction.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    PersonRepository personRepository;

    @Transactional(rollbackFor = {IllegalArgumentException.class})
    public Person savePersonWithRollBack(Person person) {
        Person p = personRepository.save(person);
        if (person.getName().equals("aa")) {
            throw new IllegalArgumentException(person.getName() + "已存在，数据将回滚！");
        }
        return p;
    }

    @Transactional(noRollbackFor = {IllegalArgumentException.class})
    public Person savePersonWithoutRollBack(Person person) {
        Person p = personRepository.save(person);
        if (person.getName().equals("aa")) {
            throw new IllegalArgumentException(person.getName() + "已存在，数据不会回滚！");
        }
        return p;
    }
}
