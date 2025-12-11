package Examen_POO2;

public class Main {

    public static void main(String[] args) {
            
    GestorReservas gestor = new GestorReservas(4);

    salaTradicional r1 = new salaTradicional("COD120", "La noche del demonio", 10.000, 120);
    salaTradicional r2 = new salaTradicional("COD402", "El conjuro", 15.000, 250);

    Sala3D r3 = new Sala3D("COD502", "Eso IT", 30.000, 5.000);
    Sala3D r4 = new Sala3D("COD107", "El perfume", 35.000, 5.000);
    
    gestor.agregarReserva(r1);
    gestor.agregarReserva(r2);
    gestor.agregarReserva(r3);
    gestor.agregarReserva(r4);
            // junto mejor practica 
    Reserva [] reservas = gestor.getReservas();
            //Innecesario 
    for(int i = 0; i < gestor.getContador(); i++){
        System.out.println(reservas[i].obtenerDetalles());
    }

    double total = 0;

    for(Reserva r : gestor.getReservas()){
        if (r != null) {
            System.out.println(r.obtenerDetalles());
            total += r.calcularCostoTotal();
            
        }
    }
    System.out.println("El costo total es: "+total);
   
    }

    
    

}
