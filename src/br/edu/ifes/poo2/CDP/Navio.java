/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.CDP;

import java.util.ArrayList;

/**
 *
 * @author Jania
 */
public class Navio {

    protected Bote botes;
    protected Cabine cabines;
    protected Cabine comandante;
    protected ArrayList<Motor> motores;
    
    
    public Navio getNavio() {
        return this;
    }

    public Navio(Bote botes, Cabine cabines, Cabine comandante, ArrayList<Motor> motores) {
        this.botes = botes;
        this.cabines = cabines;
        this.comandante = comandante;
        this.motores = motores;
    }

    public Bote getBotes() {
        return botes;
    }

    public void setBotes(Bote botes) {
        this.botes = botes;
    }

    public Cabine getCabines() {
        return cabines;
    }

    public void setCabines(Cabine cabines) {
        this.cabines = cabines;
    }

    public Cabine getComandante() {
        return comandante;
    }

    public void setComandante(Cabine comandante) {
        this.comandante = comandante;
    }

    public ArrayList<Motor> getMotores() {
        return motores;
    }

    public void setMotores(ArrayList<Motor> motores) {
        this.motores = motores;
    }
    
    
}
