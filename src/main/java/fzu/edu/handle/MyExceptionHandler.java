package fzu.edu.handle;


import fzu.edu.dto.Result;
import fzu.edu.enums.ResultEnum;
import fzu.edu.exception.MyException;
import fzu.edu.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用于捕获异常
 */
@ControllerAdvice
public class MyExceptionHandler {

    private final static Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {

        if (e instanceof MyException) {
            MyException myException = (MyException) e;
            return ResultUtil.error(myException.getResultEnum());
        } else if(e instanceof DuplicateKeyException){
            logger.error("【主键冲突异常】", e);
            return ResultUtil.error(ResultEnum.DUPLICATE_ID);
        }
        logger.error("【系统异常】", e);
        return ResultUtil.error(ResultEnum.UN_KNOW_ERROR);
    }
}
