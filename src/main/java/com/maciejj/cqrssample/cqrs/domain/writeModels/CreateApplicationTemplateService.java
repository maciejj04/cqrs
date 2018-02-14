package com.maciejj.cqrssample.cqrs.domain.writeModels;

import com.maciejj.cqrssample.cqrs.infrastructure.CommandBus;
import com.maciejj.cqrssample.cqrs.infrastructure.commands.CreateNewTemplateCommand;
import org.springframework.stereotype.Component;

@Component
public class CreateApplicationTemplateService {

    CommandBus commandBus;

    public CreateApplicationTemplateService(CommandBus commandBus) {
        this.commandBus = commandBus;
    }

    public void create(CreateNewTemplateCommand command){
        commandBus.send(command);
    }
}
