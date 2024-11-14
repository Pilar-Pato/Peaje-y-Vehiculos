package dev.pilar;

public class Moto extends Vehiculo {
    public Moto(int id, String placa, int idEstacion) {
        super(id, placa, idEstacion);
    }

    @Override
    public double calcularPeaje() {
        return 50; // Peaje para moto
    }
}