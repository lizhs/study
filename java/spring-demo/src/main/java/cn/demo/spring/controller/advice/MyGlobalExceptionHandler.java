package cn.demo.spring.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyGlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponseBody> customException(Exception e) {
    	ExceptionResponseBody body=new ExceptionResponseBody();
    	body.setCode("11");
    	body.setMessage(e.getMessage());
    	
    	ResponseEntity<ExceptionResponseBody> ret=new ResponseEntity<>(body,HttpStatus.EXPECTATION_FAILED);
        return ret;
    }
}