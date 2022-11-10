package com.example.springlearn1.Service.impl;

import com.example.springlearn1.Dao.TestMapper;
import com.example.springlearn1.Entity.UserEntity;
import com.example.springlearn1.Service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author <lmx>
 * @since 2022/11/9 19:45
 */
@Service
public class TestServiceImpl implements TestService {
  @Resource
  private TestMapper testMapper;
  @Override
  public String getName() {
    return null;
  }

  @Override
  public Integer getAge() {
    return null;
  }

  @Override
  public String test() {
    return testMapper.test(new UserEntity());
  }

  @Override
  public Integer get() {
    return testMapper.get(new UserEntity());
  }

  @Override
  public Integer update() {
    return testMapper.update(new UserEntity());
  }

  @Override
  public Integer delete() {
    return testMapper.delete(new UserEntity());
  }
  @Override
  public  UserEntity getUserInfo(int id){
    return testMapper.getUserInfo(id);
  }


}
