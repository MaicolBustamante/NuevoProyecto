
package model;

import java.time.LocalDate;

public class ContratoAlquiler {
    private Habitacion habitacion;
    private Inquilino inquilino;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public ContratoAlquiler(Habitacion habitacion, Inquilino inquilino, LocalDate fechaInicio, LocalDate fechaFin) {
        this.habitacion = habitacion;
        this.inquilino = inquilino;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.habitacion.setDisponible(false); 
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
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
    
}
