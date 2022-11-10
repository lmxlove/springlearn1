package com.example.springlearn1.Service;

import com.example.springlearn1.Entity.UserEntity;

public interface TestService  {
  String getName();

  Integer getAge();

  String test();



  Integer get();

  Integer update();

  Integer delete();

  UserEntity getUserInfo(int id);
}
