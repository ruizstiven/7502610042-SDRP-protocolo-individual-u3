package Taller11.Ejercicio1;

public abstract class Figura {
    // Método abstracto
    public abstract double calcularArea();

    // 3. Método concreto que utiliza calcularArea()
    public void mostrarArea() {
        System.out.println("El área de la figura es: " + calcularArea());
    }
}
