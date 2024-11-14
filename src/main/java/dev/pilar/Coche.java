package dev.pilar;

public class Coche extends Vehiculo {
    public Coche(int id, String placa, int idEstacion) {
        super(id, placa, idEstacion);
    }

    @Override
    public double calcularPeaje() {
        return 100; // Peaje para coche
    }
}