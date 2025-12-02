public class Vehiculos {
    private String marca;
    private String modelo;
    private double velocidad ;
    private double combustible;

    public Vehiculos (String marca, String modelo, double velocidad, double combustible){ 
    this.marca = marca;
    this.modelo = modelo;
    this.velocidad = velocidad;
    this.combustible = combustible;
    }
    public String getMarca (){
        return marca;
    }
    public void setMarca (String marca){
        this.marca = marca;
    }
    public String getModelo (){
        return modelo;
    }
    public void setModelo (String modelo){
        this.modelo = modelo;
    }
    public double getVelocidad (){
        return velocidad;
    }
    public void setVelocidad (double velocidad){
        this.velocidad = velocidad;
    }
    public double getCombustible (double combustible){
        return combustible;
    }
    public void setCombustible (double combustible){
        this.combustible = combustible;
    }
    public double calcularConsumo(double distancia){
        double rendimiento = 10.0;
        return distancia / rendimiento;
        
    }
    
    
}
