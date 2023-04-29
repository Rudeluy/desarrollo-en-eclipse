package cl.defasiolatam;

import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double a, b, resultado;
        int opcion;
        boolean salir = false;

       
        do {
        	
        	
            System.out.println("Seleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
        	
            while (true) {
                if (input.hasNextInt()) {
                    opcion = input.nextInt();
                    if (opcion >= 1 && opcion <= 4) {
        
                        break;
                    }
                }
                System.out.println("Error ... Debe ingresar un número entero entre 1 y 4");
                input.next();
            }
            
          
            
        	a = capturaDatos("Ingrese el primer numero: ", input);
            b = capturaDatos("Ingrese el segundo numero: ", input);

            switch (opcion) {
            
                case 1:
                    resultado = a + b;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;

                case 2:
                    resultado = a - b;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;

                case 3:
                    resultado = a * b;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;

                case 4:
                    if (b == 0) {
                        System.out.println("Error ...No se puede dividir por cero");
                    } else {
                        resultado = a / b;
                        System.out.println("El resultado de la división es: " + resultado);
                    }
                    break;
                    
                default:
                    System.out.println("Error ... opcion invalida");
                    break;

            }

            System.out.print("¿necesita realizar otra operacion? (S/N): ");
            String respuesta = input.next();
            if (respuesta.equalsIgnoreCase("N")) {
                salir = true;
            }

        } while (!salir);

        input.close();
        
		
	}
	
	public static double capturaDatos(String mensaje, Scanner input) {
        System.out.print(mensaje);
        while (!input.hasNextDouble()) {
            System.out.println("Error ... debe ingresar un numero");
            input.next();
        }
        return input.nextDouble();
    }

}
