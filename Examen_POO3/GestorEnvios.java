package Examen_POO3;

public class GestorEnvios {
    
    private Envio[] envios;
    private int contador;

    public int getContador (){
        return contador;
    }

    public GestorEnvios (int capacidad){
        envios = new Envio[capacidad];
        contador = 0;
    }

    public void agregarEnvio (Envio e){
        if (contador < envios.length){
            envios[contador] = e;
            contador++;
        }else{
            System.out.println("No se pueden agregar mas envios");
        }
    }
    public Envio[] getEnvios (){
        return envios;
    }

}
