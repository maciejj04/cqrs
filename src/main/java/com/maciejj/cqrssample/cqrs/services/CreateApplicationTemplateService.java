package com.maciejj.cqrssample.cqrs.services;

import com.maciejj.cqrssample.cqrs.commands.CreateNewTemplateCommand;
import com.maciejj.cqrssample.cqrs.domain.ApplicationTemplatesRepository;
import com.maciejj.cqrssample.cqrs.domain.readModels.ApplicationTemplate;
import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateApplicationTemplateService {

    @Autowired
    ApplicationTemplatesRepository repository;

    public void create(CreateNewTemplateCommand request){

//        repository.save()
    }
}
