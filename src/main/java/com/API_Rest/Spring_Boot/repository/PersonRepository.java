package com.API_Rest.Spring_Boot.repository;

import com.API_Rest.Spring_Boot.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByName(@Param("name") String name);
}
