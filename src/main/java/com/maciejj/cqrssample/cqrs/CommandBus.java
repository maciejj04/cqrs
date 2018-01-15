package com.maciejj.cqrssample.cqrs;

import com.maciejj.cqrssample.cqrs.commands.Command;

import java.util.Map;

public class CommandBus {

    private Map<?, ICommandHandler> commandHandlers;

    public CommandBus(Map<?, ICommandHandler> commandHandlers) {
        this.commandHandlers = commandHandlers;
    }

    public <T extends Command> void send(T command){

    }

}
