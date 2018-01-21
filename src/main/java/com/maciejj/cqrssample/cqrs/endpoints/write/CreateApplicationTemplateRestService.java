package com.maciejj.cqrssample.cqrs.endpoints.write;

import com.maciejj.cqrssample.cqrs.CommandBus;
import com.maciejj.cqrssample.cqrs.commands.CreateNewTemplateCommand;
import com.maciejj.cqrssample.cqrs.domain.readModels.ApplicationTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@RestController
public class CreateApplicationTemplateRestService {

    CommandBus commandBus;

    public CreateApplicationTemplateRestService(CommandBus commandBus) {
        this.commandBus = commandBus;
    }

    @Transactional
    @RequestMapping(method = RequestMethod.POST, path = "/create-template")
    public void createTemplate(@RequestBody CreateNewTemplateCommand command){   // TODO: Create proper response types.
        commandBus.send(command);
    }


}
