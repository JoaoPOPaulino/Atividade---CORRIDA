package br.unitins.trabalho.Principal;

import br.unitins.trabalho.classes.Carro;
import br.unitins.trabalho.classes.Moto;
import br.unitins.trabalho.corrida.Veiculo;


import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int escolha = 0;
        Carro[] vetorCarro = new Carro[2];
        Carro carro = new Carro();
        Moto[] vetorMoto = new Moto[2];
        Moto moto = new Moto();
        Veiculo[] vetorVeiculo = new Veiculo[2];
        Veiculo veiculo = new Veiculo();


        for(int i = 0; i<vetorCarro.length; i++)
        {
            vetorCarro[i] = carro.lerCarro();
        }

        for(int i = 0; i<vetorMoto.length; i++)
        {
            vetorMoto[i] = moto.lerMoto();
        }


        carro.imprimir(vetorCarro);

        veiculo.corridaCarro(vetorCarro);

        for(int segundo = 1; segundo <=20; segundo++) {
            System.out.print("Segundo" + segundo + ":");

            for(Veiculo veiculo : veiculo) {
                if(veiculo instanceof Carro)
                    veiculo.acelerar();

            for(Veiculo veiculo : veiculo) {
                if(veiculo instanceof Moto)
                    veiculo.acelerar();
            }
            if (segundo == 6 || segundo == 11 || segundo == 15) {
                for(Veiculo veiculo : veiculo)
                    veiculo.frear();
            }
        }


        moto.imprimir(vetorMoto);


    }
}