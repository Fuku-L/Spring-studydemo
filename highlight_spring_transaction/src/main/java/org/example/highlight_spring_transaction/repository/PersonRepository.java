package org.example.highlight_spring_transaction.repository;


import org.example.highlight_spring_transaction.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PersonRepository extends JpaRepository<Person, Long> {
}
