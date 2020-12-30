package com.example.demo.controller;


import com.example.demo.bean.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @ResponseBody
    @RequestMapping("/getOne")
    public String sel(){
       Person person= personService.sel(1);
        return person.toString();
    }


    @ResponseBody
    @RequestMapping("/getAll")
    public String selAll(){
        List<Person> list= personService.selAll();
        return list.toString();
    }

    @RequestMapping("/ins")
    @ResponseBody
    public int ins(Person person){
//        person.setName("ins");
//        person.setAge(19);
//        person.setSex("男");
        personService.ins(person);
        return person.getId();
    }

    @RequestMapping("/upd")
    @ResponseBody
    public String upd(Person person){
        personService.upd(person);
        return person.toString();
    }



}
