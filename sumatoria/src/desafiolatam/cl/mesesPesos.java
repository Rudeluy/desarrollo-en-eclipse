package desafiolatam.cl;
import java.util.Scanner;

public class mesesPesos {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos al usuario la altura
        System.out.print("Ingrese la altura: ");
        double altura = scanner.nextDouble();
    
        // Declaramos el arreglo con los meses del año y valores iniciales de 0
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                           "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        double[][] datosAnuales = new double[12][3];
        
        for (int i = 0; i < datosAnuales.length; i++) {
            datosAnuales[i][0] = i + 1; // Asignamos el mes
            datosAnuales[i][1] = altura; // Asignamos la altura inicial para todos los meses
        }
        
        // Llenamos el arreglo con los datos de peso para cada mes
        for (int i = 0; i < datosAnuales.length; i++) {
            System.out.printf("Ingrese el peso para %s: ", meses[i]);
            double peso = scanner.nextDouble();
            datosAnuales[i][2] = peso;
        }
        
        for (int i = 0; i < datosAnuales.length; i++) {
            System.out.printf("%s - Altura: %.2f m - Peso: %.2f kg\n", meses[i], datosAnuales[i][1], datosAnuales[i][2]);
        }
        // Pedimos al usuario el número de peso límite
        System.out.print("Ingrese el número de peso límite: ");
        double pesoLimite = scanner.nextDouble();
        
        // Encontramos los meses con peso superior al límite
        String[] mesesConSobrePeso = encontrarSobrePeso(datosAnuales, pesoLimite);
        
        // Imprimimos los meses con sobre peso
        System.out.print("Meses con sobre peso: ");
        for (String mes : mesesConSobrePeso) {
            System.out.print(mes + " ");
        }
        System.out.println();
        scanner.close();
             
    }
	
	
    public static String[] encontrarSobrePeso(double[][] datos, double pesoLimite) {
        String[] mesesConSobrePeso = new String[12];
        int contador = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i][2] > pesoLimite) {
                mesesConSobrePeso[contador] = String.format("%d (%s)", (int) datos[i][0], obtenerNombreMes((int) datos[i][0]));
                contador++;
            }
        }
        return mesesConSobrePeso;
    }
    public static String obtenerNombreMes(int numMes) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                           "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        if (numMes >= 1 && numMes <= 12) {
            return meses[numMes - 1];
        } else {
            return "Mes inválido";
        }
    }
}
