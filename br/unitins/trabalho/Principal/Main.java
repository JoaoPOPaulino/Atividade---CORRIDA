package br.unitins.trabalho.Principal;

import java.util.Scanner;
import br.unitins.trabalho.classes.Carro;
import br.unitins.trabalho.classes.Moto;



public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int escolha = 0;
        Carro[] vetorCarro = new Carro[2];
        Carro carro = new Carro();
        Moto[] vetorMoto = new Moto[2];
        Moto moto = new Moto();



        for(int i = 0; i<vetorCarro.length; i++)
        {
            vetorCarro[i] = carro.lerCarro();

        }

        carro.imprimir(vetorCarro);


    }
}