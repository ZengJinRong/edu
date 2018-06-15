package fzu.edu.controller;

import fzu.edu.dto.Result;
import fzu.edu.server.CourseServer;
import fzu.edu.util.ResultUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用于处理课程相关的API请求
 */
@RestController
public class CourseController {

    private CourseServer courseServer;

    /**
     * 构造函数注入
     */
    @Autowired
    public CourseController(CourseServer courseServer) {
        this.courseServer = courseServer;
    }

    /**
     * 查询所有课程
     */
    @GetMapping(value = "/courseAll")
    public Result findAll() {
        return courseServer.findAll();
    }

    /**
     * 查询指定id课程
     */
    @GetMapping(value = "/course")
    public Result findById(@Param("id") String id) {
        return courseServer.findById(id);
    }
}
