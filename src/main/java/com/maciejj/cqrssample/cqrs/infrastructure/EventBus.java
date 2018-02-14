package com.maciejj.cqrssample.cqrs.infrastructure;

import com.maciejj.cqrssample.cqrs.infrastructure.eventHandlers.IEventHandler;
import com.maciejj.cqrssample.cqrs.infrastructure.events.CreateMicroserviceTemplateEvent;
import com.maciejj.cqrssample.cqrs.infrastructure.events.Event;

import java.util.Map;
import java.util.NoSuchElementException;

public class EventBus implements IEventSender {

    private Map<Class<? extends Event>, IEventHandler> eventHandlers;

    public EventBus(Map<Class<? extends Event>, IEventHandler> eventHandlers) {
        this.eventHandlers = eventHandlers;
    }

    @Override
    public <T extends Event> void send(T event) {
        IEventHandler handler = eventHandlers.get(event.getClass());
        if (handler != null){
            handler.Handle(event);
        } else {
            throw new NoSuchElementException("Map does not contain provided value");
        }
    }
}
