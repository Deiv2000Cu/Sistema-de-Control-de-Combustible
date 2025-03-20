package com.empresa.modelo;

import java.util.Date;

public class CargaCombustible {
    private Date fecha;
    private double litrosCargados;
    private double kilometrajeActual;
    private double precioPorLitro;

    public CargaCombustible(Date fecha, double litrosCargados, double kilometrajeActual, double precioPorLitro) {
        this.fecha = fecha;
        this.litrosCargados = litrosCargados;
        this.kilometrajeActual = kilometrajeActual;
        this.precioPorLitro = precioPorLitro;
    }

    // Métodos Getter
    public Date getFecha() {
        return fecha;
    }

    public double getLitrosCargados() {
        return litrosCargados;
    }

    public double getKilometrajeActual() {
        return kilometrajeActual;
    }

    public double getPrecioPorLitro() {
        return precioPorLitro;
    }
}
