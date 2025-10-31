package vista;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        Vehiculo bmw = new Vehiculo();
        bmw.setPlaca("Erx");
        bmw.setIdVehiculo(123);
        bmw.setTipo("mediano");
        bmw.setHoraEntrada(LocalDateTime.MIN);
        bmw.setHoraSalida(LocalDateTime.MIN);
        //bmw.setPropietario(enNegro);
        
        Estacionamiento box = new Estacionamiento();
        box.setDireccion("Avenida Alcorta");
        box.setEspaciosTotales(20);
        box.setIdEstacionamiento(12);
        box.setNombre("Luna Azul");
        box.setHoraApertura(LocalTime.MAX);
        box.setHoraCierre(LocalTime.MIN);
        //box.setEspacios(espacios);
        
        espacioEstacionamiento lista = new espacioEstacionamiento();
        lista.setIdEspacio(1);
        lista.setTipo("estandar");
        lista.setEstacionamiento(box);
        lista.setVehiculoOcupante(bmw);
        //lista.ocupar(bmw);
        
        Cliente bot = new Cliente();
        bot.setDni("123456789");
        bot.setEmail("hola@mundo.com");
        bot.setIdCliente(1);
        bot.setNombre("Marcos");
        bot.setTelefono("1122334455");
        bot.setApellido("Monterey");
        bot.setActivo(true);
        //bot.setVehiculos(vehiculos);

        Empleado enNegro = new Empleado();
        enNegro.setNombre("Franco");
        enNegro.setApellido("Rojo");
        enNegro.setDni("9988774455");
        enNegro.setEmail("gano@poco.com");
        enNegro.setContrasena("1234");
        enNegro.setActivo(true);
        enNegro.setIdEmpleado(1);
        enNegro.setRol(Empleado.Rol.OPERADOR);
        enNegro.setTelefono("1188446677");
        //enNegro.setReportesGenerados(reportesGenerados);
        
        /*
        Reporte ticket = new Reporte();
        ticket.setEstacionamiento(box);
        ticket.setIdReporte(455);
        ticket.setTipo(Reporte.TipoReporte.DIARIO);
        ticket.setTotalIngresos(500);
        ticket.setFechaInicio(LocalDate.MIN);
        ticket.setFechaFin(LocalDate.MIN);
        */
        
    }
    
}
