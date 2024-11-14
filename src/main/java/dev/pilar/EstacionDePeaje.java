package dev.pilar;

import java.util.ArrayList;
import java.util.List;

public class EstacionDePeaje {
    private int id; // PK
    private String nombre;
    private String ciudad;
    private double totalRecaudado;
    private List<Vehiculo> vehiculos;

    public EstacionDePeaje(int id, String nombre, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.totalRecaudado = 0;
        this.vehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
        this.totalRecaudado += vehiculo.calcularPeaje();
    }

    public void imprimirListado() {
        System.out.println("Listado de vehículos en la estación de peaje " + nombre + ", " + ciudad + ":");
        for (Vehiculo v : vehiculos) {
            System.out.println(v.getPlaca() + " - Peaje: " + v.calcularPeaje());
        }
        System.out.println("Total recaudado: " + totalRecaudado);
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }
}
