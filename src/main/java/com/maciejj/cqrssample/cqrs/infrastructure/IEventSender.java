package com.maciejj.cqrssample.cqrs.infrastructure;

import com.maciejj.cqrssample.cqrs.infrastructure.events.Event;

public interface IEventSender{
    <T extends Event> void send(T event);
}
