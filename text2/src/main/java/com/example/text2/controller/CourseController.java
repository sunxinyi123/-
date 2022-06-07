package com.example.text2.controller;

import com.example.text2.pojo.Course;
import com.example.text2.pojo.User;
import com.example.text2.service.CourseService;
import com.example.text2.util.GeneralResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {
    @Autowired

    private CourseService courseService;
    @GetMapping("/courses")
    //全部改成success方便前端判断统一规则
    public GeneralResponse courses() {

        GeneralResponse response=new GeneralResponse();
        response.setSuccess(true);
        response.setData(courseService.getAllCourses());
        return response;

    }

    @PostMapping("/course/add")
    public  GeneralResponse add(@RequestParam String courseName,@RequestParam String  teacherName) {
        Course course=new Course();
       course.setCourseName(courseName);
       course.setTeacherName(teacherName);

        GeneralResponse response=new GeneralResponse();
        response.setSuccess(true);
        response.setData( courseService.add(course));

        return response;
    }

    @PutMapping("/course/update")
    public  GeneralResponse update(@RequestParam String courseName,@RequestParam String  teacherName,@RequestParam int id) {
        Course course=new Course();
        course.setId(id);
        course.setCourseName(courseName);
        course.setTeacherName(teacherName);

        GeneralResponse response=new GeneralResponse();
        response.setSuccess(true);
        response.setData( courseService.add(course));

        return response;
    }
    @PostMapping("/course/delete")
    public  GeneralResponse delete(@RequestParam int id) {


        GeneralResponse response=new GeneralResponse();
        response.setSuccess(true);
        response.setData( courseService.deleteById(id));

        return response;
    }
    @GetMapping ("/course")
    public  GeneralResponse userById(@RequestParam int id) {


        GeneralResponse response=new GeneralResponse();
        response.setSuccess(true);
        List<Course> result=new ArrayList<>();
        result.add(courseService.getById(id));
        response.setData(result);
        return response;
    }
}
