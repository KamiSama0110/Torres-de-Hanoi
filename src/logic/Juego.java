package logic;

import java.util.Scanner;

public class Juego {

    private Torre[] torres;
    private int numDiscos;

    public Juego(int numDiscos) {

        this.numDiscos = numDiscos;
        this.torres = new Torre[3];
        torres[0] = new Torre("A");
        torres[1] = new Torre("B");
        torres[2] = new Torre("C");

        for(int i = numDiscos; i >= 1; i--){
            torres[0].apilarDisco(new Disco(i));
        }
    }

    public void jugar(){

        Scanner sc = new Scanner(System.in);

        while (!juegoTerminado()){

            mostrarTorres(); //muestra las torres en la consola
            System.out.println("Elige la torre de origen (A, B, C): ");
            char origen = sc.next().toUpperCase().charAt(0);

            System.out.println("Elige la torre de destino (A, B, C): ");
            char destino = sc.next().toUpperCase().charAt(0);

            if(moverDisco(origen, destino)){
                System.out.println("Movimiento exitoso!!");
            }else
                System.out.println("Movimento incorrecto, pruebe otra vez!!");

        }

        System.out.println("Juego completado");

    }

    private boolean moverDisco(char origen, char destino) {

        int indiceOrigen = obtenerIndiceTorre(origen);// obtengo el indice de
        int indiceDestino = obtenerIndiceTorre(destino);// torre origen o y destino

        if(indiceOrigen == -1 || indiceDestino == -1){
            return false;
        }

        Disco discoOrigen = torres[indiceOrigen].peek();

        if(discoOrigen == null) return false;

        Disco discoDestino = torres[indiceDestino].peek();

        if(discoDestino != null && discoDestino.getLongitud() < discoOrigen.getLongitud())
            return false;

        torres[indiceDestino].apilarDisco(torres[indiceOrigen].desapilarDisco());

        return true;
    }

    private int obtenerIndiceTorre(char nombre) {
        switch (nombre){
            case 'A' : return 0;
            case 'B' : return 1;
            case 'C' : return 2;
            default: return -1;
        }
    }

    private void mostrarTorres() {
        for(Torre t: torres)
            t.mostrarDiscos();
    }

    private boolean juegoTerminado() {
        return torres[2].discos.size() == numDiscos;
    }
}
