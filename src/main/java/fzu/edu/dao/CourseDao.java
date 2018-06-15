package fzu.edu.dao;

import fzu.edu.entiy.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * 用于课程相关的数据库操作，具体SQL语句在 mapper/CourseMapper.xml
 */
@Mapper
public interface CourseDao {

    /**
     * 查询所有课程
     */
    Course findById(@Param("id") String id);

    /**
     * 查询指定id课程
     */
    ArrayList<Course> findAll();
}
