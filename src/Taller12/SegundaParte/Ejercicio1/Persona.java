package Taller12.SegundaParte.Ejercicio1;

public class Persona implements Hablador, Trabajador {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hablar() {
        System.out.println(nombre + " está conversando con su equipo.");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está realizando sus tareas laborales.");
    }
}
