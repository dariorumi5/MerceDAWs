package taller;

public class Reparacion {
    private int id;
    private String descripcion;
    private double costeHoras;

    public Reparacion(int id, String descripcion, double costeHoras) {
        this.id = id;
        this.descripcion = descripcion;
        this.costeHoras = costeHoras;
    }

    public double calcularPrecioFinal() {
        // Ejemplo de lógica simple
        return costeHoras * 45.0; // 45€/hora
    }

    // Getters y Setters
    public int getId() { return id; }
    public String getDescripcion() { return descripcion; }
}
