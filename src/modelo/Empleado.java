package modelo;

import java.util.List;

public class Empleado {

    // ===== Atributos =====
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String telefono;
    private String rol;          // Ej: "Administrador", "Operador"
    private String contraseña;   // Se puede encriptar más adelante
    private boolean estado;      // true = activo, false = inactivo

    private List<Reporte> reportesGenerados;  // Reportes asociados al empleado

    // ===== Constructores =====
    public Empleado() {
    }

    public Empleado(int idEmpleado, String nombre, String apellido, String dni, 
                    String email, String telefono, String rol, String contraseña, 
                    boolean estado, List<Reporte> reportesGenerados) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.rol = rol;
        this.contraseña = contraseña;
        this.estado = estado;
        this.reportesGenerados = reportesGenerados;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<Reporte> getReportesGenerados() {
        return reportesGenerados;
    }

    public void setReportesGenerados(List<Reporte> reportesGenerados) {
        this.reportesGenerados = reportesGenerados;
    }
}
