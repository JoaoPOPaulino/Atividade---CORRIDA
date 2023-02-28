package br.unitins.trabalho.Principal;

import br.unitins.trabalho.classes.Carro;
import br.unitins.trabalho.classes.Moto;



import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int escolhaC = 0;
        int escolhaM = 0;

        System.out.print("Informe o número de competidores do Carro: ");
        escolhaC = scan.nextInt();
        System.out.print("Informe o número de competidores da Moto: ");
        escolhaM = scan.nextInt();

        Carro[] vetCarro = new Carro[escolhaC];
        Carro carro = new Carro();
        Moto[] vetMoto = new Moto[escolhaM];
        Moto moto = new Moto();


        for (int i = 0; i < vetCarro.length; i++) {
            vetCarro[i] = carro.lerCarro();
        }

        carro.imprimir(vetCarro);


        for (int segundo = 1; segundo <= 20; segundo++) {
            System.out.println("Segundo" + segundo + ":");

            if (segundo == 6 || segundo == 11 || segundo == 15) {
                carro.Frear(vetCarro);
            } else {
                carro.Acelerar(vetCarro);
            }
        }


        for (int i = 0; i < vetMoto.length; i++) {
            vetMoto[i] = moto.lerMoto();
        }

        moto.imprimir(vetMoto);

        for (int segundo = 1; segundo <= 20; segundo++) {
            System.out.println("Segundo" + segundo + ":");

            if (segundo == 6 || segundo == 11 || segundo == 15) {
                moto.Frear(vetMoto);
            } else {
                moto.Acelerar(vetMoto);
            }
        }

    }
}