package clase2act3;

//import java.util.Scanner;

public class formasGeometricas implements calculosFormas {

    public formasGeometricas() {
    }    
    
    @Override
    public void areaCirculo(double radio) {
        double area;     
                       
        System.out.println("\nCalculando el área de un círculo para el valor de radio dado: " + radio);
        area = Math.PI * radio;
        System.out.println("El área del círculo es " + area);
    }

    @Override
    public void perimetroCirculo(double radio) {
        double perimetro;
         
        System.out.println("\nCalculando el perímetro de un círculo para el valor de radio dado: " + radio);
        perimetro = Math.PI * 2 * radio;
        System.out.println("El perímetro del círculo es " + perimetro);
    }

    @Override
    public void areaRectangulo(double base, double altura) {
        double area;       
                
        System.out.println("\nCalculando el área de un rectángulo de base: " + base + " y altura " + altura);
        area = base * altura;
        System.out.println("El área del círculo es " + area);
    }

    @Override
    public void perimetroRectangulo(double base, double altura) {
        double perimetro; 
        
        System.out.println("\nCalculando el perímetro de un rectángulo de base: " + base + " y altura " + altura);
        perimetro = (base + altura) * 2;
        System.out.println("El perimetro del círculo es " + perimetro);
    }

    
   /* 
    Código anterior prueba
    
    public static void areaCirculo(){
        double area;       
        double radio;
                
        System.out.println("\nVamos a calcular el área de un círculo...");
        System.out.println("Ingrese el valor del radio del círculo");
        Scanner input = new Scanner(System.in);
        radio = input.nextDouble();
        area = Math.PI * radio;
        System.out.println("El área del círculo es " + area);
    }
    
    public static void perimetroCirculo(){
        double perimetro;        
        double radio; 
        
        System.out.println("\nVamos a calcular el perímetro de un círculo...");
        System.out.println("Ingrese el valor del radio del círculo");
        Scanner input = new Scanner(System.in);
        radio = input.nextDouble();
        perimetro = Math.PI * 2 * radio;
        System.out.println("El perímetro del círculo es " + perimetro);
    }
    
    public static void areaRectangulo(){
        double area;        
        double altura;
        double base;
        
        System.out.println("\nVamos a calcular el área de un rectángulo...");
        System.out.println("Ingrese el valor de la base del rectángulo");
        Scanner input = new Scanner(System.in);
        base = input.nextDouble();
        System.out.println("Ingrese el valor de la altura del rectángulo");
        Scanner input2 = new Scanner(System.in);
        altura = input2.nextDouble();
        area = base * altura;
        System.out.println("El área del círculo es " + area);
    }
    
    public static void perimetroRectangulo(){
        double perimetro;        
        double altura;
        double base;
        
        System.out.println("\nVamos a calcular el perímetro de un rectángulo...");
        System.out.println("Ingrese el valor de la base del rectángulo");
        Scanner input = new Scanner(System.in);
        base = input.nextDouble();
        System.out.println("Ingrese el valor de la altura del rectángulo");
        Scanner input2 = new Scanner(System.in);
        altura = input2.nextDouble();
        perimetro = (base + altura) * 2;
        System.out.println("El perimetro del círculo es " + perimetro);
    } */
}
