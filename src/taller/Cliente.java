package taller;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String dni;
    private String nombre;
    private String telefono;
    private List<Vehiculo> vehiculos;

    public Cliente(String dni, String nombre, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        this.vehiculos.add(v);
    }

    public String getDatos() {
        return "Cliente: " + nombre + " (DNI: " + dni + ")";
    }

    // Getters y Setters
    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
}
