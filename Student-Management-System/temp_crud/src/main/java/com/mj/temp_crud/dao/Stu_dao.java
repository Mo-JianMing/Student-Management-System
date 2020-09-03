package com.mj.temp_crud.dao;

import com.mj.temp_crud.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Stu_dao {
    void save(Student student);
    void del(String S_id);
    void update(Student student);
    List<Student> studs();
}
