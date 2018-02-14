package com.maciejj.cqrssample.cqrs;

import com.maciejj.cqrssample.cqrs.domain.ApplicationTemplateModel;
import com.maciejj.cqrssample.cqrs.infrastructure.CommandBus;
import com.maciejj.cqrssample.cqrs.infrastructure.EventBus;
import com.maciejj.cqrssample.cqrs.infrastructure.commandHandlers.CreationCommandHandlers;
import com.maciejj.cqrssample.cqrs.infrastructure.commandHandlers.ICommandHandler;
import com.maciejj.cqrssample.cqrs.infrastructure.commands.Command;
import com.maciejj.cqrssample.cqrs.infrastructure.commands.CreateNewTemplateCommand;
import com.maciejj.cqrssample.cqrs.infrastructure.eventHandlers.CreationEventHandler;
import com.maciejj.cqrssample.cqrs.infrastructure.eventHandlers.IEventHandler;
import com.maciejj.cqrssample.cqrs.infrastructure.events.CreateMicroserviceTemplateEvent;
import com.maciejj.cqrssample.cqrs.infrastructure.events.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.HashMap;

@SpringBootApplication
@RestController
public class CqrsApplication implements WebMvcConfigurer{

	@Autowired
	CreationEventHandler creationEventHandler;

	@Bean public EventBus eventBus(){
		return new EventBus(new HashMap<Class<? extends Event>, IEventHandler>(){{
			put(CreateMicroserviceTemplateEvent.class, creationEventHandler);
		}});
	}

	@Bean public CreationCommandHandlers creationCommandHandlers()
	{ return new CreationCommandHandlers(); }

	@Bean public CommandBus commandBus(){
		return new CommandBus(new HashMap<Class<? extends Command>, ICommandHandler>(){{
			put(CreateNewTemplateCommand.class, creationCommandHandlers());
		}});
	}

	@RequestMapping(method = RequestMethod.GET, path = "/app-status")
	public String status(){
		return "Hey! It's Java based CQRS implementation";
	}

	public static void main(String[] args) {
		SpringApplication.run(CqrsApplication.class, args);
	}
}
