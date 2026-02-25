package taller;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private List<Reparacion> reparaciones; // Composición

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.reparaciones = new ArrayList<>();
    }

    public void agregarReparacion(Reparacion r) {
        this.reparaciones.add(r);
    }

    public abstract String getDetalles();

    // Getters y Setters
    public String getMatricula() { return matricula; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public List<Reparacion> getReparaciones() { return reparaciones; }
}
