/*package br.unitins.trabalho.corrida;

import br.unitins.trabalho.classes.Carro;

public class Corrida {

    public String resultado;
        public static void corridaCarro(Carro[] vetCarro)
        {
            Corrida[] vetCorrida = new Corrida[vetCarro.length];

            for(int segundo = 1; segundo <= 20; segundo++) {
                System.out.println("Segundo " + segundo + " :");
                for(Carro carro : vetCarro) {
                   if(segundo == 6 || segundo == 11 || segundo == 15)
                   {
                       carro.velocidade -= carro.velocidade * 0.25;
                   }

                }
            }
        }

   /* public Veiculo acelerar() {
        carro.velocidade += 5;
        carro.velocidade += (carro.velocidade * 0.15) - (carro.peso / 300);
    }

    public void frear() {
        carro.velocidade -= carro.velocidade * 0.25;
    }

    public String toString() {
        return carro + " - Velocidade: " + carro.velocidade + " km/h";
    }

}*/


