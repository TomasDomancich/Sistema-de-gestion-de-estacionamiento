public class EspacioEstacionamiento {

    private int idEspacio;
    private boolean ocupado;
    private String tipo; // por ejemplo: "auto", "moto", "discapacitado"

    // Constructor vacío
    public EspacioEstacionamiento() {}

    // Constructor con parámetros
    public EspacioEstacionamiento(int idEspacio, boolean ocupado, String tipo) {
        this.idEspacio = idEspacio;
        this.ocupado = ocupado;
        this.tipo = tipo;
    }

    // Getters y Setters
    public int getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(int idEspacio) {
        this.idEspacio = idEspacio;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // ---- Métodos útiles ----

    // Ocupa el espacio si está libre
    public boolean ocupar() {
        if (!ocupado) {
            ocupado = true;
            return true;
        }
        return false; // ya estaba ocupado
    }

    // Libera el espacio si está ocupado
    public boolean liberar() {
        if (ocupado) {
            ocupado = false;
            return true;
        }
        return false; // ya estaba libre
    }

    // Muestra información del espacio
    @Override
    public String toString() {
        return "EspacioEstacionamiento{" +
                "idEspacio=" + idEspacio +
                ", ocupado=" + ocupado +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
