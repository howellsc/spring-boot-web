package com.howells.spring.boot.repository;

import com.howells.spring.boot.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chrish on 02/12/2021.
 */
@Repository
public interface PersonDao extends CrudRepository<Person, String> {

    /**
     * @param age .
     * @return .
     */
    List<Person> findByAge(int age);
}
