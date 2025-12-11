package Examen_POO3;

public class EnvioLocal extends Envio {
    
    private int distancia;

    public EnvioLocal (String codigo, String destinario, double costoBase, int distancia){
        super(codigo, destinario, costoBase);
        this.distancia = distancia;
    }

    @Override
    public String obtenerDetalles(){
        String resultado = super.obtenerDetalles() + "-Distancia: " + distancia + " km\n";
        return resultado;
    }

    @Override
    public double calcularCostoTotal(){
        return getCostoBase();
    }
}
