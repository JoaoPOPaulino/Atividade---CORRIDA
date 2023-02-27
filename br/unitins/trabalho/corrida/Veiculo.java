package br.unitins.trabalho.corrida;

import br.unitins.trabalho.classes.Carro;

import java.util.Scanner;

public class Veiculo {


        public Veiculo acelerar() {
        carro.velocidade += 5;
        carro.velocidade += (carro.velocidade * 0.15) - (carro.peso / 300);
    }

        public void frear() {
        carro.velocidade -= carro.velocidade * 0.25;
    }

        public String toString() {
        return carro + " - Velocidade: " + carro.velocidade + " km/h";
    }


    }




}