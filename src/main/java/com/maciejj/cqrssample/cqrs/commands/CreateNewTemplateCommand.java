package com.maciejj.cqrssample.cqrs.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class CreateNewTemplateCommand implements Command {

    @Getter @Setter String name;
}
