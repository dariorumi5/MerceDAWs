package taller;

public class Coche extends Vehiculo {
    private int numPuertas;
    private boolean esHibrido;

    public Coche(String matricula, String marca, String modelo, int numPuertas, boolean esHibrido) {
        super(matricula, marca, modelo);
        this.numPuertas = numPuertas;
        this.esHibrido = esHibrido;
    }

    @Override
    public String getDetalles() {
        return "Coche [Matrícula: " + getMatricula() + ", Puertas: " + numPuertas + ", Híbrido: " + esHibrido + "]";
    }
}
