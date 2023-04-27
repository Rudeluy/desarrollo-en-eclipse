package desafilolatan.cl;
import java.util.Scanner;
public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce El numero de Lineas: ");
        int x = scanner.nextInt();
		while(x > 0) {
			int i = x;
			while(i>0) {
				System.out.print("*");
				i = i - 1; 
			}
			System.out.print(System.lineSeparator());
			x = x -1;
		}		
	}
}