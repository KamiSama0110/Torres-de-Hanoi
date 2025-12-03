package logic;

public class Disco {

    private int longitud;

    public Disco(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud(){
        return longitud;
    }

    @Override
    public String toString(){
        return String.valueOf(longitud);
    }
}
