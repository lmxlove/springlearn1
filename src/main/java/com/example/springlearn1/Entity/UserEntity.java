package com.example.springlearn1.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author <lmx>
 * @since 2022/11/10 11:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
  private  Integer id;
  private String name;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "UserEntity{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}
