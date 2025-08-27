package org.example;
import java.util.List;
import java.util.ArrayList;

public class Manager {
    private final List<Integer> numeros;

    public Manager(){

        this.numeros = new ArrayList<>();
    }

    public void addNumero(int numero){
        this.numeros.add(numero);
    }


    public int getSuma() {
        int total = 0;
        for (Integer numero : this.numeros) {
            total += numero;
        }
        return total;
    }
}
