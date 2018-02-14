package com.maciejj.cqrssample.cqrs.infrastructure.commandHandlers;

import com.maciejj.cqrssample.cqrs.infrastructure.commands.Command;

public interface ICommandHandler<T extends Command> {
    void Handle(T command);
}
