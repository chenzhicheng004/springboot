package com.czc.dao.mapper;

import com.czc.domain.Test;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by shiqian on 2018-04-27
 */
@Mapper
public interface TestMapper {

    @Select("select * from test where id = #{id}")
    @Results({@Result(property = "finalName", column = "final_name")})
    Test getById(Long id);

    @Select("select * from test")
    @Results({@Result(property = "finalName", column = "final_name")})
    List<Test> getAll();

    @Insert("insert into test(name,age,final_name) values(#{name},#{age},#{finalName})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insert(Test test);
}
