package fzu.edu.server;

import fzu.edu.dao.StudentDao;
import fzu.edu.dto.Result;
import fzu.edu.entiy.Student;
import fzu.edu.enums.ResultEnum;
import fzu.edu.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用于处理学生相关业务逻辑
 */
@Service
public class StudentServer {

    private StudentDao studentDao;

    /**
     * 构造函数注入
     */
    @Autowired(required = false)
    public StudentServer(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    /**
     * 学生登录
     */
    public Result login(String id, String password) {
        Student student = studentDao.login(id, password);
        if (student == null) {
            return ResultUtil.error(ResultEnum.LOGIN_ERROR);
        } else {
            return ResultUtil.success(student);
        }
    }

}
