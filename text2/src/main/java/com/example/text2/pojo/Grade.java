package com.example.text2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grade {
    private int studentId;
    private int courseId;
    private Date time;
    private int score;



}
