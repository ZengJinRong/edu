package fzu.edu.dao;

import fzu.edu.entiy.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 用于学生相关的数据库操作，具体SQL语句在 mapper/StudentMapper.xml
 */
@Mapper
public interface StudentDao {

    /**
     * 学生登录认证
     */
    Student login(@Param("id") String id,@Param("password") String password);

}
