package com.productapp.web.controller;

import org.springframework.dao.DataAccessException;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice  //Controller+ ThrowsAdvice
public class ExceptionHandlerController {
    private static final Logger logger = LogManager.getLogger(ExceptionHandlerController.class);
    @ExceptionHandler(NoHandlerFoundException.class)
    ModelAndView handle404(){
        System.out.println("-------------------------");
        ModelAndView mv=new ModelAndView();
        mv.addObject("error","page not found!");
        mv.setViewName("404");
        return mv;
    }

    @ExceptionHandler(DataAccessException.class)
    ModelAndView handleDataAccessException(HttpServletRequest req, DataAccessException dataAccessException){
        System.out.println("-------------------------");
        ModelAndView mv=new ModelAndView();
        System.out.println("---------------------------");
        System.out.println(dataAccessException);
        System.out.println("--------------------------");
        logger.error(dataAccessException.toString());
        mv.addObject("exception",dataAccessException);
        mv.addObject("url",req.getRequestURL());
        mv.setViewName("error");
        return mv;
    }

}
