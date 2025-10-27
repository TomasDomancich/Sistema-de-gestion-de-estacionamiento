import java.time.LocalDateTime;

public class Vehiculo {
    private int idVehiculo;
    private String placa;
    private String tipo;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;

    // Constructor
    public Vehiculo(int idVehiculo, String placa, String tipo) {
        this.idVehiculo = idVehiculo;
        this.placa = placa;
        this.tipo = tipo;
        this.horaEntrada = null;
        this.horaSalida = null;
    }

    // Getters y Setters
    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }
}