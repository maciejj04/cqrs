package com.maciejj.cqrssample.cqrs.domain.readModels;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "APPLICATION_TEMPLATE")
public class ApplicationTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "NAME")
    @Getter
    String name;

    public ApplicationTemplate(String name) {
        this.name = name;
    }


}
