package Taller11.Ejercicio2;

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método abstracto
    public abstract double calcularSalario();

    // 3. Método concreto que utiliza calcularSalario()
    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre + " | Salario Total: $" + calcularSalario());
    }
}