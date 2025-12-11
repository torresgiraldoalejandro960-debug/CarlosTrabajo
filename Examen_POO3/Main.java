package Examen_POO3;

public class Main {

    public static void main(String[] args) {
        
        GestorEnvios gestor = new GestorEnvios(4);

        EnvioLocal e1 = new EnvioLocal ("COD120", "Carlos Perez", 1500.0, 25);
        EnvioLocal e2 = new EnvioLocal ("L002", "Ana Gomez", 2000.0, 40);

        EnvioInternacional e3 = new EnvioInternacional ("INT500", "John Smith", 5000.0, 300.0);
        EnvioInternacional e4 = new EnvioInternacional ("INT750", "Maria Lopez", 7000.0, 500.0);

        gestor.agregarEnvio(e1);
        gestor.agregarEnvio(e2);
        gestor.agregarEnvio(e3);
        gestor.agregarEnvio(e4);

        double total = 0;

        for(Envio e : gestor.getEnvios()){
            if (e != null) {
                System.out.println(e.obtenerDetalles());
                total += e.calcularCostoTotal();
            }
        }
        System.out.println("El costo total de los envios es: "+total);
    }
    
}
