package com.maciejj.cqrssample.cqrs.endpoints.read;

import com.maciejj.cqrssample.cqrs.domain.ApplicationTemplatesRepository;
import com.maciejj.cqrssample.cqrs.domain.readModels.ApplicationTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
public class ReadTemplateRestService {
    // To be implemented later. For now just for manual testing.
    ApplicationTemplatesRepository repository;

    public ReadTemplateRestService(ApplicationTemplatesRepository repository) {
        this.repository = repository;
    }

    @Transactional
    @RequestMapping(method = RequestMethod.GET, path = "/templates")
    public Iterable<ApplicationTemplate> getAllTemplates(){
        return repository.findAll();
    }

}
