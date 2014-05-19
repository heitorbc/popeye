/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.CCI;

import br.edu.ifes.poo2.CDP.Bote;
import br.edu.ifes.poo2.CDP.Cabine;
import br.edu.ifes.poo2.CDP.Motor;
import br.edu.ifes.poo2.CDP.Navio;
import java.util.ArrayList;

/**
 *
 * @author Jania
 */
public class FabricaNavios {

    private static FabricaNavios instance;
    public enum Tipo {

        Grande, Medio, Pequeno
    };

    public synchronized Navio contruir(Tipo tipo) {
        Navio n = selecionaNavio(tipo);
        return n;
    }

    public synchronized Navio selecionaNavio(Tipo tipo) {
        ArrayList<Motor> motores = new ArrayList<Motor>();
        if (tipo == Tipo.Pequeno) {
            motores.add(new Motor(100));
            motores.add(new Motor(100));
            return new Navio(new Bote(1, 5), new Cabine(1, 10), new Cabine(1, 1), motores);
        } else if (tipo == Tipo.Medio) {
            motores.add(new Motor(400));
            return new Navio(new Bote(4, 100), new Cabine(2, 100), new Cabine(1, 1), motores);
        } else {//Tipo Grande
            motores.add(new Motor(7000));
            motores.add(new Motor(7000));
            return new Navio(new Bote(4, 500), new Cabine(5, 1000), new Cabine(1, 1), motores);
        }
    }
    
    
    public synchronized static FabricaNavios getInstance(){
        if(instance==null){
            instance = new FabricaNavios();
        }
        return instance;
    }
}
