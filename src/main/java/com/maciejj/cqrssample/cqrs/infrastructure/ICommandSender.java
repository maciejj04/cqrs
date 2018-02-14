package com.maciejj.cqrssample.cqrs.infrastructure;

import com.maciejj.cqrssample.cqrs.infrastructure.commands.Command;

public interface ICommandSender {
    <T extends Command> void send(T command);
}
