package br.unitins.trabalho.classes;

import java.util.Scanner;
public class Moto {
    public String nome;
    public String modelo;
    public int peso;
    public int cilindrada;
    public int velocidade = 0;

    public Moto lerMoto() {
        Scanner scan = new Scanner(System.in);
        Moto moto = new Moto();

        System.out.println("Informe o nome: ");
        moto.nome = scan.next();
        System.out.println("Informe o modelo da moto: ");
        moto.modelo = scan.next();
        System.out.println("Informe a cilindrada: ");
        moto.cilindrada = scan.nextInt();
        System.out.println("Informe o peso: ");
        moto.peso = scan.nextInt();

        return moto;
    }

    public void imprimir(Moto[] vetMoto) {
        for(Moto moto: vetMoto) {
            System.out.println(moto.nome);
            System.out.println(moto.modelo);
            System.out.println();
        }
    }



    public void Acelerar(Moto[] vetMoto) {
        for(Moto moto : vetMoto) {
            moto.velocidade += 5;
            moto.velocidade = (int)(moto.velocidade * (0.15 * moto.cilindrada) - ( moto.peso / 300));

            System.out.println(moto.modelo + ": " + moto.velocidade + " KM/h");
        }
    }

    public void Frear(Moto[] vetMoto)
    {
        for(Moto moto : vetMoto) {
            System.out.println(moto.modelo + ": " + moto.velocidade + " KM/h");
        }
    }
}
