/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.CDP;

/**
 *
 * @author Jania
 */
public class Bote {
    private int capacidade;
    private int quantidade;

    public Bote(int capacidade, int quantidade) {
        this.capacidade = capacidade;
        this.quantidade = quantidade;
    }

    
    
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
