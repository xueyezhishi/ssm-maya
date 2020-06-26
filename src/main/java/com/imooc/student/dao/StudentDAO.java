package com.imooc.student.dao;

import com.imooc.student.model.Student;

public interface StudentDAO {

    public Student selectByPrimaryKey(String studentId);

    public void insert(Student student);

}
