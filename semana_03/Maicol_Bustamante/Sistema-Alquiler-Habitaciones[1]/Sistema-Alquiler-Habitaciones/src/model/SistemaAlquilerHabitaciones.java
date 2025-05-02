package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaAlquilerHabitaciones {

    private List<Habitacion> habitaciones = new ArrayList<>();
    private List<ContratoAlquiler> contratos = new ArrayList<>();

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void alquilarHabitacion(int numeroHabitacion, Inquilino inquilino, LocalDate inicio, LocalDate fin) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numeroHabitacion && h.isDisponible()) {
                contratos.add(new ContratoAlquiler(h, inquilino, inicio, fin));
                System.out.println("Habitación alquilada correctamente.");
                return;
            }
        }
        System.out.println("Habitación no disponible.");
    }

    public void listarHabitacionesDisponibles() {
        for (Habitacion h : habitaciones) {
            if (h.isDisponible()) {
                System.out.println("Habitación N°" + h.getNumero() + " - Precio: " + h.getPrecioMensual());
            }
        }
    }

    public Habitacion buscarHabitacionPorNumero(int numero) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numero) {
                return h;  
            }
        }
        return null; 
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public List<ContratoAlquiler> getContratos() {
        return contratos;
    }

}
