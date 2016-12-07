package com.example;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by doshest on 2016/9/30.
 */
@Mapper
public interface TestMapper {
    @Select("SELECT * FROM USER limit #{size}")
    List<User> selectBySize(@Param("size") int size);
}
