package Taller11.Ejercicio2;

public class PruebaEjercicio2 {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Carlos Pérez", 3000.0, 800.0);
        Empleado vendedor = new Vendedor("Ana Gómez", 1500.0, 450.0);

        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}