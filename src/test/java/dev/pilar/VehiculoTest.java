package dev.pilar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculoTest {

    @Test
    public void testCalcularPeajeCoche() {
        // Creando un vehículo de tipo Coche
        Vehiculo coche = new Coche(1, "ABC123", 1);
        double peaje = coche.calcularPeaje();
        assertEquals(100, peaje, "El peaje de un coche debe ser 100.");
    }

    @Test
    public void testCalcularPeajeMoto() {
        // Creando un vehículo de tipo Moto
        Vehiculo moto = new Moto(2, "XYZ789", 1);
        double peaje = moto.calcularPeaje();
        assertEquals(50, peaje, "El peaje de una moto debe ser 50.");
    }

    @Test
    public void testCalcularPeajeCamion() {
        // Creando un vehículo de tipo Camión
        Vehiculo camion = new Camion(3, "CAM001", 1, 6);
        double peaje = camion.calcularPeaje();
        assertEquals(300, peaje, "El peaje de un camión con 6 ejes debe ser 300.");
    }
}