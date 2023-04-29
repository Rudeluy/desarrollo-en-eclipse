package cl.desafiolatam;

import java.util.Scanner;

public class CalcularHipotenusaCatetos {

	public static void main(String[] args) {

		
        Scanner input = new Scanner(System.in);
        int opcion;
        double cateto1, cateto2, hipotenusa;
        boolean salir = false;
 
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular hipotenusa");
            System.out.println("2. Calcular cateto");
        	opcion = input.nextInt();
        	
	        switch (opcion) {
	        
	        
	            case 1:
	                

	                cateto1 = capturaDatos("\nIngrese el primer cateto: \n", input);
	                cateto2 = capturaDatos("\nIngrese el segundo cateto: \n", input);
	                
	                hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	                System.out.println("La hipotenusa es: " + hipotenusa);
	                break;
	                
	            case 2:
	                
	                cateto1 = capturaDatos("\nIngrese el cateto conocido: \n", input);
	                hipotenusa = capturaDatos("\nIngrese la hipotenusa: \n", input);
	                
	                cateto2 = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(cateto1, 2));
	                
	                System.out.println("El otro cateto es: " + cateto2);
	                break;
	                
	            default:
	                System.out.println("Error ... opcion invalida");
	                System.out.println("Ingrese nuevamente la opcion");
	                
	                break;
	        }

        
        } while (!salir);
        	
        input.close();
        
        
	}
	
	public static double capturaDatos(String mensaje, Scanner input) {
        System.out.printf(mensaje);
        while (!input.hasNextDouble()) {
            System.out.println("Error ... debe ingresar un numero");
            input.next();
        }
        return input.nextDouble();
    }

}
