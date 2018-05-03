package com.czc.service.impl;

import com.czc.dao.PersonDao;
import com.czc.dao.mapper.TestMapper;
import com.czc.domain.Test;
import com.czc.dto.Person;
import com.czc.service.TestService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shiqian on 2018-04-25
 */
@Service("testService")
public class TestServiceImpl implements TestService {

    @Autowired
    private PersonDao personDao;

    @Autowired
    private TestMapper testMapper;

    @Override
    public String sayHello() {
        return "hello...";
    }

    @Override
    public Person getPersonById(Long id) {
        return personDao.getPersonById(id);
    }

    @Override
    public Test getById(Long id) {

        return testMapper.getById(id);
    }

    @Override
    public List<Test> getAll() {
        PageHelper.startPage(1, 2);
        return testMapper.getAll();
    }
}
