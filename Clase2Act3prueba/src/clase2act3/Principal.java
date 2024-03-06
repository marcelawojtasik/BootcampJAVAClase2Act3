
package clase2act3;

import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        
        calculosFormas circulo = new formasGeometricas();
        circulo.areaCirculo(2);
        circulo.perimetroCirculo(3.3);
        
        calculosFormas rectangulo = new formasGeometricas();
        rectangulo.areaRectangulo(2.75, 5);
        rectangulo.perimetroRectangulo(8, 3.5);
        
        //me faltaria crear una funcion de espera para que no tire los resultados tan rapido
    }
    
}
