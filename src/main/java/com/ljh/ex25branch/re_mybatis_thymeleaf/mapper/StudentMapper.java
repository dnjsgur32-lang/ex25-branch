package com.ljh.ex25branch.re_mybatis_thymeleaf.mapper;

import com.ljh.ex25branch.re_mybatis_thymeleaf.domain.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> findAll ();

    @Select("SELECT * FROM student WHERE id = #{id}")
    Student findById (Long id);

    @Insert("INSERT  INTO student(name, email, age) \r\n"
            + " VALUES (#{name}, #{email}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert (Student student);

    @Update("UPDATE student\r\n"
            + " SET name = #{name}, email = #{email}, age = {age}\r\n"
            + " WHERE id = #{id}")
    void update (Student student);

    @Delete("DELETE FROM student WHERE id = #{id}")
    void delete (Long id);
}
