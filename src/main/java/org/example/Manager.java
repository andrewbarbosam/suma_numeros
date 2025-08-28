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
      return this.numeros.stream().mapToInt(Integer::intValue).sum();

}
