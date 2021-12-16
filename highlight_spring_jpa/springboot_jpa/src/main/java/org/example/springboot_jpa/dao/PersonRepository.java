package org.example.springboot_jpa.dao;

import org.example.springboot_jpa.domain.Person;
import org.example.support.CustomRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends CustomRepository<Person, Long> {
    List<Person> findByAddress(String name);

    Person findByNameAndAddress(String name,String address);
    
    @Query("select p from Person p where p.name= :name and p.address= :address")
    Person withNameAndAddressQuery(@Param("name")String name, @Param("address")String address);

    // 使用 @NamedQuery 查询： 在实体类Person上添加了 @NamedQuery 的定义
    List<Person> withNameAndAddressNamedQuery(String name, String address);
}
