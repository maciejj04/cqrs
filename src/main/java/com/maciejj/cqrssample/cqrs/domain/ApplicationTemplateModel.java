package com.maciejj.cqrssample.cqrs.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Dictionary;
import java.util.Map;

@AllArgsConstructor
@Entity
@Table(name = "APPLICATION_TEMPLATE")
public class ApplicationTemplateModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    @Getter private String name;

    @Column(name = "DESCRIPTION")
    @Getter private String description;

    @Column(name = "NATIVE_LANGUAGE")
    @Getter private String nativeLanguage;

    @Column(name = "TECH_STACK")
    @Getter private Map<String,String> techStack;

    @Column(name = "DOKER_IMAGE_URL")
    @Getter private String dockerImageUrl;

    @Column(name = "GIT_URL")
    @Getter private String gitRepositoryUrl;

    @Column(name = "OWNER")
    @Getter private String owner;

    @Column(name = "DOWNLOAD_COUNT")
    @Getter private int downloadCount;
}
