package com.example.springlearn1.Service.impl;

import com.example.springlearn1.Dao.StudentMapper;
import com.example.springlearn1.Entity.StudentEntity;
import com.example.springlearn1.Entity.UserEntity;
import com.example.springlearn1.Service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author <lmx>
 * @since 2022/11/10 15:47
 */
@Service
public class StudentServiceImpl implements StudentService {
  @Resource
  private StudentMapper studentMapper;


  @Override
  public List<UserEntity> findAll() {
    return studentMapper.findAll();
  }
}
