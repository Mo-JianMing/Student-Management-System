package com.mj.temp_crud.controller;

import com.mj.temp_crud.dao.Stu_dao;
import com.mj.temp_crud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class Overall {
    @Autowired
    private Stu_dao stu_dao;

    @PostMapping("/add") //http://localhost:2020/crud/
    void s1(@RequestBody Student student) {
        stu_dao.save(student);
//        return "success";
    }

    @GetMapping("/del")
    void s2(String id) {
        stu_dao.del(id);
//        return "true";
    }

    @PostMapping("/upd")
    void s3(@RequestBody Student stu) {
        stu_dao.update(stu);
//        return "success";
    }

    @GetMapping("/sel")
    List<Student> s4() {
        return stu_dao.studs();
    }

}
