package br.unitins.trabalho.classes;

import java.util.Scanner;



public class Carro {

    public String nome;
    public String cor;
    public String modelo;
    public String peso;
    public String cilindrada;

    public float velocidade = 0;


    public Carro lerCarro()
    {
        Scanner scan = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.println("Informe o nome do piloto: ");
        carro.nome = scan.next();
        System.out.println("Informe o modelo do carro: ");
        carro.modelo = scan.next();
        System.out.println("Informe a cor do carro: ");
        carro.cor = scan.next();
        System.out.println("Informe o peso do carro: ");
        carro.peso = scan.next();
        System.out.println("Informe a cilindrada: ");
        carro.cilindrada = scan.next();

        return carro;

    }
        public void imprimir(Carro[] vetCarro){
            for (Carro carro : vetCarro){
                System.out.println(carro.nome);
                System.out.println(carro.cor);
                System.out.println(carro.modelo);
                System.out.println();
            }
        }

}



