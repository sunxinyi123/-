package com.example.text2.service;

import com.example.text2.dao.GradeDao;
import com.example.text2.pojo.Grade;
import com.example.text2.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {
    @Autowired
    private GradeDao gradeDao;
    public List<Grade> getAllGrades(){
        return gradeDao.getAll();

    }
    public int add(Grade grade){
        return gradeDao.addGrade(grade);
    }
    public int update(Grade grade){
        return gradeDao.updateGrade(grade);
    }
    public int  deleteById(int studentId,int courseId){//根据ID号删除
        return gradeDao.deleteGradeById(studentId,courseId);

    }
    public  Grade  getById(int studentId,int courseId){
        return gradeDao.getGradeById(studentId,courseId);//根据id号来查询
    }
}
