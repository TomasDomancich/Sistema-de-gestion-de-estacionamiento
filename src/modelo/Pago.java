package modelo;

import java.time.LocalDateTime;

public class Pago {
    // ===== Atributos =====
    private int idPago;
    private LocalDateTime fechaPago;
    private float monto;
    private String metodoPago;

    // ===== Constructores =====
    public Pago(int idPago, float monto, String metodoPago) {
        this.idPago = idPago;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.fechaPago = LocalDateTime.now();
    }

    // ===== Getters y Setters =====
    public int getIdPago() { return idPago; }
    public LocalDateTime getFechaPago() { return fechaPago; }
    public float getMonto() { return monto; }
    public String getMetodoPago() { return metodoPago; }

    public void setMonto(float monto) { this.monto = monto; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }

    // ===== Métodos funcionales =====
    public void procesarPago() {
        System.out.println("Procesando pago de $" + monto + " mediante " + metodoPago);
        // Aquí podría conectarse con un sistema de cobros o registrarse en base de datos
    }
}
