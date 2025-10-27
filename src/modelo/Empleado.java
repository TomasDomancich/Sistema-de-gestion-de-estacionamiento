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
    private String contrasenia;  // Luego se puede encriptar
    private boolean estado;      // true = activo, false = inactivo

    private List<Reporte> reportesGenerados;  // Asociación con los reportes creados por el empleado

    // (Constructores, getters y setters se implementarán después)
}
