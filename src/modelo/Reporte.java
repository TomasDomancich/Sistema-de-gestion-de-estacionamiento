package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa un reporte de ingresos o actividad de un estacionamiento
 * en un rango de fechas determinado.
 */
public class Reporte {

    // ===== Atributos =====
    private int idReporte;
    private TipoReporte tipo; // Enum: DIARIO, SEMANAL, MENSUAL
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private float totalIngresos;
    private Estacionamiento estacionamiento;
    private List<Vehiculo> vehiculosRegistrados; // opcional, para cálculos detallados

    // ===== Constructores =====
    public Reporte(int idReporte, TipoReporte tipo, LocalDate fechaInicio, LocalDate fechaFin, Estacionamiento estacionamiento) {
        this.idReporte = idReporte;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estacionamiento = estacionamiento;
        this.vehiculosRegistrados = new ArrayList<>();
        this.totalIngresos = 0;
    }

    // ===== Getters y Setters =====
    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public TipoReporte getTipo() {
        return tipo;
    }

    public void setTipo(TipoReporte tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public float getTotalIngresos() {
        return totalIngresos;
    }

    public void setTotalIngresos(float totalIngresos) {
        this.totalIngresos = totalIngresos;
    }

    public Estacionamiento getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Estacionamiento estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    public List<Vehiculo> getVehiculosRegistrados() {
        return vehiculosRegistrados;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculosRegistrados.add(vehiculo);
    }

    // ===== Métodos funcionales =====

    /**
     * Calcula los ingresos totales según los vehículos registrados.
     * (Simulado — podrías agregar lógica real basada en tarifas o duración)
     */
    public void calcularIngresos(float tarifaPorHora) {
        float total = 0;
        for (Vehiculo v : vehiculosRegistrados) {
            long minutos = v.calcularTiempoEstadia();
            if (minutos > 0) {
                total += (minutos / 60.0) * tarifaPorHora;
            }
        }
        this.totalIngresos = total;
    }

    @Override
    public String toString() {
        return "Reporte{" +
                "idReporte=" + idReporte +
                ", tipo=" + tipo +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", totalIngresos=" + totalIngresos +
                ", estacionamiento=" + (estacionamiento != null ? estacionamiento.getNombre() : "N/A") +
                ", vehiculosRegistrados=" + vehiculosRegistrados.size() +
                '}';
    }

    // ===== Enum interno =====
    public enum TipoReporte {
        DIARIO, SEMANAL, MENSUAL
    }
}
