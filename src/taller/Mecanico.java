package taller;

public class Mecanico implements Especialista {
    private String idEmpleado;
    private String especialidad;

    public Mecanico(String idEmpleado, String especialidad) {
        this.idEmpleado = idEmpleado;
        this.especialidad = especialidad;
    }

    @Override
    public void realizarTrabajo() {
        System.out.println("El mecánico " + idEmpleado + " está trabajando en su especialidad: " + especialidad);
    }

    // Getters
    public String getIdEmpleado() { return idEmpleado; }
}
