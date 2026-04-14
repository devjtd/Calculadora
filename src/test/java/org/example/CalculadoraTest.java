package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculadoraTest {

    @Test
    public void testSuma() {
        assertEquals(7, Calculadora.sumar(2, 5), "Error en suma: El total no corresponde a la suma de los operandos");
        System.out.println("Prueba 1 - Suma verificada con éxito");
    }

    @Test
    public void testResta() {
        assertEquals(1, Calculadora.restar(2, 1), "Error en resta: La diferencia calculada es incorrecta");
        System.out.println("Prueba 2 - Resta verificada con éxito");
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(50, Calculadora.multiplicar(10, 5), "Error en multiplicación: El producto obtenido no es el esperado");
        System.out.println("Prueba 3 - Multiplicación verificada con éxito");
    }

    @Test
    public void testDivision() {
        assertEquals(2, Calculadora.dividir(10, 5), "Error en división: El cociente no coincide con el cálculo esperado");
        System.out.println("Prueba 4 - División verificada con éxito");
    }

    @Test
    public void testDivision2() {
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir(20, 0));
        System.out.println("Prueba 7 - División con cero verificada con éxito");
    }

    @Test
    public void testRaizCuadrada() {
        assertEquals(5.0, Calculadora.raiz_cuadrada(25), "Error al hallar la raiz cuadrada: El valor obtenido no coincide con el cálculo esperado");
        System.out.println("Prueba 5 - Raiz cuadrada verificada con éxito");
    }

    @Test
    public void testRaizCuadrada2() {
        assertTrue(Double.isNaN(Calculadora.raiz_cuadrada(-25)));
        System.out.println("Prueba 6 - Raiz cuadrada negativa verificada con éxito");
    }

    @Test
    @DisplayName("Suma de dos numeros negativos")
    public void testSuma2() {
        assertEquals(-10, Calculadora.sumar(-5, -5), "Error en suma: El total no corresponde a la suma de los operandos");
        System.out.println("Prueba 8 - Suma verificada con éxito");
    }

    @Test
    public void testResta2() {
        assertEquals(5, Calculadora.restar(-5, -10), "Error en resta: La diferencia calculada es incorrecta");
        System.out.println("Prueba 9 - Resta verificada con éxito");
    }
}
