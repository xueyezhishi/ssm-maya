package com.imooc.student.controller;

import com.imooc.mvcdemo.model.Course;
import com.imooc.mvcdemo.service.CourseService;
import com.imooc.student.dao.StudentDAO;
import com.imooc.student.model.Student;
import com.imooc.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
    private static Logger log = LoggerFactory.getLogger(StudentController.class);

    private StudentService studentService;
    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value="/view", method= RequestMethod.GET)
    public String viewCourse(@RequestParam("studentid") Integer studentid,
                             Model model) {

        System.out.println("okok");
        log.info("In viewStudent, student = {}", studentid);
        return "student/student_view";
    }

    @RequestMapping(value="/list", method= RequestMethod.GET)
    public String viewCourse(Map<String, Object> model) {
        model.put("course","11");
        return "student/student_list2";
    }
    @RequestMapping("/add")
    public String add(HttpServletRequest request){
        return "student/student_add";
    }
    @RequestMapping(value="/edit", method = RequestMethod.GET, params = "edit")
    public String edit(){
        return "student/student_edit";
    }

    @RequestMapping(value="/create", method = RequestMethod.POST)
    public String create(@ModelAttribute Course course){
        return "student/student_add";
    }

    //http://localhost:8098/maya_war_exploded/student/getInfo/123
    @RequestMapping("/getInfo/{studentId}")
    public String getInfo(@PathVariable("studentId") String studentId,
                              Map<String, Object> model) {

    //    log.debug("In viewCourse2, courseId = {}", courseId);
        System.out.println(studentId);
        Student student = studentService.getStudentbyId2(studentId);
        model.put("student",student);
        return "student/student_edit";
    }

    //http://localhost:8098/maya_war_exploded/student/getInfoJson/123
    @RequestMapping("/getInfoJson/{studentId}")
    public @ResponseBody ModelAndView  getInfoJson(@PathVariable("studentId") String studentId,
                          Map<String, Object> model) {

        //    log.debug("In viewCourse2, courseId = {}", courseId);
        System.out.println(studentId);
        Student student = studentService.getStudentbyId2(studentId);
        model.put("student",student);
        return new ModelAndView(new MappingJackson2JsonView(), model);
    }

    @RequestMapping("/cteate222")
    public String cteate222(Student student, Model model) {
        try {
            System.out.println("break point");
            studentService.create(student);
            model.addAttribute("message", "保存客户信息系成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "student/student_list2";
    }
}
