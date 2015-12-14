package br.com.sweda.sistema.cupom.fiscal.teste;

import java.util.Random;

import br.com.sweda.sistema.cupom.fiscal.integration.sat.SAT;

public class Teste {

	public static void main(String[] args) {
        Random gerador = new Random();

        int numeroSessao = gerador.nextInt();

        String retorno = SAT.INSTANCE.ConsultarSAT(numeroSessao);

        System.out.println(retorno);
	}
}
