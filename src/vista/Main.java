package vista;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

import modelo.Cliente;
import modelo.Empleado;
import modelo.EspacioEstacionamiento;
import modelo.Estacionamiento;
import modelo.Reporte;
import modelo.Vehiculo;
import modelo.Empleado.Rol;
import modelo.Reporte.TipoReporte;


public class Main {
    
    public static void main(String[] args) {

        // Prueba de clases

        Cliente bot = new Cliente(1, "Marcos", "Monterrey", "12345678", "1122334455", "hola@mundo.com", true);

        Vehiculo bmw = new Vehiculo(1, "ERX", "Auto", bot);

        Estacionamiento box = new Estacionamiento();
        
        EspacioEstacionamiento first = new EspacioEstacionamiento(1, "Auto");
        first.setEstacionamiento(box);
        first.setVehiculoOcupante(bmw);

        Empleado slave = new Empleado(1, "Franco", "Rojo", "23456789", "gano@poco.com", "1122334456", Rol.OPERADOR, "contraseña", true);
        
        Reporte ticket = new Reporte(1, TipoReporte.DIARIO, LocalDate.now(), LocalDate.now(), box);
        
    }
    
}
