package fzu.edu.util;

import fzu.edu.dto.Result;
import fzu.edu.enums.ResultEnum;

/**
 * 用于生成反馈结果
 */
public class ResultUtil {

    public static Result success(Object object){
        Result result=new Result();
        result.setResultEnum(ResultEnum.SUCCESS);
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(ResultEnum resultEnum){
        Result result=new Result();
        result.setResultEnum(resultEnum);
        return result;
    }
}
