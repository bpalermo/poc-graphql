package io.bpic.poc.graphql.demo.entity.book;

import io.bpic.poc.graphql.demo.entity.AbstractEntity;
import io.bpic.poc.graphql.demo.entity.person.Person;
import lombok.Getter;
import lombok.Setter;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Created: 3/10/20 1:36 PM.
 *
 * @author palermo
 */
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "book")
public class Book extends AbstractEntity {

    @Getter
    @Setter
    private String name;

    @Getter @Setter
    @JsonbTransient
    @ManyToOne
    @JoinColumn(name = "fk_person")
    private Person person;

}
