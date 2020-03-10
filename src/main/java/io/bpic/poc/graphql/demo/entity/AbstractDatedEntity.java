package io.bpic.poc.graphql.demo.entity;

import lombok.Getter;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import java.time.Clock;
import java.time.LocalDateTime;

/**
 * Created: 10/31/19 10:39 AM.
 *
 * @author palermo
 */
@XmlTransient
@XmlAccessorType(XmlAccessType.FIELD)
@MappedSuperclass
public abstract class AbstractDatedEntity extends AbstractEntity {

    @Getter
    @JsonbTransient
    @XmlTransient
    @Column(name = "modified_at")
    private LocalDateTime modifiedAt;

    @Getter
    @JsonbTransient
    @XmlElement
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @PrePersist
    public void persist() {
        if (this.createdAt == null) {
            this.createdAt = LocalDateTime.now(Clock.systemUTC());
        }
    }

    @PreUpdate
    public void update() {
        this.modifiedAt = LocalDateTime.now(Clock.systemUTC());
    }

}
