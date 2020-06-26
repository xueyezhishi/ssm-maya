package com.imooc.student.service;


import com.imooc.student.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {



	Student getStudentbyId(String studentId);

	Student getStudentbyId2(String studentId);

	public void create(Student student);

}
