package com.example.SpringBootExceptionHandling.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderError
{
    private int errorCode;
    private String errorMessage;
}
