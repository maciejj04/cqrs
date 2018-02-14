package com.maciejj.cqrssample.cqrs.domain.writeModels;

import java.util.Map;

public class ApplicationTemplateDomain {

    private String name;
    private String description;
    private String nativeLanguage;
    private Map<String, String> techStack;
    private String dockerImageUrl;

    public ApplicationTemplateDomain(String name, String description, String nativeLanguage, Map<String, String> techStack, String dockerImageUrl) {
        this.name = name;
        this.description = description;
        this.nativeLanguage = nativeLanguage;
        this.techStack = techStack;
        this.dockerImageUrl = dockerImageUrl;
    }
}
