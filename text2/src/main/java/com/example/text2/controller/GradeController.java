//package com.example.text2.controller;
//
//
//import com.example.text2.pojo.Course;
//import com.example.text2.pojo.Grade;
//import com.example.text2.service.CourseService;
//import com.example.text2.service.GradeService;
//import com.example.text2.util.GeneralResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Date;
//
//@RestController
//public class GradeController {
//    @Autowired
//
//    private GradeService gradeService;
//    @GetMapping("/grades")
//    //全部改成success方便前端判断统一规则
//    public GeneralResponse greades() {
//
//        GeneralResponse response=new GeneralResponse();
//        response.setSuccess(true);
//        response.setData(gradeService.getAllGrades());
//        return response;
//
//    }
//
//    @PostMapping("/greade/add")
//    public  GeneralResponse add(@RequestParam int studentId, @RequestParam int courseId, @RequestParam Date time, @RequestParam int score) {
//        Grade grade=new Grade();
//        grade.setStudentId(studentId);
//        grade.setCourseId(courseId);
//        grade.setTime(time);
//        grade.setScore(score);
//        GeneralResponse response=new GeneralResponse();
//        response.setSuccess(true);
//        response.setData(gradeService.add(grade));
//
//        return response;
//    }
//    @PutMapping("/grade/update")
//    public  GeneralResponse update(@RequestParam int studentId, @RequestParam int courseId, @RequestParam Date time, @RequestParam int score) {
//        Grade grade=new Grade();
//        grade.setStudentId(studentId);
//        grade.setCourseId(courseId);
//        grade.setTime(time);
//        grade.setScore(score);
//        GeneralResponse response=new GeneralResponse();
//        response.setSuccess(true);
//        response.setData(gradeService.add(grade));
//
//        return response;
//    }
//    @PostMapping("/grade/delete")
//    public  GeneralResponse delete(@RequestParam int studentId, @RequestParam int courseId) {
//        GeneralResponse response=new GeneralResponse();
//        response.setSuccess(true);
//        response.setData(gradeService.deleteById(studentId),gradeService.deleteById(courseId));
//        return response;
//    }
//
//
//}
