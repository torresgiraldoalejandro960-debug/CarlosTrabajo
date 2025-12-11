package Examen_POO3;

public class EnvioInternacional extends Envio {
    
    private double impuestoAduana;

    public EnvioInternacional (String codigo, String destinario, double costoBase, double impuestoAduana){
        super(codigo, destinario, costoBase);
        this.impuestoAduana = impuestoAduana;
    }
    @Override
    public String obtenerDetalles(){
        String resultado = super.obtenerDetalles() + "-Impuesto de Aduana: " + impuestoAduana + "\n";
        return resultado;  
    }

    @Override
    public double calcularCostoTotal(){
        return getCostoBase() + impuestoAduana;
    }
    
}
