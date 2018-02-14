package com.maciejj.cqrssample.cqrs.infrastructure.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class CreateNewTemplateCommand implements Command {
    @Getter @Setter
    String name;
}
