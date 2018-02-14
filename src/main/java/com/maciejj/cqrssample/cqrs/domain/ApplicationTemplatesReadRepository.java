package com.maciejj.cqrssample.cqrs.domain;

import org.springframework.data.repository.CrudRepository;

public interface ApplicationTemplatesReadRepository extends CrudRepository<ApplicationTemplateModel, Long> {
}
