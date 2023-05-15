package cl.desafiolatam;

import java.util.Scanner;

public class CalcularPromedioEstudianteMetodos {

	public static void main(String[] args) {
		
		
		
        Scanner input = new Scanner(System.in);

        String nombre_completo, asignatura, docente;
        
        double nota1, nota2, nota3;
        
   
		
        //Captura datos personales y del curso
		System.out.println("Ingrese el nombre del estudiante: ");
	    nombre_completo = input.nextLine();
	    System.out.println("Ingrese nombre de la asignatura: ");
	    asignatura = input.nextLine();
	    System.out.println("Ingrese nombre del docente: ");
	    docente = input.nextLine();
     
      
	    //Captura Notas 
	    
        nota1 = capturanotas("\nIngrese la nota 1:  \n", input);
        nota2 = capturanotas("\nIngrese la nota 2:  \n", input);
        nota3 = capturanotas("\nIngrese la nota 3:  \n", input);
		

		//Calcula el promedio
        
		double promedio = calculaPromedio(nota1, nota2 , nota3);
	    
	    
		System.out.printf("\nNombre del alumno: %s ",nombre_completo );
	    System.out.printf("\nAsignatura: %s", asignatura);
	    System.out.println("\nDocente: " + docente);
	    System.out.println("\nPromedio de notas: " + promedio);
	    
	    
	    //Evalua Promedio
	    String evaluacion = evaluaPromedio(promedio);
	    System.out.println("Evaluación: " + evaluacion);
	    input.close();
		
	}
	
	
	 // metodo que valida que sea un numero el ingresado
	public static double capturanotas(String mensaje, Scanner input) {
        System.out.printf(mensaje);
        while (!input.hasNextDouble()) {
            System.out.println("Error ... debe ingresar un numero");
            input.next();
        }
        return input.nextDouble();
    }
	
	  //metodo para obtener el promedio de 3 notas
	public static double calculaPromedio(double a, double b , double c) {
		
		double promedio = (a + b + c) / 3;	
        return promedio;
    }
	

	public static String evaluaPromedio(double promedio) {
	    if (promedio >= 4) {
	        return "Aprobado";
	    } else {
	        return "Reprobado";
	    }
	}
	
}
