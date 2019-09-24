/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public class TV {
    //ATRIBUTOS
    private int tamanho;
    private int volume;
    private int canal;
    private boolean ligada;
    
    //CONSTRUTOR
    //"CHEIO"
    public TV(int tamanho){
        this.tamanho = tamanho;
        this.volume = 0;
        this.canal = 0;
        this.ligada = false;
    }
    
    //VAZIO
    public TV() {
    }
    
    //GETTERS E SETTERS
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    
}
