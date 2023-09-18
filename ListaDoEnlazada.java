package Nodos_Y_Listas;

public class ListaDoEnlazada{

    Nodo cabeza;
    Nodo cola;
    Nodo eventoA = null;
    Nodo eventoB = null;
    Nodo eventoC = null;

    ListaDoEnlazada(){
        Nodo cabeza = null;
        Nodo cola = null;
    }
    


    public boolean vacio(){
        return cabeza==null;
    }

    public boolean sonCoprimos(int a, int b) {

        int max = Math.max(a,b);
        int min = Math.min(a, b);
        int resultado = 0;

        do {

            resultado = min;
            min = max % min;
            max = resultado;

        }while(min != 0);

        if(max==1){
            return true;
        }else{
            return false;
        }
    }

    

    public boolean esPrimo(int numero) {

        if(numero==1){
            return false;
        }

        for(int i=2 ;i<numero ;i++){

            if(numero%i == 0){
                return false;
            }


        }

        return true;
    }

    // Empezar Programa
 
    public void empezarEventos(){

        int contadorEventoA = 0;
        int contadorEventoB = 0;
        int contadorEventoC = 0;
        int contadorNodos = 0;

        for (int i = 1; i<=22 ;i++){

            if (!vacio()){

                contadorNodos++;
                Randoms numero = new Randoms();

                String cientifico = numero.getCientifico();
                int dato = numero.getNumero();

                cabeza = new Nodo(dato,cientifico,null,cabeza);
                cabeza.despues.antes = cabeza;

                boolean datob = esPrimo(dato);


                if(datob&&contadorEventoA==0){
                    cabeza.setCientifico("Einstein");
                    cabeza.setEvento("Evento A");
                    eventoA = cabeza;
                    contadorEventoA=1;

                    System.out.println("Se ha producido un evento de Tipo A:"+dato);
                    System.out.println("Este evento fue encontrado en el nodo N:"+contadorNodos);
                    System.out.println("[" + cabeza.dato+"|"+cabeza.cientifico+"|"+ cabeza.evento+"]");
                    System.out.println("\n");

                }else if(datob&&eventoA!=null&&contadorEventoB==0){
                    
                    cabeza.setEvento("Evento B");
                    eventoB = cabeza;
                    contadorEventoB=1;

                    System.out.println("Se ha producido un evento de Tipo B:"+dato);
                    System.out.println("Este evento fue encontrado en el nodo N:"+contadorNodos);
                    System.out.println("[" + cabeza.dato+"|"+cabeza.cientifico+"|"+ cabeza.evento+"]");
                    System.out.println("\n");

                    contadorEventoC = 0;

                }else if(eventoA!=null&&eventoB!=null&&sonCoprimos(dato, eventoA.getDato())&&contadorEventoC==0){

                    cabeza.setEvento("Evento C");
                    contadorEventoC=1;

                    System.out.println("Se ha producido un evento de Tipo C:"+dato);
                    System.out.println("Este evento fue encontrado en el nodo N:"+contadorNodos);
                    System.out.println("[" + cabeza.dato+"|"+cabeza.cientifico+"|"+ cabeza.evento+"]");
                    System.out.println("\n");

                    if(esPrimo(dato)&&eventoA.getCientifico()=="Einstein"){
                        System.out.println("El cientifico "+cabeza.getCientifico()+" Viajó al pasado y le entrego datos claves para el avance del proyecto a "+eventoA.getCientifico());
                        System.out.println("[" + cabeza.dato+"|"+cabeza.cientifico+"|"+ cabeza.evento+"]"+"<="+"[" + eventoB.dato+"|"+eventoB.cientifico+"|"+ eventoB.evento+"]"+"<="+"[" + eventoA.dato+"|"+eventoA.cientifico+"|"+ eventoA.evento+"]");
                        System.out.println("\n");
                    }else{
                        System.out.println("El cientifico "+cabeza.getCientifico()+" Viajó al pasado, pero solo pudo observar");
                        System.out.println("[" + cabeza.dato+"|"+cabeza.cientifico+"|"+ cabeza.evento+"]"+"<="+"[" + eventoB.dato+"|"+eventoB.cientifico+"|"+ eventoB.evento+"]"+"<="+"[" + eventoA.dato+"|"+eventoA.cientifico+"|"+ eventoA.evento+"]");
                        System.out.println("\n");
                    }

                    // Reiniciamos contadores para que pueda suceder otra linea temporal
                    contadorEventoA = 0;
                    contadorEventoB = 0;
                    
                }

            }else{

                Randoms numero = new Randoms();
                int dato = numero.getNumero();
                String cientifico = numero.getCientifico();

                cabeza=cola= new Nodo(dato, cientifico);
                
                contadorNodos++;
            }
        }
    }

    // Mostrar Lista

    public void mostrarListaInicioFin(){
        if (!vacio()){
            String datos = "<=";

            Nodo ayudante = cabeza;

            while(ayudante!=null){

                datos = datos + "[" + ayudante.dato+"|"+ayudante.cientifico+"|"+ ayudante.evento+"]<=";
                ayudante = ayudante.despues;
            }

            System.out.println("Datos"+datos);
        }
    }
}