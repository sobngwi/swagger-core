package com.sobngwi.ctrl;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostControlleur {

    @ApiOperation(value = "postGreeting", nickname = "postGreeting")
    @RequestMapping( method = {RequestMethod.PUT, RequestMethod.POST}, path="/postG", produces = "application/json")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "Greeting", value = "User's name and id ", required = true, dataType = "Greeting", paramType = "post or put")
      })
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = Greeting.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")}) 
    public ResponseEntity<?> greeting() {
    	HttpHeaders httpHeaders = new HttpHeaders();
    	return  new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
    	}
    }
