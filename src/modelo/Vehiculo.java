package modelo;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Representa un vehículo que ingresa al estacionamiento.
 * Contiene información del propietario, horarios de entrada/salida
 * y métodos para calcular la estadía.
 */
public class Vehiculo {

    // ===== Atributos =====
    private int idVehiculo;
    private String placa;
    private String tipo; // Ej: "Auto", "Moto", "Camioneta"
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    private Cliente propietario; // Asociación con el cliente dueño del vehículo

    // ===== Constructores =====
    public Vehiculo() {
        // Constructor vacío requerido por frameworks o uso general
    }

    public Vehiculo(int idVehiculo, String placa, String tipo, Cliente propietario) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("La placa no puede estar vacía");
        }
        this.idVehiculo = idVehiculo;
        this.placa = placa;
        this.tipo = tipo;
        this.propietario = propietario;
    }

    // ===== Getters y Setters =====
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
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("La placa no puede estar vacía");
        }
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

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    // ===== Métodos de negocio =====

    /** Registra la hora de entrada actual del vehículo */
    public void registrarEntrada() {
        this.horaEntrada = LocalDateTime.now();
    }

    /** Registra la hora de salida actual del vehículo */
    public void registrarSalida() {
        this.horaSalida = LocalDateTime.now();
    }

    /**
     * Calcula la duración de la estadía si hay hora de entrada y salida.
     * @return Duración en minutos, o -1 si faltan datos.
     */
    public long calcularTiempoEstadia() {
        if (horaEntrada != null && horaSalida != null) {
            return Duration.between(horaEntrada, horaSalida).toMinutes();
        }
        return -1; // Indica que no se puede calcular
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "idVehiculo=" + idVehiculo +
                ", placa='" + placa + '\'' +
                ", tipo='" + tipo + '\'' +
                ", propietario=" + (propietario != null ? propietario.getNombre() : "Sin propietario") +
                ", horaEntrada=" + horaEntrada +
                ", horaSalida=" + horaSalida +
                '}';
    }
}
