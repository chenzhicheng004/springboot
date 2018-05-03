package com.czc.service;

import com.czc.domain.Test;
import com.czc.dto.Person;

import java.util.List;

/**
 * Created by shiqian on 2018-04-25
 */
public interface TestService {

    String sayHello();

    Person getPersonById(Long id);

    Test getById(Long id);

    List<Test> getAll();
}
