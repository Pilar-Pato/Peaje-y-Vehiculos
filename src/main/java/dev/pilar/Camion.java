package dev.pilar;

public class Camion extends Vehiculo {
    private int numeroDeEjes;

    public Camion(int id, String placa, int idEstacion, int numeroDeEjes) {
        super(id, placa, idEstacion);
        this.numeroDeEjes = numeroDeEjes;
    }

    @Override
    public double calcularPeaje() {
        return numeroDeEjes * 50; // $50 por eje
    }
}
