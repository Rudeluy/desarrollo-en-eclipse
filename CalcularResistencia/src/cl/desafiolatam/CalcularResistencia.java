package cl.desafiolatam;

import java.util.Scanner;

public class CalcularResistencia {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

        double resis1, resis2, resis3 , resis_t;
		
        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {
            
        	System.out.println("**** Este programa calcula la resistencia ****");
        	
        	resis1 = capturaDatos("\nIngrese la primera resistencia: \n", input);
        	resis2 = capturaDatos("Ingrese la segunda resistencia: \n", input);
        	resis3 = capturaDatos("Ingrese la tercera resistencia: \n", input);
        	
        	resis_t = (1/((1/resis1)+(1/resis2)+(1/resis3)));
        	
        	System.out.println("La resistencia total es de: " + resis_t);
        	
            System.out.println("¿Desea calcular nuevamente una resistencia? (s/n) \n\n");
            continuar = input.next().charAt(0);
            
        }

        System.out.println("Has salido del programa");
        
    }
	
	public static double capturaDatos(String mensaje, Scanner input) {
	    System.out.printf(mensaje);
	    while (!input.hasNextDouble()) {
	        System.out.println("Error ... debe ingresar un número");
	        input.next();
	    }
	    double num = input.nextDouble();
	    while (num < 0) {
	        System.out.println("Error ... debe ingresar un número positivo");
	        num = input.nextDouble();
	    }
	    return num;
	}

}
