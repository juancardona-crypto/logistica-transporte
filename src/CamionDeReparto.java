public class CamionDeReparto extends Transporte{

    private boolean tieneRefrigeracion = true;

    public CamionDeReparto(String idTransporte, double combustible, double capacidadCarga, boolean tieneRefrigeracion){
        super(idTransporte, combustible, capacidadCarga);
        this.tieneRefrigeracion = tieneRefrigeracion;

    }

    @Override
    public void viajar(int distancia) {
        if (distancia <= 0) {
            System.out.println("Error: Distancia no puede ser negativa.");
            return;
        }
        
        double unidadesPor10km = tieneRefrigeracion ? 2.0 : 1.0;
        double combustibleNecesario = (distancia / 10.0) * unidadesPor10km;

        if (getCombustible() >= combustibleNecesario) {
            setCombustible(getCombustible() - combustibleNecesario);
            System.out.println(getIdTransporte() + " viajó " + distancia + " km. " +
                               "(Refrigeración: " + tieneRefrigeracion + ") " +
                               "Combustible restante: " + getCombustible());
        } else {
            System.out.println(getIdTransporte() + " no tiene suficiente combustible (" +
                               combustibleNecesario + " requeridos).");
        }
    }
    
}
