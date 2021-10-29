package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Matriz {
    private Map<String,String> matrizResponse;

    public Matriz(String matrizResponse){

    }
}
