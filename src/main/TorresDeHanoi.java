package main;

import logic.Juego;

import java.util.Scanner;

public class TorresDeHanoi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero de discos: ");
        int numDiscos = sc.nextInt();
        Juego juego = new Juego(numDiscos);
        juego.jugar();
    }

}
