package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un empleado del sistema de estacionamiento.
 */
public class Empleado {

    // ===== Atributos =====
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String telefono;
    private Rol rol;          // Enum: ADMINISTRADOR, OPERADOR
    private String contraseña;
    private boolean estado;   // true = activo, false = inactivo

    private List<Reporte> reportesGenerados;

    // ===== Constructores =====
    public Empleado() {
        this.reportesGenerados = new ArrayList<>();
        this.estado = true;
    }

    public Empleado(int idEmpleado, String nombre, String apellido, String dni,
                    String email, String telefono, Rol rol, String contraseña, boolean estado) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.rol = rol;
        this.contraseña = contraseña;
        this.estado = estado;
        this.reportesGenerados = new ArrayList<>();
    }

    // ===== Getters y Setters =====
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isActivo() {
        return estado;
    }

    public void setActivo(boolean estado) {
        this.estado = estado;
    }

    public List<Reporte> getReportesGenerados() {
        return reportesGenerados;
    }

    public void setReportesGenerados(List<Reporte> reportesGenerados) {
        this.reportesGenerados = reportesGenerados;
    }

    // ===== Métodos funcionales =====

    /**
     * Agrega un reporte generado por este empleado.
     */
    public void agregarReporte(Reporte reporte) {
        this.reportesGenerados.add(reporte);
    }

    /**
     * Cambia el estado del empleado a activo.
     */
    public void activar() {
        this.estado = true;
    }

    /**
     * Cambia el estado del empleado a inactivo.
     */
    public void desactivar() {
        this.estado = false;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + idEmpleado +
                ", nombre='" + nombre + " " + apellido + '\'' +
                ", rol=" + rol +
                ", activo=" + estado +
                ", reportesGenerados=" + reportesGenerados.size() +
                '}';
    }

    // ===== Enum interno =====
    public enum Rol {
        ADMINISTRADOR, OPERADOR
    }
}
