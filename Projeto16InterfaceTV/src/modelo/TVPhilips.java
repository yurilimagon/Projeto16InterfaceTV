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
public class TVPhilips extends TV implements IControleRemoto{
    //ATRIBUTO CONSTANTE
    public final String MODELO = "PHILIPS";
    
    //CONSTRUTOR
    public TVPhilips(int tamanho){
        super(tamanho);
    }
    
    //MÉTODOS ASSINADOS DA INTERFACE
    @Override
    public void mudarCanal(int canal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aumentarVolume(int volume) {
        super.setVolume(volume++);
    }

    @Override
    public void diminuirVolume(int volume) {
        super.setVolume(volume--);
    }

    @Override
    public boolean ligar() {
        super.setLigada(true);
        return true;
    }

    @Override
    public boolean desligar() {
        super.setLigada(false);
        return false;
    }
}
