package com.tecnocampus.grouppablo.api.frontendException;

import com.tecnocampus.grouppablo.application.exception.CourseAlreadyExists;
import com.tecnocampus.grouppablo.application.exception.CourseNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlingAdvice {

    @ExceptionHandler(CourseNotFound.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Course not found")
    @ResponseBody
    String objectNotFoundHandler(Exception ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(CourseAlreadyExists.class)
    @ResponseBody
    @ResponseStatus(code = HttpStatus.CONFLICT, reason = "Duplicated title. Please choose another one.")
    String objectAlreadyExists(Exception exception) {
        return "Duplicated title. Please choose another one.";
    }

}