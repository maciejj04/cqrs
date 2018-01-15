package com.maciejj.cqrssample.cqrs.endpoints;

import com.maciejj.cqrssample.cqrs.domain.readModels.ApplicationTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController(value = "${base.context.path}")
public class CreateApplicationTemplateRestService {

    @RequestMapping(method = RequestMethod.GET, path = "/templates")
    public List<ApplicationTemplate> getAllTemplates(){
        return Arrays.asList(new ApplicationTemplate("dupa"));
    }
}
