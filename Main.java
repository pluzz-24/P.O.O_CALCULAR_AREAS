import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el radio del circulo: ");
        double radio = sc.nextDouble();
        Circulo circulo = new Circulo(radio);
        System.out.println("Area del circulo: " + circulo.calcularArea());


        System.out.print("Ingresa el tamaño de los lados del cuadrado: ");
        double lado = sc.nextDouble();
        Cuadrado cuadrado = new Cuadrado(lado);
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());


        System.out.print("Ingresa la base del triangulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingresa la altura del triangulo: ");
        double altura = sc.nextDouble();
        Triangulo triangulo = new Triangulo(base, altura);
        System.out.println("Area del triangulo: " + triangulo.calcularArea());

        sc.close();
    }
}