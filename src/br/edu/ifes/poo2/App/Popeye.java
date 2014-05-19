/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.App;

import br.edu.ifes.poo2.CCI.FabricaNavios;
import br.edu.ifes.poo2.CDP.Navio;
import br.edu.ifes.poo2.CIH.Impressao;

/**
 *
 * @author Jania
 */
public class Popeye {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaNavios fabrica = FabricaNavios.getInstance();
        System.out.println(fabrica);
        FabricaNavios fabrica2 = FabricaNavios.getInstance();
        System.out.println(fabrica2);
        FabricaNavios fabrica3 = FabricaNavios.getInstance();
        System.out.println(fabrica3+"\n\n");
        
        
        Impressao impressora = new Impressao();
        Navio victoria = fabrica.contruir(FabricaNavios.Tipo.Grande);
        Navio vilavelha = fabrica.contruir(FabricaNavios.Tipo.Medio);
        Navio serra = fabrica.contruir(FabricaNavios.Tipo.Pequeno);
        
        System.out.println(victoria);
        impressora.imprimirNavio("Victoria", victoria);
        
        System.out.println(serra);
        impressora.imprimirNavio("Serra", serra);
        
        System.out.println(vilavelha);
        impressora.imprimirNavio("Vila Velha", vilavelha);
        
        
        
    }
    
}



















