package com.maciejj.cqrssample.cqrs.endpoints.read;

import com.maciejj.cqrssample.cqrs.domain.ApplicationTemplatesWriteRepository;
import com.maciejj.cqrssample.cqrs.domain.ApplicationTemplateModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
public class ReadTemplateRestService {
    // To be implemented later. For now just for manual testing.
    ApplicationTemplatesWriteRepository repository;

    public ReadTemplateRestService(ApplicationTemplatesWriteRepository repository) {
        this.repository = repository;
    }

    @Transactional
    @RequestMapping(method = RequestMethod.GET, path = "/templates")
    public Iterable<ApplicationTemplateModel> getAllTemplates(){
        return repository.findAll();
    }

}
