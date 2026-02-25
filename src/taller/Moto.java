package taller;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public String getDetalles() {
        return "Moto [Matrícula: " + getMatricula() + ", Cilindrada: " + cilindrada + "cc]";
    }
}
