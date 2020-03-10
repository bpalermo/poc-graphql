package io.bpic.poc.graphql.demo.graphql;

import io.bpic.poc.graphql.demo.entity.person.Person;
import io.bpic.poc.graphql.demo.service.PersonService;
import org.eclipse.microprofile.graphql.*;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

/**
 * Created: 3/8/20 3:40 PM.
 *
 * @author palermo
 */
@org.eclipse.microprofile.graphql.GraphQLApi
@RequestScoped
public class GraphQLApi {

    @Inject
    private PersonService service;

    @Query
    @Description("Get a person using the person's Id")
    public Person getPerson(@Name("id") Long id){
        return service.findByPk(id);
    }

    @Query
    public List<Person> getPeople(@Name("limit") Integer limit,
                                  @Name("offset") Integer offset){
        return service.findAll(limit, offset);
    }

}
