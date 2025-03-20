package com.empresa.controlador;

import com.empresa.modelo.CargaCombustible;
import com.empresa.modelo.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class ControladorCombustible {
    private List<CargaCombustible> cargas = new ArrayList<>();
    
    private static List<Vehiculo> listaDeVehiculos = new ArrayList<>();

    public static List<CargaCombustible> obtenerCargas() {
    return listaDeCargas; 
}

    private static List<CargaCombustible> listaDeCargas = new ArrayList<>();

    public static void agregarCarga(CargaCombustible carga) {
    listaDeCargas.add(carga);
}

    public void registrarCarga(CargaCombustible carga) {
        cargas.add(carga);
    }

public static void agregarVehiculo(Vehiculo vehiculo) {
    listaDeVehiculos.add(vehiculo);
}

public static double calcularConsumoPromedio() {
    List<CargaCombustible> listaDeCargas = DatosCompartidos.obtenerCargas();
    if (listaDeCargas.size() < 2) {
        return 0; // No se puede calcular si hay menos de dos registros
    }

    double totalKm = 0;
    double totalLitros = 0;

    for (int i = 1; i < listaDeCargas.size(); i++) {
        double kmRecorridos = listaDeCargas.get(i).getKilometrajeActual() - listaDeCargas.get(i - 1).getKilometrajeActual();
        double litrosCargados = listaDeCargas.get(i).getLitrosCargados();

        totalKm += kmRecorridos;
        totalLitros += litrosCargados;
    }

    return (totalLitros > 0) ? totalKm / totalLitros : 0;
}

public static boolean detectarAnomalia() {
    double consumo = calcularConsumoPromedio();
    return (consumo < 5 || consumo > 20);
}
}
