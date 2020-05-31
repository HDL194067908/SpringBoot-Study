package com.boot.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
///全局异常处理器
@ControllerAdvice
public class GlobalExceptionHandle {

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Map<String, Object> handleException(Exception exception){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("errorCode",500);
		map.put("errorMsg", exception.toString());
		return map;
	}
}
