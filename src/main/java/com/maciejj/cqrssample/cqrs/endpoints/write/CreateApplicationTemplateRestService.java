package com.maciejj.cqrssample.cqrs.endpoints.write;

import com.maciejj.cqrssample.cqrs.infrastructure.commands.CreateNewTemplateCommand;
import com.maciejj.cqrssample.cqrs.domain.writeModels.CreateApplicationTemplateService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
public class CreateApplicationTemplateRestService {

    CreateApplicationTemplateService createApplicationTemplateService;

    public CreateApplicationTemplateRestService(CreateApplicationTemplateService createApplicationTemplateService) {
        this.createApplicationTemplateService = createApplicationTemplateService;
    }

    @Transactional
    @RequestMapping(method = RequestMethod.POST, path = "/create-template")
    public void createTemplate(@RequestBody CreateNewTemplateCommand command){   // TODO: Create proper response types.
        createApplicationTemplateService.create(command);
    }


}
