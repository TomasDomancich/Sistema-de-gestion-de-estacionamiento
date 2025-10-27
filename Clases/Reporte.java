import java.time.LocalDate;

public class Reporte {
    private int idReporte;
    private String tipo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private float totalIngresos;

    // Constructor
    public Reporte(int idReporte, String tipo, LocalDate fechaInicio, LocalDate fechaFin, float totalIngresos) {
        this.idReporte = idReporte;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.totalIngresos = totalIngresos;
    }

    // Getters y Setters
    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
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
}