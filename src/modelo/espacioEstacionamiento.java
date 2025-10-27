package modelo;

import java.time.LocalDateTime;

/**
 * Representa un espacio individual dentro del estacionamiento.
 * Puede estar ocupado por un vehículo o libre.
 */
public class EspacioEstacionamiento {

    // ===== Atributos =====
    private int idEspacio;
    private boolean ocupado;
    private String tipo; // "auto", "moto", "discapacitado"
    private Vehiculo vehiculoOcupante; // Vehículo actualmente en el espacio
    private Estacionamiento estacionamiento; // Estacionamiento al que pertenece

    // ===== Constructores =====
    public EspacioEstacionamiento() {}

    public EspacioEstacionamiento(int idEspacio, String tipo) {
        this.idEspacio = idEspacio;
        this.tipo = tipo;
        this.ocupado = false;
        this.vehiculoOcupante = null;
    }

    // ===== Getters y Setters =====
    public int getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(int idEspacio) {
        this.idEspacio = idEspacio;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Vehiculo getVehiculoOcupante() {
        return vehiculoOcupante;
    }

    public void setVehiculoOcupante(Vehiculo vehiculoOcupante) {
        this.vehiculoOcupante = vehiculoOcupante;
    }

    public Estacionamiento getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Estacionamiento estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    // ===== Métodos de negocio =====

    /** Retorna true si el espacio está libre. */
    public boolean estaDisponible() {
        return !ocupado;
    }

    /**
     * Ocupa el espacio con un vehículo, si está libre.
     * @param vehiculo Vehículo a estacionar.
     * @return true si se ocupó exitosamente, false si ya estaba ocupado.
     */
    public boolean ocupar(Vehiculo vehiculo) {
        if (!ocupado) {
            this.vehiculoOcupante = vehiculo;
            this.ocupado = true;
            vehiculo.setHoraEntrada(LocalDateTime.now());
            return true;
        }
        return false; // ya estaba ocupado
    }

    /**
     * Libera el espacio y elimina la referencia al vehículo.
     * Registra la hora de salida en el vehículo.
     * @return true si se liberó correctamente, false si ya estaba libre.
     */
    public boolean liberar() {
        if (ocupado && vehiculoOcupante != null) {
            vehiculoOcupante.setHoraSalida(LocalDateTime.now());
            this.vehiculoOcupante = null;
            this.ocupado = false;
            return true;
        }
        return false; // ya estaba libre
    }

    @Override
    public String toString() {
        String placa = (vehiculoOcupante != null) ? vehiculoOcupante.getPlaca() : "N/A";
        return "EspacioEstacionamiento{" +
                "idEspacio=" + idEspacio +
                ", ocupado=" + ocupado +
                ", tipo='" + tipo + '\'' +
                ", vehiculo='" + placa + '\'' +
                '}';
    }
}
