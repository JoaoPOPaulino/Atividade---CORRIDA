package br.unitins.trabalho.Principal;

import br.unitins.trabalho.classes.Carro;
import br.unitins.trabalho.classes.Moto;



import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int escolhaC = 0;
        int escolhaM = 0;
        Carro[] vetorCarro = new Carro[2];
        Carro carro = new Carro();
        Moto[] vetorMoto = new Moto[2];
        Moto moto = new Moto();

        //Dados do Carro
        for (int i = 0; i < vetorCarro.length; i++) {
            vetorCarro[i] = carro.lerCarro();
        }

        carro.imprimir(vetorCarro);

        //Inicio Corrida
        for (int segundo = 1; segundo <= 20; segundo++) {
            System.out.print("Segundo" + segundo + ":");
            for() {
                    lerAceleracao
            }
                if (segundo == 6 || segundo == 11 || segundo == 15) {
                    for()
                        lerFrear
                }
            }
            /*for (int i = 0; i < vetorMoto.length; i++) {
            vetorMoto[i] = moto.lerMoto();
        }*/
            //moto.imprimir(vetorMoto);


        }
    }