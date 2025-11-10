package modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {
    // ===== Atributos =====
    private int idTicket;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    private float tarifaHora;
    private float total;
    private String estado;
    private Pago pago;

    // ===== Constructores =====
    public Ticket(int idTicket, LocalDateTime horaEntrada, float tarifaHora) {
        this.idTicket = idTicket;
        this.horaEntrada = horaEntrada;
        this.tarifaHora = tarifaHora;
        this.estado = "Abierto";
    }

    public void registrarSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
        calcularTotal();
        this.estado = "Cerrado";
    }

    // ===== Getters y Setters =====
    public int getIdTicket() { return idTicket; }
    public float getTotal() { return total; }
    public String getEstado() { return estado; }

    // ===== Métodos funcionales =====
    public void asignarPago(Pago pago) {
        this.pago = pago;
    }

    public void calcularTotal() {
        if (horaSalida != null) {
            long minutos = Duration.between(horaEntrada, horaSalida).toMinutes();
            float horas = minutos / 60.0f;
            this.total = horas * tarifaHora;
        } else {
            this.total = 0;
        }
    }

    public void generarComprobante() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("=== COMPROBANTE DE ESTACIONAMIENTO ===");
        System.out.println("Ticket Nº: " + idTicket);
        System.out.println("Entrada: " + horaEntrada.format(fmt));
        System.out.println("Salida: " + (horaSalida != null ? horaSalida.format(fmt) : "En curso"));
        System.out.println("Tarifa por hora: $" + tarifaHora);
        System.out.println("Total: $" + total);
        System.out.println("Estado: " + estado);
    }
}
