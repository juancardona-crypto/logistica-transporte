package main.java.com.example;
public class BuqueCarga extends Transporte{
    private int cantidadContenedores;

    public BuqueCarga(String idTransporte, double combustible, double capacidadCarga, int cantidadContenedores){
        super(idTransporte, combustible, capacidadCarga);
        this.cantidadContenedores = cantidadContenedores;

    }

    public void atracarEnPuerto() {
        System.out.println("Buque " + getIdTransporte() + " ha atracado en puerto y está listo para descarga.");
    }

    public void mostrarDatos() {
        double costoPorKm = 0.5;          
        double distancia = 1000;    
        double costoViaje = distancia * costoPorKm;
        
        System.out.println("Buque de carga: " + getIdTransporte());
        System.out.println("Combustible actual: " + getCombustible());
        System.out.println("Capacidad de carga: " + getCapacidadCarga());
        System.out.println("Cantidad de contenedores: " + cantidadContenedores);
        System.out.printf("Costo estimado de viaje (%.0f km): USD %.2f%n", distancia, costoViaje);
        System.out.println("-------------------");
    }
}
    

