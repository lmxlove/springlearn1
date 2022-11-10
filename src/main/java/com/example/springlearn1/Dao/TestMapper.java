package com.example.springlearn1.Dao;
import  com.example.springlearn1.Entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * @author 我不是大佬
 */
@Repository
public interface TestMapper {
    UserEntity getUserInfo(int id);

   String test(UserEntity userEntity);
   Integer get(UserEntity userEntity);
   Integer update(UserEntity userEntity);
   Integer delete(UserEntity userEntity);
}
