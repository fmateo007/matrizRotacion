package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.util.*;
import java.util.Arrays;

@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
@SpringBootApplication
public class EjercicioMatriz90Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioMatriz90Application.class, args);

		/*int [][] rotacion = new int [3][3];
		int n = 1;
		for(int f=0; f < rotacion.length; f++){
			for(int c=0; c < rotacion[0].length; c++){
				rotacion [f][c] = n;
				n++;

			}
		}

		int [] arr1 = new int [3];
		int [] arr2 = new int [3];
		int [] arr3 = new int [3];
		int cont = 0;
		for(int f=0; f < rotacion.length; f++){
			for(int c=0; c < rotacion[0].length; c++){
				if(cont == 0){
					arr1[c]=rotacion[f][c];
					// System.out.println(arr1[c]);
				}
				if(cont == 1){
					arr2[c]=rotacion[f][c];
					// System.out.println(arr2[c]);
				}
				if(cont == 2){
					arr3[c]=rotacion[f][c];
					// System.out.println(arr3[c]);
				}
			}
			cont++;
		}
		int [][] rotacion90 = new int [3][3];

		int cont2 = 0;
		for(int f=0; f < rotacion.length; f++){
			cont2=0;
			for(int c=0; c < rotacion[0].length; c++){
				if(cont2 == 0){
					rotacion90[f][c] = arr3[f];
				}
				if(cont2 == 1){
					rotacion90[f][c] = arr2[f];
				}
				if(cont2 == 2){
					rotacion90[f][c] = arr1[f];
				}
				cont2++;

				//System.out.println(rotacion90[f][c]);
			}
		}

		for(int matriz[]: rotacion90){
			System.out.println(Arrays.toString(matriz));
		}
*/
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(EjercicioMatriz90Application.class);
	}

}
