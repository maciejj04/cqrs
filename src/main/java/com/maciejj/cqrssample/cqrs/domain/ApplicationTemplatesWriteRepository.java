package com.maciejj.cqrssample.cqrs.domain;

import org.springframework.data.repository.CrudRepository;

public interface ApplicationTemplatesWriteRepository extends CrudRepository<ApplicationTemplateModel, Long> {
}
