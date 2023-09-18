package Nodos_Y_Listas;
import java.util.Random;

public class Randoms {
    
    public String getCientifico() {

        String[] cientificos = {"Rosen", "Einstein"};

        Random random = new Random();
        
        int indice = random.nextInt(cientificos.length);

        String cientificoSeleccionado = cientificos[indice];

        return cientificoSeleccionado;
    }

    public int getNumero(){

        Random random = new Random();

        int numero = random.nextInt(1, 100);

        return numero;

    }
}


