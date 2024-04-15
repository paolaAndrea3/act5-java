import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.cesde.Ejercicios;

public class ExercisesTest {

    @Test
    void testExercise1() {
        Ejercicios ejercicios = new Ejercicios();
        int num1 = 10;
        int num2 = 5;
        String resultadoEsperado = "El número mayor es: " + num1;
        String resultadoReal = ejercicios.ejercicio1(num1, num2);
        assertEquals(resultadoEsperado, resultadoReal);
        num1 = 5;
        num2 = 10;
        resultadoEsperado = "El número mayor es: " + num2;
        resultadoReal = ejercicios.ejercicio1(num1, num2);
        assertEquals(resultadoEsperado, resultadoReal);
        num1 = 10;
        num2 = 10;
        resultadoEsperado = "Los dos números son iguales.";
        resultadoReal = ejercicios.ejercicio1(num1, num2);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void testExercise2() {
        Ejercicios ejercicios = new Ejercicios();
        double calificacion = 3.5;
        String resultadoEsperado = "¡Felicidades! Usted ha aprobado el examen.";
        String resultadoReal = ejercicios.ejercicio2(calificacion);
        assertEquals(resultadoEsperado, resultadoReal);
        calificacion = 3.0;
        resultadoEsperado = "Lo siento, usted ha reprobado el examen.";
        resultadoReal = ejercicios.ejercicio2(calificacion);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void testExercise3() {
        Ejercicios ejercicios = new Ejercicios();
        double precio = 50000;
        double descuentoEsperado = precio * 0.1;
        double precioFinalEsperado = precio - descuentoEsperado;
        double precioFinalReal = ejercicios.ejercicio3(precio);
        assertEquals(precioFinalEsperado, precioFinalReal);

        precio = 40000;
        descuentoEsperado = 0;
        precioFinalEsperado = precio - descuentoEsperado;
        precioFinalReal = ejercicios.ejercicio3(precio);
        assertEquals(precioFinalEsperado, precioFinalReal);
    }

    @Test
    void testExercise4() {
        Ejercicios ejercicios = new Ejercicios();
        int tipoFigura = 1;
        double ladoCuadrado = 5.0;
        double baseTriangulo = 0.0;
        double alturaTriangulo = 0.0;
        double radioCirculo = 0.0;
        double areaEsperada = ladoCuadrado * ladoCuadrado;
        String resultadoEsperado = "El área de la figura es: " + areaEsperada;
        double resultadoReal = ejercicios.ejercicio4(tipoFigura, ladoCuadrado, baseTriangulo, alturaTriangulo,
                radioCirculo);
        assertEquals(resultadoEsperado, resultadoReal);
        tipoFigura = 2;
        ladoCuadrado = 0.0;
        baseTriangulo = 4.0;
        alturaTriangulo = 3.0;
        radioCirculo = 0.0;
        areaEsperada = (baseTriangulo * alturaTriangulo) / 2;
        resultadoEsperado = "El área de la figura es: " + areaEsperada;
        resultadoReal = ejercicios.ejercicio4(tipoFigura, ladoCuadrado, baseTriangulo, alturaTriangulo, radioCirculo);
        assertEquals(resultadoEsperado, resultadoReal);
        tipoFigura = 3;
        ladoCuadrado = 0.0;
        baseTriangulo = 0.0;
        alturaTriangulo = 0.0;
        radioCirculo = 2.0;
        areaEsperada = Math.PI * radioCirculo * radioCirculo;
        resultadoEsperado = "El área de la figura es: " + areaEsperada;
        resultadoReal = ejercicios.ejercicio4(tipoFigura, ladoCuadrado, baseTriangulo, alturaTriangulo, radioCirculo);
        assertEquals(resultadoEsperado, resultadoReal);
        tipoFigura = 4;
        ladoCuadrado = 0.0;
        baseTriangulo = 0.0;
        alturaTriangulo = 0.0;
        radioCirculo = 0.0;
        resultadoEsperado = "Tipo de figura no válida.";
        resultadoReal = ejercicios.ejercicio4(tipoFigura, ladoCuadrado, baseTriangulo, alturaTriangulo, radioCirculo);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void testExercise5() {
        Ejercicios ejercicios = new Ejercicios();
        int num1 = 2;
        int num2 = 5;
        int num3 = 10;
        int menorEsperado = 2;
        int menorReal = ejercicios.ejercicio5(num1, num2, num3);
        assertEquals(menorEsperado, menorReal);
        num1 = 3;
        num2 = 1;
        num3 = 5;
        menorEsperado = 1;
        menorReal = ejercicios.ejercicio5(num1, num2, num3);
        assertEquals(menorEsperado, menorReal);
        num1 = 35;
        num2 = 10;
        num3 = 3;
        menorEsperado = 3;
        menorReal = ejercicios.ejercicio5(num1, num2, num3);
        assertEquals(menorEsperado, menorReal);
        num1 = 5;
        num2 = 5;
        num3 = 5;
        menorEsperado = 5;
        menorReal = ejercicios.ejercicio5(num1, num2, num3);
        assertEquals(menorEsperado, menorReal);
    }

}
