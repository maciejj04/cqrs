package com.maciejj.cqrssample.cqrs.commandHandlers;

import com.maciejj.cqrssample.cqrs.commands.CreateNewTemplateCommand;
import com.maciejj.cqrssample.cqrs.domain.ApplicationTemplatesRepository;
import com.maciejj.cqrssample.cqrs.domain.readModels.ApplicationTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

public class CreationCommandHandlers implements ICommandHandler<CreateNewTemplateCommand> {

    @Autowired
    ApplicationTemplatesRepository repository;

    @Override
    public void Handle(CreateNewTemplateCommand command) {
        repository.save(new ApplicationTemplate(command.getName()));
    }
}
