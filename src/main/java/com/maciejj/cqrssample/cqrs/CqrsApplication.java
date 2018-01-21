package com.maciejj.cqrssample.cqrs;

import com.maciejj.cqrssample.cqrs.commandHandlers.CreationCommandHandlers;
import com.maciejj.cqrssample.cqrs.commandHandlers.ICommandHandler;
import com.maciejj.cqrssample.cqrs.commands.Command;
import com.maciejj.cqrssample.cqrs.commands.CreateNewTemplateCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

@SpringBootApplication
@RestController
public class CqrsApplication implements WebMvcConfigurer{

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
