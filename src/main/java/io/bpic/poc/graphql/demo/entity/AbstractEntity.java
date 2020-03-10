package io.bpic.poc.graphql.demo.entity;

import lombok.Getter;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Created: 10/31/19 10:39 AM.
 *
 * @author palermo
 */
@XmlTransient
@XmlAccessorType(XmlAccessType.FIELD)
@MappedSuperclass
public abstract class AbstractEntity {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    public Long id;

}
