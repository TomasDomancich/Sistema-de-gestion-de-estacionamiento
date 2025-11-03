package modelo;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa un estacionamiento con espacios asignados,
 * control de horario de atención y operaciones de entrada/salida de vehículos.
 */
public class Estacionamiento {

    // ===== Atributos =====
    private int idEstacionamiento;
    private String nombre;
    private String direccion;
    private int espaciosTotales;
    private List<EspacioEstacionamiento> espacios;

    private LocalTime horaApertura;
    private LocalTime horaCierre;

    // ===== Constructores =====
    public Estacionamiento() {
        this.espacios = new ArrayList<>();
        this.horaApertura = LocalTime.of(7, 0);
        this.horaCierre = LocalTime.of(22, 0);
    }

    public Estacionamiento(int idEstacionamiento, String nombre, String direccion, int espaciosTotales) {
        this();
        this.idEstacionamiento = idEstacionamiento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.espaciosTotales = espaciosTotales;
        inicializarEspacios();
    }

    // ===== Getters y Setters =====
    public int getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(int idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEspaciosTotales() {
        return espaciosTotales;
    }

    public void setEspaciosTotales(int espaciosTotales) {
        this.espaciosTotales = espaciosTotales;
    }

    public List<EspacioEstacionamiento> getEspacios() {
        return espacios;
    }

    public void setEspacios(List<EspacioEstacionamiento> espacios) {
        this.espacios = espacios;
    }

    public LocalTime getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(LocalTime horaApertura) {
        this.horaApertura = horaApertura;
    }

    public LocalTime getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(LocalTime horaCierre) {
        this.horaCierre = horaCierre;
    }

    // ===== Métodos funcionales =====

    /** Inicializa los espacios del estacionamiento. */
    private void inicializarEspacios() {
        for (int i = 1; i <= espaciosTotales; i++) {
            modelo.EspacioEstacionamiento espacio = new modelo.EspacioEstacionamiento(i, "auto"); // por defecto
            espacio.setEstacionamiento(this);
            espacios.add(espacio);
        }
    }

    /** Retorna true si el estacionamiento está dentro del horario de apertura. */
    public boolean estaAbierto() {
        LocalTime ahora = LocalTime.now();
        return !ahora.isBefore(horaApertura) && !ahora.isAfter(horaCierre);
    }

    /**
     * Ocupa un espacio libre acorde al tipo del vehículo.
     * @param vehiculo Vehículo que desea estacionar.
     * @return true si se estacionó correctamente, false en caso contrario.
     */
    public boolean ocuparEspacio(Vehiculo vehiculo) {
        if (!estaAbierto()) {
            System.out.println("⛔ Estacionamiento cerrado. Horario: " + horaApertura + " a " + horaCierre);
            return false;
        }

        // Verificar si el vehículo ya está dentro
        for (EspacioEstacionamiento e : espacios) {
            if (e.isOcupado() && e.getVehiculoOcupante().getPlaca().equalsIgnoreCase(vehiculo.getPlaca())) {
                System.out.println("⚠️ El vehículo con placa " + vehiculo.getPlaca() + " ya está estacionado.");
                return false;
            }
        }

        // Buscar un espacio libre del tipo correcto
        for (EspacioEstacionamiento e : espacios) {
            if (!e.isOcupado() && e.getTipo().equalsIgnoreCase(vehiculo.getTipo())) {
                e.ocupar(vehiculo);
                return true;
            }
        }

        System.out.println("🚫 No hay espacios disponibles para tipo: " + vehiculo.getTipo());
        return false;
    }

    /** Libera todos los espacios ocupados al cerrar el estacionamiento. */
    public void cerrarEstacionamiento() {
        for (EspacioEstacionamiento e : espacios) {
            if (e.isOcupado()) {
                e.liberar();
            }
        }
        System.out.println("🕙 Estacionamiento cerrado. Todos los vehículos han sido retirados.");
    }

    /** Retorna la cantidad de espacios libres. */
    public int getEspaciosDisponibles() {
        int disponibles = 0;
        for (EspacioEstacionamiento e : espacios) {
            if (!e.isOcupado()) disponibles++;
        }
        return disponibles;
    }

    @Override
    public String toString() {
        return "Estacionamiento{" +
                "idEstacionamiento=" + idEstacionamiento +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", horario=" + horaApertura + " - " + horaCierre +
                ", espaciosTotales=" + espaciosTotales +
                ", disponibles=" + getEspaciosDisponibles() +
                '}';
    }
}
