package com.maciejj.cqrssample.cqrs.infrastructure.eventHandlers;

import com.maciejj.cqrssample.cqrs.infrastructure.events.Event;

public interface IEventHandler<T extends Event> {
    void Handle(T event);
}
