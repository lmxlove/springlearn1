package com.example.springlearn1.Dao;

import com.example.springlearn1.Entity.StudentEntity;
import com.example.springlearn1.Entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {

  List<UserEntity> findAll();
}
