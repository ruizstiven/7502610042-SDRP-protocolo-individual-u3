package Taller11.Ejercicio1;

public class PruebaEjercicio1 {
    public static void main(String[] args) {
        Figura miCirculo = new Circulo(5.0);
        Figura miRectangulo = new Rectangulo(4.0, 6.0);

        System.out.print("Círculo -> ");
        miCirculo.mostrarArea();

        System.out.print("Rectángulo -> ");
        miRectangulo.mostrarArea();
    }
}