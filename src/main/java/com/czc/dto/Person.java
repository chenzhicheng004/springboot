package com.czc.dto;

import com.alibaba.fastjson.annotation.JSONField;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

/**
 * Created by shiqian on 2018-04-26
 */
public class Person {

    private Long id;

    @Size(min = 3,max = 6)
    private String name;

//    @JSONField(serialize = false)
    @Digits(integer = 2,fraction = 0)
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
