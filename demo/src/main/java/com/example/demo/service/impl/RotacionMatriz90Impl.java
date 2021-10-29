package com.example.demo.service.impl;

import com.example.demo.service.RotacionMatriz90Service;
import com.fasterxml.jackson.core.JsonToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class RotacionMatriz90Impl implements RotacionMatriz90Service{

    @Override
    public Map matriz(ArrayList<ArrayList<Integer>> mtrz, int n) {
        Map resultado = new HashMap();

        int matriz[][] = new int [n][n];

        for(int f=0; f < matriz.length; f++){
            for(int c=0; c < matriz.length; c++){
                matriz [f][c] = mtrz.get(f).get(c);

            }
        }
        printMatrix(matriz);;
        resultado.put("Matriz final", rotacion90(matriz,n));

        return resultado;
    }

    //Metodo para imprimir
    public static void printMatrix(int[][] data){

        int row = data.length;
        int column = data[0].length;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++)
                System.out.printf("%3d", data[i][j]);
            System.out.println();
        }
    }

    //metodo para rotar
    public int[][] rotacion90(int[][] matrizR, int n) {
        int [][]results = new int[n][n];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                results[j][(matrizR.length - 1) - i] = matrizR[i][j];
            }
        }
        System.out.println("rotacion");
        printMatrix(results);
        return results;
    }

}
