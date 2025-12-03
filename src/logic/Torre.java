package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Torre {

    public Stack<Disco> discos;
    private String nombre;

    public Torre(String nombre) {
        this.nombre = nombre;
        this.discos = new Stack<>();
    }

    public void apilarDisco(Disco disco){
        discos.push(disco);
    }

    public Disco desapilarDisco(){
        return discos.isEmpty() ? null : discos.pop();
    }

    public Disco peek(){
        return discos.isEmpty() ? null : discos.peek();
    }

    public boolean isEmpty(){
        return discos.isEmpty();
    }

    public String getNombre(){
        return nombre;
    }

    public void mostrarDiscos(){
        System.out.println("Torre " + nombre + ":");
        List<Disco> discoOrdenados = new ArrayList<>(discos);
        for(int i = discoOrdenados.size() - 1; i >= 0; i--)
            System.out.println(discoOrdenados.get(i) + " ");
        System.out.println();
    }
}
