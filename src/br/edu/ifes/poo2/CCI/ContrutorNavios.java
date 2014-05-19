/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.CCI;

import br.edu.ifes.poo2.CDP.Navio;

/**
 *
 * @author Jania
 */
public class ContrutorNavios {
    
    private Navio navioEstaleiro;

    public ContrutorNavios(Navio navio) {
        navioEstaleiro = navio;
    }

    public void construirBotes() {
        System.out.println("construindo botes");
    }

    public void construirCabines() {
        System.out.println("construindo cabine pessoas");
        System.out.println("construindo cabine comandate");
    }

    public void ConstruirMotores() {
        System.out.println("construindo motores");
    }

    public Navio getNavioEstaleiro() {
        return navioEstaleiro;
    }
;

}
