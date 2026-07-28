package com.studyos.dto;

import java.time.LocalDateTime;

public class ApiResponse<T> {

    private boolean success;

    private String message;

    private T data;

    private String errorCode;

    private LocalDateTime timestamp;

    //No Args Constructor
    public ApiResponse(){}

    //All Args Constructor
    public ApiResponse(boolean success,
        String message,
        T data,
        String errorCode,
        LocalDateTime timestamp
    ){
        this.success = success;
        this.message = message;
        this.data = data;
        this.errorCode = errorCode;
        this.timestamp = timestamp;
    }

    //Getters
    public boolean isSuccess(){
        return success;
    }
    
    public String getMessage(){
        return message;
    }

    public T getData(){
        return data;
    }

    public String getErrorCode(){
        return errorCode;
    }

    public LocalDateTime getTimestamp(){
        return timestamp;
    }

    //Setters
    public void setSuccess(boolean success){
        this.success = success;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public void setData(T data){
        this.data = data;
    }

    public void setErrorCode(String errorCode){
        this.errorCode = errorCode;
    }

    public void setTimestamp(LocalDateTime timestamp){
        this.timestamp = timestamp;
    }

}