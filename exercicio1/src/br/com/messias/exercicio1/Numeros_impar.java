package br.com.messias.exercicio1;

import java.util.Scanner;

public class Numeros_impar {

	public static void main(String[] args) {
		
		 Scanner ent = new Scanner(System.in);
	        int num, contPar = 0, contImpar = 0;
	        
	        for(int i = 1; i <= 5; i++){
	            System.out.println("Digite o " + i + "º número");
	            num = ent.nextInt();
	            
	            if(num % 2 != 0){
	                contImpar++;
	            }

	 
	        }
	        
	        System.out.println("Foram digitados " + contImpar + " números impares \n");
	        
	    }
	}