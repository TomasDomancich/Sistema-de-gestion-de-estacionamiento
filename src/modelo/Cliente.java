package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a un cliente que posee uno o varios vehículos registrados
 * en el sistema de estacionamiento.
 */
public class Cliente {

    // ===== Atributos =====
    private int idCliente;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String email;
    private boolean estado;   // true = activo, false = inactivo

    private List<Vehiculo> vehiculos;  // Vehículos asociados al cliente

    // ===== Constructores =====
    public Cliente() {
        this.vehiculos = new ArrayList<>();
        this.estado = true;
    }

    public Cliente(int idCliente, String nombre, String apellido, String dni,
                   String telefono, String email, boolean estado) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.estado = estado;
        this.vehiculos = new ArrayList<>();
    }

    // ===== Getters y Setters =====
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActivo() {
        return estado;
    }

    public void setActivo(boolean estado) {
        this.estado = estado;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    // ===== Métodos funcionales =====

    /**
     * Agrega un vehículo a la lista del cliente.
     * @param vehiculo vehículo nuevo
     */
    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    /**
     * Elimina un vehículo del cliente por su placa.
     * @param placa la matrícula del vehículo
     * @return true si se eliminó correctamente
     */
    public boolean eliminarVehiculo(String placa) {
        return vehiculos.removeIf(v -> v.getPlaca().equalsIgnoreCase(placa));
    }

    /**
     * Activa al cliente.
     */
    public void activar() {
        this.estado = true;
    }

    /**
     * Desactiva al cliente.
     */
    public void desactivar() {
        this.estado = false;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + idCliente +
                ", nombre='" + nombre + " " + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", activo=" + estado +
                ", vehiculos=" + vehiculos.size() +
                '}';
    }
}
