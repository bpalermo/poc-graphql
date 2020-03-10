package io.bpic.poc.graphql.demo.service;

import io.bpic.poc.graphql.demo.entity.person.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created: 3/10/20 12:57 PM.
 *
 * @author palermo
 */
public class PersonService {

    @PersistenceContext
    EntityManager em;

    public List<Person> findAll(int offset, int limit) {

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Person> query = cb.createQuery(Person.class);
        Root<Person> person = query.from(Person.class);

        query.select(person);

        return em.createQuery(query)
                .setFirstResult(offset)
                .setMaxResults(limit)
                .getResultList();
    }

    public Person findByPk(Long id) {
        return em.find(Person.class, id);
    }
}
