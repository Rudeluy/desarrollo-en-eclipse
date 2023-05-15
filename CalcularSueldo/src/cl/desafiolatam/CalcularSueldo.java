package cl.desafiolatam;

public class CalcularSueldo {

    private double hora_normal;

	
    public static void main(String[] args) {
		// TODO Auto-generated method stub

    	CalcularSueldo calculadora = new CalcularSueldo();
        calculadora.setHoraNormal(12000);
        

        
        calculadora.calcularSueldoMes(49, 50, 42, 80);
    	
    }
	
    public void setHoraNormal(double hora_normal) {
        this.hora_normal = hora_normal;
    }



    public double calcularHorasSemanales(double horasSemanales) {
        double sueldo = 0;
        double valorHora = hora_normal;

        if (horasSemanales > 48) {
            double horasExtra = horasSemanales - 48;
            if (horasExtra < 8) {
                sueldo += (horasExtra * valorHora) * 2;
            } else {
                sueldo += (8 * valorHora) * 2;
                sueldo += (horasExtra - 8) * valorHora * 3;
            }
            sueldo += 48 * valorHora;
        } else {
            sueldo += horasSemanales * valorHora;
        }
        return sueldo;
    }

    public void calcularSueldoMes(double horasSemanalesSemana1, double horasSemanalesSemana2, double horasSemanalesSemana3, double horasSemanalesSemana4) {
        double horasSemanalesTotal = horasSemanalesSemana1 + horasSemanalesSemana2 + horasSemanalesSemana3 + horasSemanalesSemana4;
        double sueldoTotal = calcularHorasSemanales(horasSemanalesSemana1) + calcularHorasSemanales(horasSemanalesSemana2) + calcularHorasSemanales(horasSemanalesSemana3) + calcularHorasSemanales(horasSemanalesSemana4);
        System.out.println("El sueldo total del mes es: $" + sueldoTotal);
        System.out.println("La distribución de horas es la siguiente:");
        System.out.println("Semana 1: " + horasSemanalesSemana1 + " horas trabajadas. Sueldo: $" + calcularHorasSemanales(horasSemanalesSemana1));
        System.out.println("Semana 2: " + horasSemanalesSemana2 + " horas trabajadas. Sueldo: $" + calcularHorasSemanales(horasSemanalesSemana2));
        System.out.println("Semana 3: " + horasSemanalesSemana3 + " horas trabajadas. Sueldo: $" + calcularHorasSemanales(horasSemanalesSemana3));
        System.out.println("Semana 4: " + horasSemanalesSemana4 + " horas trabajadas. Sueldo: $" + calcularHorasSemanales(horasSemanalesSemana4));
        System.out.println("Total de horas trabajadas en el mes: " + horasSemanalesTotal);
    }

}
