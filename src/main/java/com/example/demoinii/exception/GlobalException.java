package com.example.demoinii.exception;

import com.example.demoinii.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 全局异常处理
 */
@RestControllerAdvice
@Slf4j
public class GlobalException {
    @ExceptionHandler(MallExcetion.class)
    public Result mallException(MallExcetion mallException){
        log.error("业务异常："+mallException.getMsg());
        return Result.error(mallException.getStatus(),mallException.getMsg());
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result methodArgumentNotValidException(MethodArgumentNotValidException e){
        //将所有错误信息设置到集合中
        List<String> list = new ArrayList<String>();
        List<ObjectError> allErrors = e.getAllErrors();
        for(ObjectError error: allErrors){
            list.add(error.getDefaultMessage());
        }
        if(CollectionUtils.isEmpty(list)){
            log.error("业务异常：请求参数不合法");
            return Result.error(MallExcptionEum.PARAM_ERROR);
        }else {
            log.error("业务异常：请求参数不合法，"+list.toString());
            return Result.error(MallExcptionEum.PARAM_ERROR.getStatus(),list.toString());
        }
    }
    @ExceptionHandler(ConstraintViolationException.class)
    public Result constraintViolationException(ConstraintViolationException e){
        //将所有错误信息设置到集合中
        List<String> list = new ArrayList<String>();
        Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
        for(ConstraintViolation error: constraintViolations){
            list.add(error.getMessage());
        }
        if(CollectionUtils.isEmpty(list)){
            log.error("业务异常：请求参数不合法");
            return Result.error(MallExcptionEum.PARAM_ERROR);
        }else {
            log.error("业务异常：请求参数不合法，"+list.toString());
            return Result.error(MallExcptionEum.PARAM_ERROR.getStatus(),list.toString());
        }
    }
    @ExceptionHandler(Exception.class)
    public Result exception(Exception e){
        log.error("系统异常："+e.getMessage());
        return Result.error(MallExcptionEum.SYSTEM_ERROR);
    }
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Result missingServletRequestParameterException(MissingServletRequestParameterException e){
        log.error("系统异常："+e.getMessage());
        return Result.error(MallExcptionEum.SYSTEM_REQUEST_PARAMETER);
    }

}