package taller;

public class Taller {
    private String nombre;

    public Taller(String nombre) {
        this.nombre = nombre;
    }

    // Dependencia: usa a un Mecanico
    public void asignarReparacion(Mecanico m) {
        System.out.println("Taller " + nombre + " asignando trabajo a mecánico " + m.getIdEmpleado());
        m.realizarTrabajo();
    }
}
