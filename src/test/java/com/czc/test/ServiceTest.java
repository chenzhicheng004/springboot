package com.czc.test;

import com.czc.Application;
import com.czc.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by shiqian on 2018-04-27
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = Application.class)
//@WebAppConfiguration
//@ActiveProfiles("prod")
public class ServiceTest {

//    @Autowired
    private TestService testService;

//    @Test
    public void test(){
        String str = testService.sayHello();
        System.out.println(str);
    }

}
