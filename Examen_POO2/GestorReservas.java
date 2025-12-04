package Examen_POO2;

public class GestorReservas {
    
    private Reserva [] reservas;
    private int contador;

    public int getContador (){
        return contador;
    }
    public void setContador (int contador){
        this.contador = contador;
    }
    
    public GestorReservas (int tamaño){
        reservas = new Reserva[tamaño];
        contador = 0;
    }
    public void agregarReserva(Reserva r){
        if (contador < reservas.length ) {
            reservas[contador] = r;
            contador++;
        }else{
            System.out.print("NO puede agregar mas");
        }
    }
    public Reserva [] getReservas(){
        return reservas;
    }
}
