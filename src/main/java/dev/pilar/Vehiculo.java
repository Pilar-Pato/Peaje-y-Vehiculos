package dev.pilar;

public abstract class Vehiculo {
    private int id; // PK
    private String placa;
    private int idEstacion; // FK que referencia a EstacionDePeaje

    public Vehiculo(int id, String placa, int idEstacion) {
        this.id = id;
        this.placa = placa;
        this.idEstacion = idEstacion;
    }

    public String getPlaca() {
        return placa;
    }

    public int getId() {
        return id;
    }

    public int getIdEstacion() {
        return idEstacion;
    }

    public abstract double calcularPeaje(); // Método abstracto
}