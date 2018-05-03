package com.czc.dao.impl;

import com.czc.dao.PersonDao;
import com.czc.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by shiqian on 2018-04-26
 */
@Repository("personDao")
public class JdbcPersonDaoImpl implements PersonDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Person getPersonById(Long id) {
        Person p = jdbcTemplate.queryForObject("select * from person where id = " + id, new RowMapper<Person>() {
            @Override
            public Person mapRow(ResultSet resultSet, int i) throws SQLException {
                Person p = new Person();
                String name = resultSet.getString("name");
                p.setName(name);
                Integer age = resultSet.getInt("age");
                p.setAge(age);
                return p;
            }
        });
        return p;
    }
}
