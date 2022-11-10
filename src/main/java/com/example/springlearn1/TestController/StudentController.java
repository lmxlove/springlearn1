package com.example.springlearn1.TestController;

import com.example.springlearn1.Entity.StudentEntity;
import com.example.springlearn1.Entity.UserEntity;
import com.example.springlearn1.Service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author <lmx>
 * @since 2022/11/10 15:51
 */
@RestController
public class StudentController {
  @Resource
  private StudentService studentService;

@RequestMapping("/findAll")
  public List<UserEntity> findAll(){
  return studentService.findAll();
}

}
