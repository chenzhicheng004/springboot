package com.czc.web.controller;

import com.czc.domain.Test;
import com.czc.dto.Person;
import com.czc.service.TestService;
import com.czc.utils.SpringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by shiqian on 2018-04-25
 */
@RestController
public class TestController {

    private static Logger logger = Logger.getLogger(TestController.class);

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private TestService testService;

    @Autowired
    private TestService helloService;

    @Autowired
    private TestService testService4;

    @RequestMapping("/")
    public String home() {
        logger.debug("hello......");
        return testService.sayHello();
    }

    @RequestMapping("/getPerson")
    public Person getPerson(Long id) {
        return testService.getPersonById(id);
    }

    @RequestMapping("/testSpringUtils")
    public String testSpringUtils() {
        Object obj = SpringUtils.getBeanByName("testService");
        if (obj != null) {
            return obj.getClass().getName();
        }
        return "null";
    }

    @RequestMapping("/uploadFile")
    @ResponseBody
    public String uploadFile(MultipartFile file) {
        try {
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));
            out.write(file.getBytes());
            out.flush();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "上传失败," + e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败," + e.getMessage();
        }
        return "上传成功";
    }

    @RequestMapping("/testXml")
    public String testXml() {
        logger.info("request testxml...");
        return helloService.sayHello();
    }

    @RequestMapping("/testBeanRegistry")
    public String testBeanRegistry() {
        return testService4.sayHello();
    }

    @RequestMapping("/testMybatis")
    @ResponseBody
    public Test testMybatis(Long id) {
        return testService.getById(id);
    }

    @RequestMapping("/testMybatis2")
    @ResponseBody
    public List<Test> testMybatis() {
        return testService.getAll();
    }

    @RequestMapping("/testMybatis3")
    @ResponseBody
    public Long testMybatis3(Test test) {
        testService.insertTest(test);
        return test.getId();
    }

    @RequestMapping("/testAop")
    @ResponseBody
    public String testAop() {
        return "success";
    }

    @RequestMapping("/testMail")
    @ResponseBody
    public String testMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("shiqian@ywwl.com");
        message.setTo("1969212650@qq.com");
        message.setSubject("测试邮件（邮件主题）");
        message.setText("这是邮件内容");

        mailSender.send(message);
        return "success";
    }

    @RequestMapping("/testValidate")
    @ResponseBody
    public Object testValidate(@Valid Person person,BindingResult result) {
        if(result.hasErrors()){
            return result.getAllErrors();
        }
        return person;
    }
}
