package dev.pilar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CamionTest {

    @Test
    public void testCalcularPeajeCamionCon4Ejes() {
        // Creando un Camion con 4 ejes
        Camion camion = new Camion(1, "CAM001", 1, 4);
        double peaje = camion.calcularPeaje();
        assertEquals(200, peaje, "El peaje de un camión con 4 ejes debe ser 200");
    }

    @Test
    public void testCalcularPeajeCamionCon2Ejes() {
        // Creando un Camion con 2 ejes
        Camion camion = new Camion(2, "CAM002", 1, 2);
        double peaje = camion.calcularPeaje();
        assertEquals(100, peaje, "El peaje de un camión con 2 ejes debe ser 100");
    }
}