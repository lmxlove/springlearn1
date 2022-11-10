package com.example.springlearn1.Service;
import  com.example.springlearn1.Entity.StudentEntity;
import com.example.springlearn1.Entity.UserEntity;

import java.util.List;

public interface StudentService {

    List<UserEntity> findAll();


}
