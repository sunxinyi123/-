package com.example.text2.dao;

import com.example.text2.pojo.Grade;
import com.example.text2.pojo.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GradeDao {
    private JdbcTemplate jdbcTemplate;

    public List<Grade> getAll(){
        return jdbcTemplate.query("select *from grade ",new BeanPropertyRowMapper<>(Grade.class));
    }
    // 添加
    public  int addGrade(Grade grade){
        return jdbcTemplate.update("INSERT INTO grade(studentId,courseId,time,score) VALUES (?,?,?,?)",grade.getStudentId(),grade.getCourseId(),grade.getTime(),grade.getScore());
    }

    public  int updateGrade(Grade grade){
        return jdbcTemplate.update("UPDATE grade SET studentId=?,courseId=?,time=?,score=? WHERE id=?",grade.getStudentId(),grade.getCourseId(),grade.getTime(),grade.getScore());
    }
    public  int deleteGradeById(int studentId,int courseId){
        return jdbcTemplate.update("DELETE FROM grade WHERE studentId=? ,DELETE FROM grade WHERE courseId  ",studentId,courseId);

    }
    public  Grade getGradeById (int studentId,int courseId){
        return jdbcTemplate.queryForObject("select * from WHERE studentId=? ,DELETE FROM grade WHERE courseId ?",
                new BeanPropertyRowMapper<>(Grade.class),studentId,courseId);


    }

}
