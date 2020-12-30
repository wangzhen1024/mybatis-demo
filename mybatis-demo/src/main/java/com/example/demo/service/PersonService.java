package com.example.demo.service;

import com.example.demo.bean.Person;

import java.util.List;

public interface PersonService {

    Person sel(int id);

    List<Person> selAll();

    int ins(Person person);

    int upd(Person person);
}
