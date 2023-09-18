package Nodos_Y_Listas;

public class Nodo {
    
    Nodo antes;
    String evento = "🍮"; // Que tipo de evento es
    int dato; // El dato de 1-100
    String cientifico; // El cientifico (Rosen o Einstein)
    Nodo despues;

    Nodo(int d, String cientifico){

        this.antes = null;
        this.cientifico = cientifico;
        this.dato = d;
        this.despues = null;
    }

    Nodo(int p, String cientifico, Nodo antes, Nodo despues){
        this.antes = antes;
        this.cientifico = cientifico;
        this.dato = p;
        this.despues = despues;
    }

    


    // eventonizador

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    // Cientifico
    
    public String getCientifico() {
        return cientifico;
    }

    public void setCientifico(String cientifico) {
        this.cientifico = cientifico;
    }

    // Datos

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    // Siguiente Nodo

    public Nodo getNext() {
        return despues;
    }

    public void setNext(Nodo next) {
        this.despues = next;
    }

    // Nodo Anterior

    public Nodo getAntes() {
        return antes;
    }

    public void setAntes(Nodo antes) {
        this.antes = antes;
    }

    public void imprimirSiguiente(){
        System.out.println(this.despues.getDato());
    }
}
