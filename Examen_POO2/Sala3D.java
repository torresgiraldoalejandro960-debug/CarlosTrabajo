package Examen_POO2;

public class Sala3D extends Reserva{
     
    private double valorLentes;

    public Sala3D (String codigo, String nombrePelicula, double costoBase, double valorLentes ){
        super(codigo, nombrePelicula, costoBase);
        this.valorLentes = valorLentes;
    }
    public double getValorLentes (){
        return valorLentes;
    }

    @Override
    public String obtenerDetalles(){
        String resultado = super.obtenerDetalles();
        resultado += "- Valor de Lentes: "+valorLentes;
        return resultado;
    }

    @Override
     public double calcularCostoTotal(){
        return getCostoBase()+valorLentes;
    }
}
