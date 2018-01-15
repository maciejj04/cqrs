package com.maciejj.cqrssample.cqrs.domain;

import com.maciejj.cqrssample.cqrs.domain.readModels.ApplicationTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationTemplatesRepository extends CrudRepository<ApplicationTemplate, Long> {
}
