package com.cesde;

public class Ejercicios {
    
    public String ejercicio1(int num1, int num2) {
        // Implementar solución
        if (num1>num2) {
          return "el numero mayor es: num1" ;
        } 
        else if (num2>num1) {
            return "el numero mayor es: num2" ;
        }
        return "los dos numeros son iguales";
    }
    
    public String ejercicio2(double calificacion) {
       // Implementar solución
       if (calificacion>=3.5 && calificacion<=5.0) {
        return "felicitaciones a aprovado es examen";
       }
        else if (calificacion>=6&& calificacion<=100) {
            return "calificacion no valida";
        }
        return "lo siento uste a reprovado el examen";
    }

    
    /**
     * @param precio
     * @return
     */
    public double ejercicio3(double precio) {
        // Implementar solución
        if (precio>=50.000)  {
           double descuento = 0.1;
        return  precio -(precio* descuento );
        }
        else{
            return 0;
        }
       
    }
    
    /**
     * @param tipoFigura
     * @param ladoCuadrado
     * @param baseTriangulo
     * @param alturaTriangulo
     * @param radioCirculo
     * @return
     */
    public String ejercicio4(int tipoFigura, double ladoCuadrado, double baseTriangulo, double alturaTriangulo,
            double radioCirculo) {
        // Implementar solución
        //esto no me daaaa
        double area = 0;
       switch (tipoFigura) {
        case 1:
            area = ladoCuadrado * ladoCuadrado;
            break;
       case 2:
            area =  baseTriangulo * alturaTriangulo / 2;
            break;
       case 3:
           area = Math.PI * radioCirculo * radioCirculo;
           break ;
            
       }
    
    
    public int ejercicio5(int num1, int num2, int num3) {
        // Implementar solución
        if (num1<num2&&num1<num3) {
        return num1;
        }
        else if (num2<num1&&num2<num3) {
            return num2;
        }

        return num3;
    }
}
