package com.example.demo.mapper;

import com.example.demo.bean.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface PersonMapper {
    Person sel(int id);

    List<Person> selAll();

    //int ins(Person person);
}

