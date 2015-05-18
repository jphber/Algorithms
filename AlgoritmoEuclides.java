package com.applikdos.algoritmos;

public class AlgoritmoEuclides {

	public static void main(String[] args) {
	int num1=12, num2=82;
	int resultado=0,resto;
	int mayor,menor;
	if(num1>num2){
		mayor=num1;
		menor=num2;
	}else{
		mayor=num2;
		menor=num1;
	}
	
		int dividendo=mayor;
		int divisor=menor;
		resto=dividendo%divisor;
		if(resto==0){
			resultado=divisor;
		}
		while(resto!=0){
		
			dividendo=divisor;
		    divisor=resto;
		    resto=dividendo%divisor;
		    resultado=divisor;
		}
		System.out.println("El m.c.d es = " + resultado);
	
}

}
