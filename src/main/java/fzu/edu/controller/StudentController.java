package fzu.edu.controller;

import fzu.edu.dto.Result;
import fzu.edu.server.StudentServer;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用于处理学生相关的API请求
 */
@RestController
public class StudentController {

    private StudentServer studentServer;

    /**
     * 构造函数注入
     */
    @Autowired
    public StudentController(StudentServer studentServer) {
        this.studentServer = studentServer;
    }

    /**
     * 学生登录认证
     */
    @PostMapping(value = "/login")
    public Result login(@Param("id") String id, @Param("password") String password) {
        return studentServer.login(id, password);
    }

}
