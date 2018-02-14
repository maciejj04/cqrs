package com.maciejj.cqrssample.cqrs.infrastructure.commandHandlers;

import com.maciejj.cqrssample.cqrs.infrastructure.commands.CreateNewTemplateCommand;
import com.maciejj.cqrssample.cqrs.domain.ApplicationTemplatesWriteRepository;
import com.maciejj.cqrssample.cqrs.domain.ApplicationTemplateModel;
import org.springframework.beans.factory.annotation.Autowired;

public class CreationCommandHandlers implements ICommandHandler<CreateNewTemplateCommand> {

    @Autowired
    ApplicationTemplatesWriteRepository repository;

    @Override
    public void Handle(CreateNewTemplateCommand command) {
        repository.save(new ApplicationTemplateModel(null, event.getName(),event.getDescription(), event.getNativeLanguage(),
                event.getTechStack(), event.getDockerImageUrl(), "mock", event.getOwner(), 0)));
    }
}
