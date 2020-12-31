package com.example.demo.service.impl;

import com.example.demo.bean.Person;
import com.example.demo.mapper.PersonMapper;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper mapper;

    @Override
    public Person sel(int id) {
        return mapper.sel(id);
    }

    @Override
    public List<Person> selAll() {
        return mapper.selAll();
    }

    @Override
    public int ins(Person person) {
        return mapper.ins(person);
    }

    @Override
    public int upd(Person person) {
        return mapper.upd(person);
    }


    @Transactional
    public void testTran(Person person){
        mapper.ins(person);
        throw new RuntimeException("运行时异常");

    }
}
