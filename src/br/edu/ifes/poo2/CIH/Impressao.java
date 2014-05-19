/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.CIH;

import br.edu.ifes.poo2.CDP.Navio;

/**
 *
 * @author Jania
 */
public class Impressao {

    public void imprimirNavio(String nome, Navio navio) {
        System.out.println("Navio: " + nome);
        int cont = 0;
        System.out.println("Motor 1: " + navio.getMotores().get(0).getPotencia());
        if ((navio.getMotores().size() - 1) == 1) {
            System.out.println("Motor 2: " + navio.getMotores().get(1).getPotencia());
        }
        System.out.println("Botes: " + navio.getBotes().getQuantidade() + " de " + navio.getBotes().getCapacidade() + " pessoa(s)");
        System.out.println("");
    }
}
