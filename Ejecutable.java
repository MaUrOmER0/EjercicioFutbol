import modelo.Equipo;
import modelo.Jugador;

public class Ejecutable {
    public static void main(String[] args) {

        Equipo miEquipo = new Equipo("Barcelona", 3);
        miEquipo.crearJugador();
        miEquipo.cargar();
        System.out.println("Total de goles del equipo " + miEquipo.calcularTotalGoles());
      

        Jugador miJugador = new Jugador("Raul" , 2);
        
        
    }
}
