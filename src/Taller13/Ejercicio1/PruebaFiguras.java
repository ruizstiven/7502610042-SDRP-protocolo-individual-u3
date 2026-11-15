package Taller13.Ejercicio1;

public class PruebaFiguras {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5.0, 4.0);
        Figura triangulo = new Triangulo(6.0, 3.0);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}