package br.unitins.trabalho.classes;

import java.util.Scanner;

public class Carro {
    public String nome;
    public String modelo;
    public int peso;
    public int cilindrada;
    public int velocidade = 0;

    public Carro lerCarro() {
        Scanner scan = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.println("Informe o nome: ");
        carro.nome = scan.next();
        System.out.println("Informe o modelo do carro: ");
        carro.modelo = scan.next();
        System.out.println("Informe a cilindrada: ");
        carro.cilindrada = scan.nextInt();
        System.out.println("Informe o peso: ");
        carro.peso = scan.nextInt();
        System.out.println();

        return carro;
    }

    public void imprimir(Carro[] vetCarro) {
        for(Carro carro : vetCarro) {
            System.out.println(carro.nome);
            System.out.println(carro.modelo);
            System.out.println();
        }
    }

    public void Acelerar(Carro[] vetCarro) {
        for(Carro carro : vetCarro) {
            carro.velocidade += 5;
            carro.velocidade = (int)(carro.velocidade * (0.15 * carro.cilindrada) - ( carro.peso / 300));

            System.out.println(carro.modelo + ": " + carro.velocidade + " KM/h");
        }
    }

    public void Frear(Carro[] vetCarro)
    {
        for(Carro carro : vetCarro) {
            System.out.println(carro.modelo + ": " + carro.velocidade + " KM/h");
        }
    }
}



