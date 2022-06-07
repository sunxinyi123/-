package com.example.text2.pojo;

import java.sql.Blob;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private int password;
    private String classNo;
    private String sex;
    private String image;


}
