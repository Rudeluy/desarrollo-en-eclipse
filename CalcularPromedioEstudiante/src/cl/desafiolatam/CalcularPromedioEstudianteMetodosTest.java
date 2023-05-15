package cl.desafiolatam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalcularPromedioEstudianteMetodosTest {

	@ParameterizedTest
	@DisplayName("testCalculaPromedio")
	@CsvSource({"4,5,4,4.333333333333333","6,3,4,4.333333333333333"})
	void testCalculaPromedio(double a, double b, double c, double d) {

		double resultado = CalcularPromedioEstudianteMetodos.calculaPromedio(a , b , c );
		assertEquals(d,resultado);
			
	}

	@Test
	@DisplayName("EvaluaPromedio")
	void testEvaluaPromedio() {
		fail("Not yet implemented");
	}	
	
	/*
	@Test
	void testEvaluaPromedio() {
		fail("Not yet implemented");
	}
	*/
}
