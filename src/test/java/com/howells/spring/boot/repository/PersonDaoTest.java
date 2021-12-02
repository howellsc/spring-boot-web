package com.howells.spring.boot.repository;

import com.howells.spring.boot.entity.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by chrish on 02/12/2021.
 */
@DataJpaTest
public class PersonDaoTest {
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private PersonDao personDao;

    @BeforeEach
    public void setUp()
    {
        Person person = Person.builder().name("Chris").age(12).build();
        Person person2 = Person.builder().name("Lucy").age(30).build();
        entityManager.persist(person);
        entityManager.persist(person2);
    }

    @Test
    public void testFindByAge()
    {
        List<Person> persons = personDao.findByAge(12);
        Assertions.assertEquals(1, persons.size());
        Assertions.assertEquals("Chris", persons.get(0).getName());
    }
}
