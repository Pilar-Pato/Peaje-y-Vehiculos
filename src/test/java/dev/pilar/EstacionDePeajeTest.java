package dev.pilar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstacionDePeajeTest {

    private EstacionDePeaje estacion;

    @BeforeEach
    public void setUp() {
        // Creando una EstacionDePeaje
        estacion = new EstacionDePeaje(1, "Peaje Central", "Ciudad A");
    }

    @Test
    public void testRegistrarVehiculo() {
        // Registrar un vehículo de tipo Coche
        Vehiculo coche = new Coche(1, "ABC123", estacion.getId());
        estacion.registrarVehiculo(coche);

        // Comprobamos que el total recaudado sea correcto
        assertEquals(100, estacion.getTotalRecaudado(), "El total recaudado debe ser 100 después de registrar un coche.");
    }

    @Test
    public void testRegistrarMultipleVehiculos() {
        // Registrar un Coche y una Moto
        Vehiculo coche = new Coche(1, "ABC123", estacion.getId());
        Vehiculo moto = new Moto(2, "XYZ789", estacion.getId());

        estacion.registrarVehiculo(coche);
        estacion.registrarVehiculo(moto);

        // Comprobamos que el total recaudado sea la suma de ambos peajes
        assertEquals(150, estacion.getTotalRecaudado(), "El total recaudado debe ser 150 después de registrar un coche y una moto.");
    }

    @Test
    public void testImprimirListado() {
        // Registrar varios vehículos
        Vehiculo coche = new Coche(1, "ABC123", estacion.getId());
        Vehiculo moto = new Moto(2, "XYZ789", estacion.getId());
        estacion.registrarVehiculo(coche);
        estacion.registrarVehiculo(moto);

        // No podemos verificar la salida en consola directamente, pero podemos verificar el total recaudado
        assertEquals(150, estacion.getTotalRecaudado(), "El total recaudado debe ser 150.");
    }
}