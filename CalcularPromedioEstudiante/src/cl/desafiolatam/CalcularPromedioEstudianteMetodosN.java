package cl.desafiolatam;

import java.util.Scanner;

public class CalcularPromedioEstudianteMetodosN {

	public static void main(String[] args) {
		
	        Scanner input = new Scanner(System.in);

	        String nombre_completo, asignatura, docente;
	        int cantidad_notas;
	        double[] notas;
	        
	        //Captura datos personales y del curso
			System.out.println("Ingrese el nombre del estudiante: ");
		    nombre_completo = input.nextLine();
		    System.out.println("Ingrese nombre de la asignatura: ");
		    asignatura = input.nextLine();
		    System.out.println("Ingrese nombre del docente: ");
		    docente = input.nextLine();
	     
	        //Captura cantidad de notas 
	        System.out.println("Ingrese la cantidad de notas a ingresar: ");
	        cantidad_notas = (int) validaNumeroDouble(input);
		    
	        //El metodo captura las notas y las entrega en el array notas
	        notas = capturaNotas(cantidad_notas, input);
			
			//Calcula el promedio, este recibe el array y lo recorre para generar la sumatoria y posteriormente utilizar la formula en base a la cantidad de notas que existan en el array
			double promedio = calculaPromedio(notas);// lo capto en la variable promedio
		    
			//Muestra los resultados
			System.out.printf("\nNombre del alumno: %s ",nombre_completo );
		    System.out.printf("\nAsignatura: %s", asignatura);
		    System.out.println("\nDocente: " + docente);
		    imprimeNotas(notas);
		    System.out.println("\nPromedio de notas: " + promedio);
		    
		    //Muestra evaluacion
		    String evaluacion = evaluaPromedio(promedio);
		    System.out.println("Evaluación: " + evaluacion);
		    
		    input.close();
			
		}
		
		//Método para capturar notas
		public static double[] capturaNotas(int cantidad_notas, Scanner input) {
			double[] notas = new double[cantidad_notas];
			for(int i=0; i<cantidad_notas; i++) {
				System.out.printf("\nIngrese la nota %d: ", i+1);
				notas[i] = validaNumeroDouble(input);		
			}
			return notas;
		}
		
		//Método para calcular promedio
		public static double calculaPromedio(double[] notas) {
			double sum = 0;
			for(int i=0; i<notas.length; i++) {
				sum += notas[i];
			}
			double promedio = sum / notas.length;
	        return promedio;
	    }
		//Metodo para Evaluar Promedio
		public static String evaluaPromedio(double promedio) {
		    if (promedio >= 4) {
		        return "Aprobado";
		    } else {
		        return "Reprobado";
		    }
		}
		
		public static double validaNumeroDouble(Scanner input) {
	        while (!input.hasNextDouble()) {
	            System.out.println("Error ... debe ingresar un numero");
	            input.next();
	        }
	        return input.nextDouble();
	    }
		
		public static void imprimeNotas(double[] listNotas) {
			System.out.println("\n ---- Lista de Notas ----");
			for(int i=0; i<listNotas.length; i++) {	
				System.out.printf("\nNota "+ i + ": " + listNotas[i]);
			}
		}
}
