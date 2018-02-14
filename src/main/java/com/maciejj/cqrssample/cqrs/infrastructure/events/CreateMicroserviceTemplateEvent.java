package com.maciejj.cqrssample.cqrs.infrastructure.events;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Column;
import java.util.Map;

@AllArgsConstructor
public class CreateMicroserviceTemplateEvent extends Event {
    private Long id;

    @Getter
    private String name;

    @Getter private String description;

    @Getter private String nativeLanguage;

    @Getter private Map<String,String> techStack;

    @Getter private String dockerImageUrl;

    @Getter private String owner;

    @Getter private int downloadCount;

}
