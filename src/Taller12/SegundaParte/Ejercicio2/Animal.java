package Taller12.SegundaParte.Ejercicio2;

public class Animal implements Volador, Nadador {
    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    @Override
    public void volar() {
        System.out.println("El " + especie + " está volando por el cielo.");
    }

    @Override
    public void nadar() {
        System.out.println("El " + especie + " está nadando en el lago.");
    }
}