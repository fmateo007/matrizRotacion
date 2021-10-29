package com.example.demo.controller;

import com.example.demo.entity.Matriz;
import com.example.demo.service.RotacionMatriz90Service;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping(value = "/rotacionM90")
public class RotacionMatriz90 {

    @Autowired
    RotacionMatriz90Service rotacionMatriz90Service;

    @PostMapping(value = "/matriz", produces = "application/json; charset=UTF-8")
    public @ResponseBody Object matriz90(@RequestParam int n, @RequestBody Object body){
        Map result = new HashMap();
        Map response = new HashMap();
        ArrayList<ArrayList<Integer>> mtrz = new ArrayList<>(n);

        if(n > 0){
            response = (Map) body;
            mtrz = (ArrayList<ArrayList<Integer>>) response.get("Matriz");
            Map matriz = rotacionMatriz90Service.matriz(mtrz,n);

            System.out.println(mtrz);

            result.put("Success", true);
            result.put("Matriz", matriz);
            result.put("mensaje", "rotación 90 grados");
        }
        return result;
    }
}
