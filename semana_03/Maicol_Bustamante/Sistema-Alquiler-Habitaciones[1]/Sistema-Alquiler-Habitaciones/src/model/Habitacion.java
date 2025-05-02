
package model;

public class Habitacion {
    private int numero;
    private double precioMensual;
    private boolean disponible;

    public Habitacion(int numero, double precioMensual) {
        this.numero = numero;
        this.precioMensual = precioMensual;
        this.disponible = true; 
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }

    public void setPrecioMensual(double precioMensual) {
        this.precioMensual = precioMensual;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
