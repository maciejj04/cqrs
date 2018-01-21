package com.maciejj.cqrssample.cqrs.commandHandlers;

import com.maciejj.cqrssample.cqrs.commands.Command;

public interface ICommandHandler<T extends Command> {
    void Handle(T command);
}
