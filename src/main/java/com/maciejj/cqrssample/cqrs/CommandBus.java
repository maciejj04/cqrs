package com.maciejj.cqrssample.cqrs;

import com.maciejj.cqrssample.cqrs.commandHandlers.ICommandHandler;
import com.maciejj.cqrssample.cqrs.commands.Command;

import java.util.Map;
import java.util.NoSuchElementException;

public class CommandBus {

    private Map<?, ICommandHandler> commandHandlers;

    public CommandBus(Map<Class<? extends Command>, ICommandHandler> commandHandlers) {
        this.commandHandlers = commandHandlers;
    }

    public <T extends Command> void send(T command){
        ICommandHandler<T> handler = commandHandlers.get(command.getClass());
        if(handler != null){
            handler.Handle(command);
        } else {
            throw new NoSuchElementException("Map does not contain provided value");
        }
    }
}
