package com.example.springlearn1.TestController;

import com.example.springlearn1.Entity.UserEntity;
import com.example.springlearn1.Service.TestService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author <lmx>
 * @since 2022/11/9 19:36
 */
@RestController
public class TestController {
  @Resource
  private TestService testService;
  @RequestMapping("/name")
  public  String getName(){
    return testService.getName();
  }
  @RequestMapping("/age")
  public  Integer getAge(){
    return testService.getAge();
  }
  @RequestMapping("/test")
  public  String test(){
    return testService.test();
  }
  @RequestMapping("/get")
  public  Integer get(){
    return testService.get();
  }
  @RequestMapping("/update")
  public  Integer update(){
    return testService.update();
  }
  @RequestMapping("/delete")
  public  Integer delete(){
    return testService.delete();
  }
  @RequestMapping(value = "/getUserInfo/{id}")
  public String getUserInfo(@PathVariable Integer id){
    return testService.getUserInfo(id).toString();

  }

}
