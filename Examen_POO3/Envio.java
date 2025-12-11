package Examen_POO3;

public class Envio {
    
    private String codigo;
    private String destinario;
    private double costoBase;

    public Envio (String codigo, String destinario, double costoBase){
        this.codigo = codigo;
        this.destinario = destinario;
        this.costoBase = costoBase;
    }
    public String getCodigo (){
        return codigo;
    }
    public String getDestinario (){
        return destinario;
    }
    public void setDestinario (String destinario){
        this.destinario = destinario;  
    }
    public double getCostoBase (){
        return costoBase;
    }
    public void setCostoBase (double costoBase){
        this.costoBase = costoBase;
    }
    public String obtenerDetalles(){
        String resultado = "Codigo: "+codigo+ "- Destinario: "+destinario+"- Costo Base: "+costoBase+"\n";
        return resultado;
    }
    public double calcularCostoTotal(){
        return 0;
    }
}
