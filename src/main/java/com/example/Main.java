package main.java.com.example;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    
    CamionDeReparto camion = new CamionDeReparto("1", 2000, 1000.0, true);
    BuqueCarga buque = new BuqueCarga("2", 5000.0, 25000.0, 50);

    camion.setCombustible(-10);
    System.out.println("Combustible después de intentar setCombustible(): " + camion.getCombustible());

    ArrayList<Transporte> flota = new ArrayList<>();
     flota.add(camion);
     flota.add(buque);
        
     for (Transporte transporte : flota) {
            System.out.println("Transporte: " + transporte.getIdTransporte());
            System.out.println("Combustible ANTES del viaje: " + transporte.getCombustible());
            
            transporte.viajar(100);
            
            System.out.println("Combustible DESPUÉS del viaje: " + transporte.getCombustible());
            System.out.println("-----------------------------");
        }
  }

}
