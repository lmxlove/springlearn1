package com.example.springlearn1.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author <lmx>
 * @since 2022/11/10 15:37
 */
@Data
@NoArgsConstructor
public class StudentEntity {
  private  Integer  id;
  private  Integer stuno;
  private  String name;
  private  Integer age;
  private  Integer classId;

  public StudentEntity(Integer id, Integer stuno, String name, Integer age, Integer classId) {
    this.id = id;
    this.stuno = stuno;
    this.name = name;
    this.age = age;
    this.classId = classId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getStuno() {
    return stuno;
  }

  public void setStuno(Integer stuno) {
    this.stuno = stuno;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Integer getClassId() {
    return classId;
  }

  public void setClassId(Integer classId) {
    this.classId = classId;
  }

  @Override
  public String toString() {
    return "StudentEntity{" +
            "id=" + id +
            ", stuno=" + stuno +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", classId=" + classId +
            '}';
  }
}
