package com.czc.service.impl;

import com.czc.domain.Test;
import com.czc.dto.Person;
import com.czc.service.TestService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shiqian on 2018-04-25
 */
@Service("testService2")
public class TestServiceImpl2 implements TestService {
    @Override
    public String sayHello() {
        return "hello2...";
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
}
