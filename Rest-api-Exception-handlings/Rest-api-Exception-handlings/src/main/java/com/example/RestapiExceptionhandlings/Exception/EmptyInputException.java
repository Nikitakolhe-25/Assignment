package com.example.RestapiExceptionhandlings.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@ToString
public class EmptyInputException extends  RuntimeException
{
    private  String errorCode;
    private String  errorMessage;
    public  String getErrorCode()
    {
        return errorCode;
    }
    public  EmptyInputException()
    {

    }
}
