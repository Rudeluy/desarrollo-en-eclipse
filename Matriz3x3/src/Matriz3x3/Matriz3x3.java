package Matriz3x3;

public class Matriz3x3 {

	public static void main(String[] args) {
		  int n = 3;
	        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
	        
	        // primero ejercicio
	        System.out.print("Resultado es: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(matriz[i][0]);
	            if (i != n-1) {
	                System.out.print(", ");
	            }
	        }
	        
	        System.out.print(System.lineSeparator());
	        System.out.print(System.lineSeparator());
	        
	        
	        // Segundo ejercicio
	        
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(matriz[i][j] + "\t");
	            }
	            System.out.println();
	        }
	        
	}
	
}