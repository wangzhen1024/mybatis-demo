package com.example.demo.controller;


import com.example.demo.bean.Person;
import com.example.demo.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonMapper mapper;

    @ResponseBody
    @RequestMapping("/getOne")
    public String sel(){
       Person person= mapper.sel(1);
        return person.toString();
    }


    @ResponseBody
    @RequestMapping("/getAll")
    public String selAll(){
        List<Person> list= mapper.selAll();
        return list.toString();
    }

}
