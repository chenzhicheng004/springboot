package com.czc.service.impl;

import com.czc.domain.Test;
import com.czc.dto.Person;
import com.czc.service.TestService;

import java.util.List;

/**
 * Created by shiqian on 2018-04-27
 */
public class TestServiceImpl4 implements TestService {
    @Override
    public String sayHello() {
        return "44";
    }

    @Override
    public Person getPersonById(Long id) {
        return null;
    }

    @Override
    public Test getById(Long id) {
        return null;
    }

    @Override
    public List<Test> getAll() {
        return null;
    }

    @Override
    public long insertTest(Test test) {
        return 0;
    }


}
