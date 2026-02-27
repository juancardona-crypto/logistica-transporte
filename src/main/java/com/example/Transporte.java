package main.java.com.example;
public class Transporte {
    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    public Transporte(String idTransporte, double combustible, double capacidadCarga){
        this.idTransporte = idTransporte;
        this.combustible = combustible;
        this.capacidadCarga = capacidadCarga;
    }


    public String getIdTransporte(){
        return idTransporte;
    }

    public void setCombustible(double nivel){
        if (nivel >= 0){
            this.combustible = nivel;
        } else{
            System.out.println("Error: El nivel de combustible no puede ser negativo. Valor no modificado.");

        }
    }
    public double getCombustible(){
        return combustible;
    }

    public void setCapacidadCarga(double carga){
        if (carga >= 0){
            this.capacidadCarga = carga;
        } else{
            System.out.println("Error: El peso de la carga no puede ser negativo. Valor no modificado.");

        }
    }
    
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void viajar(int distancia) {
        if (distancia <= 0) {
            System.out.println("Error: La distancia no puede ser negativa.");
            return;
        }
        
        double consumo = distancia / 10.0;  
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(idTransporte + " viajó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println(idTransporte + " no tiene suficiente combustible para recorrer " + distancia + " km.");
        }
    }

    
}
