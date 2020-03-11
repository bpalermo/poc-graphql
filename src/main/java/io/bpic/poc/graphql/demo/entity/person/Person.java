package io.bpic.poc.graphql.demo.entity.person;

import io.bpic.poc.graphql.demo.entity.AbstractEntity;
import io.bpic.poc.graphql.demo.entity.book.Book;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.HashSet;
import java.util.Set;

/**
 * Created: 3/8/20 3:45 PM.
 *
 * @author palermo
 */
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "person")
public class Person extends AbstractEntity {

    @Getter @Setter
    private String name;

    @Getter @Setter
    @Column(name = "last_name")
    private String lastName;

    @Getter
    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
    private Set<Book> books = new HashSet<>();

}
