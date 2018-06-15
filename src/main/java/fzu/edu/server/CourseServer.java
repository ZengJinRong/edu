package fzu.edu.server;

import fzu.edu.dao.CourseDao;
import fzu.edu.dto.Result;
import fzu.edu.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用于处理课程相关业务逻辑
 */
@Service
public class CourseServer {

    private CourseDao courseDao;

    /**
     * 构造函数注入
     */
    @Autowired(required = false)
    public CourseServer(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    /**
     * 查询所有课程
     */
    public Result findAll(){
        return ResultUtil.success(courseDao.findAll());
    }

    /**
     * 通过课程号查询课程
     */
    public Result findById(String id) {
        return ResultUtil.success(courseDao.findById(id));
    }

}
