public class Estacionamiento {
    private int idEstacionamiento;
    private String nombre;
    private String direccion;
    private int espaciosTotales;
    private int espaciosDisponibles;

    // Constructor vacío
    public Estacionamiento() {}

    // Constructor con parámetros
    public Estacionamiento(int idEstacionamiento, String nombre, String direccion, int espaciosTotales, int espaciosDisponibles) {
        this.idEstacionamiento = idEstacionamiento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.espaciosTotales = espaciosTotales;
        this.espaciosDisponibles = espaciosDisponibles;
    }

    // Getters y Setters
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

    public int getEspaciosDisponibles() {
        return espaciosDisponibles;
    }

    public void setEspaciosDisponibles(int espaciosDisponibles) {
        this.espaciosDisponibles = espaciosDisponibles;
    }
}
