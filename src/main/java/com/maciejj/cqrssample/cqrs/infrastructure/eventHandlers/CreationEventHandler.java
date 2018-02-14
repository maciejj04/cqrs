package com.maciejj.cqrssample.cqrs.infrastructure.eventHandlers;

import com.maciejj.cqrssample.cqrs.domain.ApplicationTemplateModel;
import com.maciejj.cqrssample.cqrs.domain.ApplicationTemplatesReadRepository;
import com.maciejj.cqrssample.cqrs.infrastructure.events.CreateMicroserviceTemplateEvent;
import org.springframework.beans.factory.annotation.Autowired;

public class CreationEventHandler implements IEventHandler<CreateMicroserviceTemplateEvent>{

    @Autowired
    ApplicationTemplatesReadRepository repository;

    @Override
    public void Handle(CreateMicroserviceTemplateEvent event) {
        repository.save(new ApplicationTemplateModel(null, event.getName(),event.getDescription(), event.getNativeLanguage(),
                event.getTechStack(), event.getDockerImageUrl(), "mock", event.getOwner(), 0));
    }
}
