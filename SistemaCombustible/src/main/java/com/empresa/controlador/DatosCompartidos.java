package com.empresa.controlador;

import com.empresa.modelo.CargaCombustible;
import com.empresa.modelo.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class DatosCompartidos {
    private static List<Vehiculo> listaDeVehiculos = new ArrayList<>();
    private static List<CargaCombustible> listaDeCargas = new ArrayList<>();

    public static void agregarVehiculo(Vehiculo vehiculo) {
        listaDeVehiculos.add(vehiculo);
    }

    public static void agregarCarga(CargaCombustible carga) {
        listaDeCargas.add(carga);
    }

    public static List<Vehiculo> obtenerVehiculos() {
        return listaDeVehiculos;
    }

    public static List<CargaCombustible> obtenerCargas() {
        return listaDeCargas;
    }
}
