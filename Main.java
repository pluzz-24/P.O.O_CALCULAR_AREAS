import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //TRIANGULO

        System.out.println("ÁREAS Y PERIMETROS DE FIGURAS GEOMÉTICAS\n");
        System.out.println("===CIRCULO===\n");
        System.out.print("Ingresa el radio del circulo: ");
        double radio = read.nextDouble();
        Circulo circulo = new Circulo(radio);
        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Perimetro del circulo " +circulo.calcularPerimetroCirculo());

        //CUADRADO

        System.out.println("\n===CUADRADO===");
        System.out.print("Ingresa el tamaño de los lados del cuadrado: ");
        double lado = read.nextDouble();
        Cuadrado cuadrado = new Cuadrado(lado);
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado " +cuadrado.calcularPerimetroCuadrado());

        //TRIANGULO

        System.out.println("\n===TRIANGULO===");
        System.out.print("Ingresa la base del triangulo: ");
        double base = read.nextDouble();
        System.out.print("Ingresa la altura del triangulo: ");
        double altura = read.nextDouble();
        System.out.println("Ingresa la medida del lado A: ");
        double ladoA = read.nextDouble();
        System.out.println("Ingresa la medida del lado B: ");
        double ladoB = read.nextDouble();
        Triangulo triangulo = new Triangulo(base, altura, ladoA, ladoB);
        System.out.println("Area del triangulo: " + triangulo.calcularArea());
        System.out.println("Perimetro del triangulo "+ triangulo.calcularPerimetroTriangulo());

        
    }
}