package br.unitins.trabalho.classes;

import java.util.Scanner;
public class Moto {

    public String nome;
    public String cor;
    public String modelo;
    public String peso;
    public String cilindrada;

    public float velocidade = 0;


    public Moto lerMoto()
    {
        Scanner scan = new Scanner(System.in);
        Moto moto = new Moto();

        System.out.println("Informe o nome do piloto: ");
        moto.nome = scan.next();
        System.out.println("Informe o modelo do carro: ");
        moto.modelo = scan.next();
        System.out.println("Informe a cor do carro: ");
        moto.cor = scan.next();
        System.out.println("Informe o peso do carro: ");
        moto.peso = scan.next();
        System.out.println("Informe a cilindrada: ");
        moto.cilindrada = scan.next();

        return moto;

    }

    public void imprimir(Moto[] vetMoto){
        for (Moto moto : vetMoto){
            System.out.println(moto.nome);
            System.out.println(moto.cor);
            System.out.println(moto.modelo);
            System.out.println();
        }
    }


}
