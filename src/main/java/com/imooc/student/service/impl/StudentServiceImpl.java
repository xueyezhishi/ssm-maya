package com.imooc.student.service.impl;

import com.imooc.mvcdemo.model.Chapter;
import com.imooc.mvcdemo.model.Course;
import com.imooc.student.model.Student;
import com.imooc.student.dao.StudentDAO;
import com.imooc.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Service("studentService")
class StudentServiceImpl implements StudentService {

	//@Resource
	@Autowired
	private StudentDAO studentDAO;

	public Student getStudentbyId(String studentId) {

		Student student = new Student();

		student.setStudentId("003");

		return student;
	}

	public Student getStudentbyId2(String studentId) {

		Student student = new Student();
		student = studentDAO.selectByPrimaryKey("001");

		return student;
	}

	public void create(Student student) {
		studentDAO.insert(student);
	}
}
